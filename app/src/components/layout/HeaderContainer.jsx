import {connect} from "react-redux";
import Header from "components/layout/Header";
import * as UserActions from "actions/UserActions";
import * as NotificationActions from "actions/NotificationActions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.isLoggedIn,
    isLoading: state.user.isLoading,
    notifications: state.notifications.instances,
    isLoadingNotifications: state.isLoadingNotifications,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    handleLogoutClick: () => {
      dispatch(UserActions.logoutUser());
    },
    loadNotifications: () => {
      dispatch(NotificationActions.loadNotifications());
    },
    markNotificationRead: (notificationId) => {
      dispatch(NotificationActions.markNotificationRead(notificationId));
    },
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(Header);
