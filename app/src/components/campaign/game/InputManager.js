import Phaser from "components/campaign/game/Phaser";

// TODO handle pinch to zoom
export default class InputManager {
  constructor(game) {
    this.game = game;

    this.dragDispatched = false;
    this.holdDispatched = false;

    this.isTouching = false;
    this.isHolding = false;

    this.onTap = new Phaser.Signal();
    this.onHold = new Phaser.Signal();
    this.onDrag = new Phaser.Signal();
    this.onCursor = new Phaser.Signal();

    this.TIMES = {
      HOLD: 150,
      DRAG: 250,
    };

    this.CURSOR_DIRECTION = {
      UP: 0,
      RIGHT: 1,
      DOWN: 2,
      LEFT: 3,
    };

    this.cursors = this.game.input.keyboard.createCursorKeys();
    this.game.input.mouse.capture = true;
  }

  update() {
    let distance = Phaser.Point.distance(this.game.input.activePointer.position,
        this.game.input.activePointer.positionDown);
    let duration = this.game.input.activePointer.duration;

    this.updateDrag(distance, duration, this.game.input.activePointer.positionDown,
        this.game.input.activePointer.position);
    this.updateTouch(distance, duration);
    this.updateCursors();
  }

  updateCursors() {
    if (this.cursors.up.isDown) {
      this.onCursor.dispatch(this, this.CURSOR_DIRECTION.UP);
    } else if (this.cursors.down.isDown) {
      this.onCursor.dispatch(this, this.CURSOR_DIRECTION.DOWN);
    } else if (this.cursors.left.isDown) {
      this.onCursor.dispatch(this, this.CURSOR_DIRECTION.LEFT);
    } else if (this.cursors.right.isDown) {
      this.onCursor.dispatch(this, this.CURSOR_DIRECTION.RIGHT);
    }
  }

  updateDrag(distance, duration, positionDown, currentPosition) {
    if (duration === -1) {
      this.previousDragPoint = null;
    } else {
      if (!this.previousDragPoint) {
        this.previousDragPoint = positionDown.clone();
      }

      if (Phaser.Point.distance(this.previousDragPoint, currentPosition) > 10) {
        this.onDrag.dispatch(this, this.previousDragPoint, currentPosition);
        this.previousDragPoint = currentPosition.clone();
      }
    }
  }

  updateTouch(distance, duration) {
    let positionDown = this.game.input.activePointer.positionDown;

    if (duration === -1) {
      if (this.isTouching) {
        this.onTap.dispatch(this, positionDown);
      }

      this.isTouching = false;
      this.isHolding = false;
      this.holdDispatched = false;
    } else if (distance < 10) {
      if (duration < this.TIMES.HOLD) {
        this.isTouching = true;
      } else {
        this.isTouching = false;
        this.isHolding = true;

        if (!this.holdDispatched) {
          this.holdDispatched = true;

          this.onHold.dispatch(this, positionDown);
        }
      }
    } else {
      this.isTouching = false;
      this.isHolding = false;
    }
  }
}
