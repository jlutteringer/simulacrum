import Phaser from "components/campaign/game/Phaser";

export default class extends Phaser.State {
  init() {
    // this.stage.backgroundColor = "#EDEEC9";
    this.fontsReady = false;
  }

  preload() {
    this.game.scale.scaleMode = Phaser.ScaleManager.SHOW_ALL;
    this.game.scale.setScreenSize = true;
    this.game.scale.pageAlignHorizontally = true;
    this.game.scale.pageAlignVertically = true;
    // this.game.stage.backgroundColor = "#becbfb";
  }

  render() {
    this.state.start("map");
  }

  fontsLoaded = () => {
    this.fontsReady = true;
  };
}
