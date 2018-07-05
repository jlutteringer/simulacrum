import React, {Component} from "react";
import PropTypes from "prop-types";
import DialogTitle from "@material-ui/core/DialogTitle";
import Dialog from "@material-ui/core/Dialog";
import {withStyles} from "@material-ui/core/styles";
import Button from "@material-ui/core/Button";
import DialogActions from "@material-ui/core/DialogActions";
import DialogContent from "@material-ui/core/DialogContent";
import DialogContentText from "@material-ui/core/DialogContentText";

const styles = {

};

class InvitationNotificationDialog extends Component {
  static propTypes = {
    notification: PropTypes.object.isRequired,
    open: PropTypes.bool.isRequired,
    handleDeclineInvitation: PropTypes.func.isRequired,
    handleAcceptInvitation: PropTypes.func.isRequired,
    onClose: PropTypes.func.isRequired,
  };

  handleClose = () => {
    this.props.onClose(this.props.notification);
  };

  handleAcceptInvitation = (notification) => (event) => {
    this.props.handleAcceptInvitation(notification);
    this.handleClose();
  };

  handleDeclineInvitation = (notification) => (event) => {
    this.props.handleDeclineInvitation(notification);
    this.handleClose();
  };

  render() {
    const {notification, open} = this.props;

    return (
        <Dialog
            open={open}
            onClose={this.handleClose}
            aria-labelledby="responsive-dialog-title"
        >
          <DialogTitle id="responsive-dialog-title">{notification.title}</DialogTitle>
          <DialogContent>
            <DialogContentText>
              {notification.message}
            </DialogContentText>
          </DialogContent>
          <DialogActions>
            <Button onClick={this.handleAcceptInvitation(notification)} color="primary">
              Join
            </Button>
            <Button onClick={this.handleDeclineInvitation(notification)} color="primary">
              Decline
            </Button>
          </DialogActions>
        </Dialog>
    );
  }
}

export default withStyles(styles)(InvitationNotificationDialog);
