import SockJS from "sockjs-client";
import Stomp from "stompjs";

export default class Client {
  constructor(mediator, config, token, userId) {
    this.config = config;
    this.token = token;
    this.campaignId = config.id;
    this.userId = userId;
    this.mediator = mediator;
    this.mediator.setClient(this);

    this.socket = new SockJS(`/api/ws?access_token=${this.token}`);
    this.stompClient = Stomp.over(this.socket);
  }

  connect() {
    const self = this;
    this.stompClient.connect({}, function(frame) {
      self.stompClient.subscribe(`/api/ws/topic/campaigns/${self.campaignId}`, function(message) {
        const responseBody = JSON.parse(message.body);
        if (responseBody.userId !== self.userId) {
          self.processEvent(responseBody);
        }
      });
    });

    // TODO implement connection reconnect
  }

  disconnect() {
    if (this.stompClient.connected) {
      this.stompClient.disconnect();
    }
  }

  // Local Events
  sendClientJoin() {
    this.send({
      "type": "join",
    });
  }

  localLongPress(x, y) {
    this.send({
      "type": "click",
      x,
      y,
    });
  }

  send(action) {
    if (this.stompClient.connected) {
      this.stompClient.send(`/api/ws/app/campaigns/${this.campaignId}`, {}, JSON.stringify(action));
    } else {
      // TODO What to do with actions that aren't sent? Queue?
    }
  }

  // Server events
  processEvent(event) {

  }
}
