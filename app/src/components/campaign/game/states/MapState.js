import Phaser from "components/campaign/game/Phaser";

export default class extends Phaser.State {
  constructor(mediator, config, userId) {
    super();

    this.config = config;
    this.mediator = mediator;

    this.borderOffset = 32;
    this.squareLength = 32;
  }

  init() {
    this.game.stage.backgroundColor = "#FFFFFF";
    this.fontsReady = false;
  }

  preload() {

  }

  create() {
    this.playerMap = {};

    // create a group for our graphics
    this.group = this.add.group();

    let currentScene = this.config.sceneConfigs.find((scene) => {
      return scene.sceneId === this.config.gameConfig.currentSceneId;
    });

    // this.game.stage.backgroundColor = "#77c6ff";
    this.game.world.setBounds(0, 0,
        this.borderOffset * 2 + this.squareLength * currentScene.width,
        this.borderOffset * 2 + this.squareLength * currentScene.height);

    // this.map = this.game.add.tilemap("mapmaker");
    this.map = this.game.add.tilemap();
    this.tileset = this.map.addTilesetImage("grass_biome");

    // TODO create the current scene
    this.backgroundLayer = this.map.create("scene-" + currentScene.sceneId,
        currentScene.width, currentScene.height, 32, 32);
    this.backgroundLayer.resizeWorld();

    this.currentLayer = this.backgroundLayer;
    this.currentTile = 0;

    this.createTileSelector();

    this.drawGrid(this.group, currentScene);
  }

  drawGrid(group, currentScene) {
    let grid = this.game.add.graphics(); // adds to the world stage
    grid.beginFill(0x29aa2e);
    grid.lineStyle(2, 0x444444, 1);
    for (let j = 0; j < currentScene.height; j++) {
      for (let i = 0; i < currentScene.width; i++) {
        grid.drawRect(i * this.squareLength + this.borderOffset,
            j * this.squareLength + this.borderOffset,
            this.squareLength,
            this.squareLength);
      }
    }

    grid.inputEnabled = true;
    grid.input.enableDrag();
    grid.events.onDragStart.add(this.gridOnDragStart, this);
    grid.events.onDragUpdate.add(this.gridOnDragUpdate, this);
    grid.events.onDragStop.add(this.gridOnDragStop, this);
    grid.events.onInputUp.add(this.gridOnInputUp, this);
    group.add(grid); // moves from world stage to group as a child
  }

  update() {

  }

  gridOnDragStart = (grid, pointer, startX, startY) => {
    this.gridPrevX = startX;
    this.gridPrevY = startY;
  };

  gridOnDragUpdate = (grid, startPointer, nextX, nextY, snapPointer, fromStart) => {
    // move the camera by the amount the mouse has moved since last update
    if (nextX !== 0 || nextY !== 0) {
      this.camera.x -= nextX;
      this.camera.y -= nextY;
      grid.reset(0, 0);
    }
  };

  gridOnDragStop = (grid, pointer) => {

  };

  onHold(inputManager, position) {
    // TODO what else to do on a long press
    this.mediator.localLongPress(position.x, position.y);
  }

  gridOnInputUp = (grid, pointer, isOver) => {
    // TODO find the closest tile to position
    // TODO check if a tile already exists in the tile
    // TODO replace the tile if different than currently expected
    if ((pointer.timeDown + this.game.input.tapRate) > this.game.time.time) {
      // Is the creator changing the tile type?
      this.marker.x = this.currentLayer.getTileX(this.game.input.activePointer.worldX) * 32;
      this.marker.y = this.currentLayer.getTileY(this.game.input.activePointer.worldY) * 32;

      this.map.putTile(this.currentTile,
          this.currentLayer.getTileX(this.marker.x),
          this.currentLayer.getTileY(this.marker.y), this.currentLayer);
        // map.fill(currentTile, currentLayer.getTileX(marker.x), currentLayer.getTileY(marker.y), 4, 4, currentLayer);
    } else if ((pointer.timeDown + this.game.input.tapRate) > this.game.time.time) {
      // What to do with double tap?
    }
  };

  createTileSelector() {
    //  Our tile selection window
    let tileSelector = this.game.add.group();

    let tileSelectorBackground = this.game.make.graphics();
    tileSelectorBackground.beginFill(0x000000, 0.5);
    tileSelectorBackground.drawRect(0, 0, 800, 34);
    tileSelectorBackground.endFill();

    tileSelector.add(tileSelectorBackground);

    // TODO update color palette
    let tileStrip = tileSelector.create(1, 1, "ground_1x1");
    tileStrip.inputEnabled = true;
    tileStrip.events.onInputDown.add(this.pickTile, this);

    tileSelector.fixedToCamera = true;

    //  Our painting marker
    this.marker = this.game.add.graphics();
    this.marker.lineStyle(2, 0x000000, 1);
    this.marker.drawRect(0, 0, 32, 32);
  }

  pickTile(sprite, pointer) {
    this.currentTile = this.game.math.snapToFloor(pointer.x, 32) / 32;
  }
}
