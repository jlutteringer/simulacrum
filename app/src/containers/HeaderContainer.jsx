import {connect} from "react-redux";
import Header from "components/layout/Header";
import * as UserActions from "actions/UserActions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.isLoggedIn,
    isLoading: state.user.isLoading,
    notifications: state.user.notifications,
    isLoadingNotifications: state.user.isLoadingNotifications
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    handleLogoutClick: () => {
      dispatch(UserActions.logoutUser())
    },
    handleMessageClick: () => {
      // dispatch(UserActions.logoutUser())
    },
    loadNotifications: () => {
      dispatch(UserActions.loadNotifications())
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Header);