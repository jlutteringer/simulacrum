import React, {Component} from 'react';
import PropTypes from 'prop-types';
import Menu from '@material-ui/core/es/Menu/Menu';
import MenuItem from '@material-ui/core/es/MenuItem/MenuItem';
import IconButton from '@material-ui/core/es/IconButton/IconButton';
import ListItemText from '@material-ui/core/es/ListItemText/ListItemText';
import Badge from '@material-ui/core/es/Badge/Badge';
import MailIcon from '@material-ui/icons/Mail';
import NotificationIcon from '@material-ui/icons/Notifications';
import CampaignIcon from '@material-ui/icons/Games';
import Divider from '@material-ui/core/es/Divider/Divider';
import ListItemIcon from '@material-ui/core/es/ListItemIcon/ListItemIcon';
import InvitationNotificationDialogContainer from 'components/layout/InvitationNotificationDialogContainer';
import MenuList from '@material-ui/core/es/MenuList/MenuList';
import _ from 'lodash';

class UserNotificationMenu extends Component {
  static propTypes = {
    markNotificationRead: PropTypes.func.isRequired,
    loadNotifications: PropTypes.func.isRequired,
  }

  constructor(props) {
    super(props);
    this.state = {
      anchorEl: null,
    };

    this.handleClick = this.handleClick.bind(this);
    this.handleMenuClose = this.handleMenuClose.bind(this);
    this.handleMessageClick = this.handleMessageClick.bind(this);
    this.clearOpenNotification = this.clearOpenNotification.bind(this);
  }

  handleClick(event) {
    this.setState({anchorEl: event.currentTarget});
  }

  handleMessageClick(notificationId) {
    this.setState({currentNotificationId: notificationId});
  }

  handleMenuClose() {
    this.setState({anchorEl: null});
  }

  clearOpenNotification() {
    this.props.markNotificationRead(this.state.currentNotificationId);
    this.setState({currentNotificationId: -1});
  }

  componentDidMount() {
    // TODO subscribe to notifications?
    this.props.loadNotifications();
  }

  renderNotificationIcon(notification) {
    if (notification.type === 'INVITATION') {
      return <CampaignIcon/>;
    }
    return <NotificationIcon/>;
  }

  renderNotification(notification, index) {
    return <React.Fragment key={notification.id}>
      <MenuItem onClick={() => this.handleMessageClick(notification.id)}>
        <ListItemIcon>
          {this.renderNotificationIcon(notification)}
        </ListItemIcon>
        {notification.read && <ListItemText secondary={notification.title}/>}
        {!notification.read && <ListItemText primary={notification.title}/>}
      </MenuItem>
      {this.renderNotificationDialog(notification)}
    </React.Fragment>;
  }

  renderNotificationDialog(notification) {
    if (notification.type === 'INVITATION') {
      return <InvitationNotificationDialogContainer
          notification={notification}
          selectedValue={this.state.currentNotificationId}
          open={this.state.currentNotificationId === notification.id}
          onClose={this.clearOpenNotification}
      />;
    }
    return null;
  }

  renderAllNotifications(notifications) {
    const readNotifications = notifications.filter((n) => {
      return n.read;
    });
    const unreadNotifications = notifications.filter((n) => {
      return !n.read;
    });

    return (
        <React.Fragment>
          {unreadNotifications.length > 0 && this.renderNotifications(unreadNotifications, 'Unread Notification')}
          {
            unreadNotifications.length > 0 && readNotifications.length > 0 &&
            <Divider />
          }
          {readNotifications.length > 0 && this.renderNotifications(readNotifications, 'Read Notification')}
        </React.Fragment>
    );
  }

  renderNotifications(notifications, header) {
    if (notifications.length < 1) {
      return null;
    }

    return (
        <MenuList>
          <MenuItem>
            <ListItemText>{header}</ListItemText>
          </MenuItem>
          {notifications.map((notification, index) => this.renderNotification(notification, index))}
        </MenuList>
    );
  }

  render() {
    const {anchorEl} = this.state;
    const {notifications} = this.props;

    const unreadMessages = _.sumBy(notifications, (n) => n.read ? 0 : 1);

    return (
        <React.Fragment>
          {
            notifications.length > 0 &&
            <React.Fragment>
              <IconButton
                aria-owns={anchorEl ? 'simple-menu' : null}
                aria-haspopup="true"
                onClick={this.handleClick}
                color={'inherit'}>
                {
                  unreadMessages === 0 &&
                  <MailIcon />
                }
                {
                  unreadMessages > 0 &&
                  <Badge badgeContent={unreadMessages} color="primary">
                    <MailIcon />
                  </Badge>
                }
              </IconButton>
              <Menu id="simple-menu"
                    anchorEl={anchorEl}
                    open={Boolean(anchorEl)}
                    onClose={this.handleMenuClose}
              >
                { this.renderAllNotifications(notifications) }
                {
                  notifications.length < 1 &&
                  <MenuItem>
                    <ListItemText>No Notifications</ListItemText>
                  </MenuItem>
                }
              </Menu>
            </React.Fragment>
          }
      </React.Fragment>
    );
  }
}

export default UserNotificationMenu;
