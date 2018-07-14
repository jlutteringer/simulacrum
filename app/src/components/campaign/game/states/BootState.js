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

    this.game.load.tilemap("mapmaker", "/assets/test.json", null, Phaser.Tilemap.TILED_JSON);
    this.game.load.image("grass_biome", "/assets/overworld_tileset_grass.png", 16, 16);
  }

  render() {
    this.state.start("map");
  }

  fontsLoaded = () => {
    this.fontsReady = true;
  };
}
