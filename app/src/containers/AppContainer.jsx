import {connect} from "react-redux";
import App from "../components/App";
import * as UserActions from "../actions/user-actions";

const mapStateToProps = (state, ownProps) => {
  return {
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadUserFromToken: () => {
      dispatch(UserActions.loadUserFromToken())
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(App);