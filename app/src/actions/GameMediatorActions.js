export default class ClientActions {

  setGame(game) {
    this.game = game
  }

  setClient(client) {
    this.client = client
  }

  addNewPlayer(player) {
    this.game.addNewPlayer(player)
  }

  localLongPress(x,y) {
    this.client.localLongPress(x,y)
  }
}