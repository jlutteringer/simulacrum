import {connect} from "react-redux";
import Header from "components/layout/Header";
import * as UserActions from "actions/UserActions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.isLoggedIn,
    isLoading: state.user.isLoading
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    handleLogoutClick: () => {
      dispatch(UserActions.logoutUser())
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Header);