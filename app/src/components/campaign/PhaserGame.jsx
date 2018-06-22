import React, {Component} from 'react'
import Phaser from 'components/campaign/Phaser';

class PhaserGame extends Component {
  create() {

  }

  update(){

  }

  componentDidMount() {
    this.game = new Phaser.Game(800, 400, 0, "phaser-container",
        {
          create: this.create,
          update: this.update
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