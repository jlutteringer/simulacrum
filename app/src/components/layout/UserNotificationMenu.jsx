import React, { Component } from 'react';
import PropTypes from "prop-types";
import {Link} from "react-router-dom";
import Menu from "@material-ui/core/es/Menu/Menu";
import MenuItem from "@material-ui/core/es/MenuItem/MenuItem";
import IconButton from "@material-ui/core/es/IconButton/IconButton";
import ListItemText from "@material-ui/core/es/ListItemText/ListItemText";
import Badge from "@material-ui/core/es/Badge/Badge";
import MailIcon from '@material-ui/icons/Mail';

class UserNotificationMenu extends Component {
  static propTypes = {
    handleMessageClick: PropTypes.func.isRequired
  }

  constructor(props) {
    super(props)
    this.state = {
      anchorEl: null,
    };

    this.handleClick = this.handleClick.bind(this)
    this.handleClose = this.handleClose.bind(this)
  }

  handleClick = event => {
    // TODO handle case where no notifications
    this.setState({ anchorEl: event.currentTarget });
  };

  handleClose = () => {
    this.setState({ anchorEl: null });
  };

  componentWillMount() {
    // TODO subscribe to notifications?
    this.props.loadNotifications();
  }

  render() {
    const { anchorEl} = this.state;
    const { handleMessageClick, isLoadingNotifications, notifications } = this.props;

    if(isLoadingNotifications) {
      return null;
    }

    return (
        <React.Fragment>
          <IconButton

              aria-owns={anchorEl ? 'simple-menu' : null}
              aria-haspopup="true"
              onClick={this.handleClick}
              color={"inherit"}>
            {
              notifications.length > 0 &&
              <Badge badgeContent={notifications.length} color="primary">
                <MailIcon />
              </Badge>
            }
            {
              notifications.length === 0 &&
              <MailIcon />
            }
          </IconButton>
          <Menu id="simple-menu"
                anchorEl={anchorEl}
                open={Boolean(anchorEl)}
                onClose={this.handleClose}
          >
            {
              notifications.map(function (campaign, index) {
                return (
                    <MenuItem onClick={() => handleMessageClick}>
                      <ListItemText primary={"Notification!"}/>
                    </MenuItem>
                )
              })
            }
          </Menu>
        </React.Fragment>
    );
  }
}

export default UserNotificationMenu;