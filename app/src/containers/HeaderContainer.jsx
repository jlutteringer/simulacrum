import {connect} from "react-redux";
import Header from "../components/Header";
import * as UserActions from "../actions/user-actions";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.status === "LOGGED IN",
    isLoading: state.user.status === "LOADING"
  }
}

const mapDispatchToProps = (dispatch) => {
  return {

  }
}

export default connect(mapStateToProps, mapDispatchToProps)(Header);