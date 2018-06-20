import {connect} from "react-redux";
import PageRoutes from "../components/PageRoutes";

const mapStateToProps = (state, ownProps) => {
  return {
    isLoggedIn: state.user.isLoggedIn
  }
}

export default connect(mapStateToProps)(PageRoutes);