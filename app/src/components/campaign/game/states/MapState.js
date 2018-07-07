import Phaser from "components/campaign/game/Phaser";
import InputManager from "components/campaign/game/InputManager";

export default class extends Phaser.State {
  constructor(mediator, config, userId) {
    super();

    this.config = config;
    this.mediator = mediator;

    this.borderOffset = 50;
    this.squareLength = 50;
  }

  init() {
    this.game.stage.backgroundColor = "#FFFFFF";
    this.fontsReady = false;
  }

  preload() {
    // this.game.load.image("gametitle", "assets/sprites/gametitle.png");
  }

  create() {
    this.inputManager = new InputManager(this.game);
    this.inputManager.onDrag.add(this.onDrag, this);
    this.inputManager.onTap.add(this.onTap, this);
    this.inputManager.onHold.add(this.onHold, this);
    this.inputManager.onCursor.add(this.onCursor, this);

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
    group.add(grid); // moves from world stage to group as a child
  }

  update() {
    this.inputManager.update();
  }

  onCursor(inputManager, direction) {
    if (direction === inputManager.CURSOR_DIRECTION.UP) {
      this.camera.y -= 4;
    } else if (direction === inputManager.CURSOR_DIRECTION.DOWN) {
      this.camera.y += 4;
    } else if (direction === inputManager.CURSOR_DIRECTION.LEFT) {
      this.camera.x -= 4;
    } else if (direction === inputManager.CURSOR_DIRECTION.RIGHT) {
      this.camera.x += 4;
    }
  }

  onDrag(inputManager, previousPosition, currentPosition) {
    // move the camera by the amount the mouse has moved since last update
    // TODO check if holding a draggable object
    this.camera.x += previousPosition.x - currentPosition.x;
    this.camera.y += previousPosition.y - currentPosition.y;
  }

  onHold(inputManager, position) {
    // TODO what else to do on a long press
    this.mediator.localLongPress(position.x, position.y);
  }

  onTap(inputManager, position) {
    // TODO find the closest tile to position
    // TODO check if a tile already exists in the tile
    // TODO replace the tile if different than currently expected

    // Is the creator changing the tile type?
    let tile = this.game.add.graphics(); // adds to the world stage
    tile.beginFill(0xAAAAAA);
    tile.lineStyle(2, 0x444444, 1);
    tile.drawRect(this.borderOffset, this.borderOffset, this.squareLength, this.squareLength);
    // tile.drawRect(position.x * this.squareLength + this.borderOffset,
    //     position.y * this.squareLength + this.borderOffset,
    //     this.squareLength,
    //     this.squareLength);
    tile.endFill();
    // tile.inputEnabled = true;
    // tile.input.enableDrag();
    // tile.input.enableSnap(50, 50, true, true);
    this.group.add(tile); // moves from world stage to group as a child
  }
}
