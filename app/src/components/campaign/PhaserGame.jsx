import React, {Component} from "react";
import PropTypes from "prop-types";
import GameActions from "actions/GameActions";
import ClientActions from "actions/ClientActions";
import GameMediator from "actions/GameMediatorActions";

class PhaserGame extends Component {
  static propTypes = {
    campaign: PropTypes.object.isRequired,
    token: PropTypes.string.isRequired,
    userId: PropTypes.string.isRequired,
  };

  componentDidMount() {
    this.gameMediator = new GameMediator();

    // Initialize
    this.game = new GameActions(this.gameMediator, this.props.campaign);
    this.client = new ClientActions(this.gameMediator, this.props.campaign, this.props.token, this.props.userId);

    this.game.start();
    this.client.connect();
  }

  componentWillUnmount() {
      this.client.disconnect();
      this.game.stop();
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

export default PhaserGame;
