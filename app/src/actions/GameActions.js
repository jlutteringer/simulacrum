import Phaser from 'components/campaign/Phaser';

export default class GameMediator {
  constructor(mediator, config) {
    this.game = new Phaser.Game(800, 600, Phaser.CANVAS, 'phaser-container');
    this.config = config;
    this.mediator = mediator;
    this.mediator.setGame(this);
  }

  start() {
    this.game.state.add('Game', this);
    this.game.state.start('Game');
  }

  init() {
    this.game.stage.disableVisibilityChange = true;
  }

  preload() {
    // load all of the campaign assets
  }

  render() {

  }

  create() {
    this.playerMap = {};

    // create a group for our graphics
    let group = this.add.group();

    let currentScene = this.config.sceneConfigs.find((scene) => {
      return scene.sceneId === this.config.gameConfig.currentSceneId;
    });

    let borderOffset = 50;
    let squareLength = 50;

    this.game.stage.backgroundColor = '#77c6ff';
    this.game.world.setBounds(0, 0,
        borderOffset * 2 + squareLength * currentScene.width,
        borderOffset * 2 + squareLength * currentScene.height);

    for (let j = 0; j < currentScene.height; j++) {
      for (let i = 0; i < currentScene.width; i++) {
        // created on the world
        let graphics = this.game.add.graphics(); // adds to the world stage
        graphics.lineStyle(2, 0xFFFFFF, 1);
        graphics.drawRect(i * 50 + borderOffset, j * 50 + borderOffset, 50, 50);
        group.add(graphics); // moves from world stage to group as a child
      }
    }

    this.cursors = this.game.input.keyboard.createCursorKeys();
    this.game.input.mouse.capture = true;
  }

  update() {
    if (this.cursors.up.isDown) {
      this.game.camera.y -= 4;
    } else if (this.cursors.down.isDown) {
      this.game.camera.y += 4;
    } else if (this.cursors.left.isDown) {
      this.game.camera.x -= 4;
    } else if (this.cursors.right.isDown) {
      this.game.camera.x += 4;
    }

    if (this.game.input.activePointer.isDown) {
      if (this.game.origDragPoint) {
        // move the camera by the amount the mouse has moved since last update
        this.game.camera.x += this.game.origDragPoint.x - this.game.input.activePointer.position.x;
        this.game.camera.y += this.game.origDragPoint.y - this.game.input.activePointer.position.y;
      }

      if (!this.game.shouldNotEmitLongPress) {
        if (!this.game.startMouseDown) {
          this.game.startMouseDown = this.game.time.now;
          this.game.startMousePos = this.game.input.activePointer.position.clone();
        } else if (Math.abs(this.game.startMousePos.x - this.game.input.activePointer.x) > 5
            || Math.abs(this.game.startMousePos.y - this.game.input.activePointer.y) > 5
        ) {
          this.game.shouldNotEmitLongPress = true;
        } else if (this.game.time.now > this.game.startMouseDown + 400) {
          this.localLongPress(this.game.input.activePointer.x, this.game.input.activePointer.y);
          this.game.shouldNotEmitLongPress = true;
        }
      }

      // set new drag origin to current position
      this.game.origDragPoint = this.game.input.activePointer.position.clone();
    } else if (this.game.startMouseDown) {
      this.game.shouldNotEmitLongPress = false;
      this.game.startMouseDown = false;
      this.game.origDragPoint = null;
    }
  }

  localLongPress(x, y) {
    this.mediator.localLongPress(x, y);
  }

  stop() {
    this.game.destroy();
  }
}
