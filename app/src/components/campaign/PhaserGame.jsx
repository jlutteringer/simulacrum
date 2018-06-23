import React, {Component} from 'react'
import Phaser from 'components/campaign/Phaser';

class PhaserGame extends Component {
  preload(){
    // load all of the campaign assets
  }

  create() {
    // create a group for our graphics
    let group = this.add.group();

    let config = this.config;

    let currentScene = config.sceneConfigs.find((scene) => {return scene.sceneId === config.gameConfig.currentSceneId})

    let borderOffset = 50
    let squareLength = 50

    this.game.stage.backgroundColor = "#77c6ff"
    this.game.world.setBounds(0, 0, borderOffset * 2 + squareLength * currentScene.width, borderOffset * 2 + squareLength * currentScene.height);

    console.log(`${borderOffset * 2 + squareLength * currentScene.width}, ${borderOffset * 2 + squareLength * currentScene.height}`)
    for (let j = 0; j < currentScene.height; j++) {
      for (let i = 0; i < currentScene.width; i++) {
        // created on the world
        let graphics = this.game.add.graphics(); // adds to the world stage
        graphics.lineStyle(2, 0xFFFFFF, 1);
        graphics.drawRect(i * 50 + borderOffset, j * 50 + borderOffset, 50, 50);
        group.add(graphics) // moves from world stage to group as a child
      }
    }

    this.cursors = this.game.input.keyboard.createCursorKeys();
    this.game.input.mouse.capture = true;
  }

  update(){
    if (this.cursors.up.isDown)
    {
      this.game.camera.y -= 4;
    }
    else if (this.cursors.down.isDown)
    {
      this.game.camera.y += 4;
    }

    if (this.cursors.left.isDown)
    {
      this.game.camera.x -= 4;
    }
    else if (this.cursors.right.isDown)
    {
      this.game.camera.x += 4;
    }

    if (this.game.input.activePointer.isDown) {
      if (this.game.origDragPoint) {
        // move the camera by the amount the mouse has moved since last update
        this.game.camera.x += this.game.origDragPoint.x - this.game.input.activePointer.position.x;
        this.game.camera.y += this.game.origDragPoint.y - this.game.input.activePointer.position.y;	}
        // set new drag origin to current position
        this.game.origDragPoint = this.game.input.activePointer.position.clone();
    } else {
      this.game.origDragPoint = null;
    }
  }

  renderGame(){

  }

  componentDidMount() {
    console.log(this.props.campaign)
    this.game = new Phaser.Game(800, 600, Phaser.CANVAS, "phaser-container",
        {
          preload: this.preload,
          create: this.create,
          update: this.update,
          render: this.renderGame,
          config: {...this.props.campaign}
        }
    );
  }

  shouldComponentUpdate(nextProps, nextState) {
    return false;
  }

  render() {
    return (
        <div className="phaserContainer" id="phaser-container">
        </div>
    );
  }
}

export default PhaserGame