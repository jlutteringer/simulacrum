import SockJS from 'sockjs-client'
import Stomp from 'stompjs'

export default class ClientActions {

  constructor(mediator, config, token, userId) {
    this.config = config
    this.token = token
    this.campaignId = config.campaignId
    this.userId = userId
    this.mediator = mediator
    this.mediator.setClient(this)
  }

  connect() {
    const self = this

    this.socket = new SockJS(`/api/socket?access_token=${this.token}`);
    this.stompClient = Stomp.over(this.socket);
    this.stompClient.connect({}, function (frame) {
      self.isConnected = true
      self.stompClient.subscribe(`/api/topic/campaign/${self.campaignId}`, function (message) {
        const responseBody = JSON.parse(message.body)
        if(responseBody.userId !== self.userId) {
          self.processEvent(responseBody)
        }
      });
    });

    // TODO implement connection reconnect
  }

  disconnect() {
    if(this.isConnected) {
      this.stompClient.disconnect()
    }
  }

  // Local Events
  sendClientJoin() {
    this.send({
      'type':'join'
    })
  }

  localLongPress(x, y) {
    this.send({
      'type':'click',
      x,
      y
    })
  }

  send(action) {
    if(this.isConnected) {
      this.stompClient.send(`/api/app/campaign/${this.campaignId}`, {}, JSON.stringify(action))
    }
  }

  // Server events
  processEvent(event) {
    console.log(event)
  }
}