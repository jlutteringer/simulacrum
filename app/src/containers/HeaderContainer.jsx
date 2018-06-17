import {connect} from "react-redux";
import {Header} from "../components/Header";
import _ from "lodash";
import * as UserActions from "../actions/user-actions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: !_.isEmpty(state.user)
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