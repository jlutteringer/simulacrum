import {connect} from "react-redux";
import _ from "lodash";
import PageRoutes from "../components/PageRoutes";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: !_.isEmpty(state.user)
  }
}

export default connect(mapStateToProps)(PageRoutes);