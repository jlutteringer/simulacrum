import React, {Component} from 'react';
import GameActions from 'actions/GameActions';
import ClientActions from 'actions/ClientActions';
import GameMediator from 'actions/GameMediatorActions';

class PhaserGame extends Component {
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
