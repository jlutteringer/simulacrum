import {connect} from "react-redux";
import {Header} from "../components/Header";
import * as UserActions from "../actions/user-actions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.status === "LOGGED IN",
    isLoading: state.user.status === "LOADING"
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loginSuccess: (googleUser) => {
      dispatch(UserActions.login(googleUser));
    },
    loginFailure: (error) => {
      console.log("User decided not to login")
      console.log(error)
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Header);