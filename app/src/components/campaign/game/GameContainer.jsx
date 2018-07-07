import React, {Component} from "react";
import PropTypes from "prop-types";
import Game from "components/campaign/game/Game";
import Client from "components/campaign/game/Client";
import GameMediator from "components/campaign/game/ClientGameMediator";

class GameContainer extends Component {
  static propTypes = {
    campaign: PropTypes.object.isRequired,
    token: PropTypes.string.isRequired,
    userId: PropTypes.string.isRequired,
  };

  componentDidMount() {
    // Setup
    this.gameMediator = new GameMediator();
    this.game = new Game(this.gameMediator, this.props.campaign, this.props.userId);
    this.client = new Client(this.gameMediator, this.props.campaign, this.props.token, this.props.userId);

    // Initialize
    this.game.start();
    // this.client.connect();

    window.addEventListener("resize", this.updateDimensions);
  }

  componentWillUnmount() {
    // this.client.disconnect();
    this.game.stop();

    window.removeEventListener("resize", this.updateDimensions);
  }

  updateDimensions = () => {
    const width = window.innerWidth;
    const height = window.innerHeight;
    this.game.resize(width, height);
  };

  shouldComponentUpdate(nextProps, nextState) {
    // We can modify the game's state here

    return false;
  }

  render() {
    return (
        <div className="phaserContainer" id="phaser-container">
        </div>
    );
  }
}

export default GameContainer;
