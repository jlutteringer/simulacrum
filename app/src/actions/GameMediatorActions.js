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

  localClick(x,y) {
    this.client.localClick(x,y)
  }
}