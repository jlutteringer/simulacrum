import {connect} from "react-redux";
import PageRoutes from "../components/PageRoutes";
import _ from "lodash";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: !_.isEmpty(state.user)
  }
}

export default connect(mapStateToProps)(PageRoutes);