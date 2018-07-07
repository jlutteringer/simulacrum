/**
 * Handles the communication between a client and game.
 * TODO Implement null checks / queueing of requests
 */
export default class ClientGameMediator {
  setGame(game) {
    this.game = game;
  }

  setClient(client) {
    this.client = client;
  }

  addNewPlayer(player) {
    this.game.addNewPlayer(player);
  }

  localLongPress(x, y) {
    this.client.localLongPress(x, y);
  }
}
