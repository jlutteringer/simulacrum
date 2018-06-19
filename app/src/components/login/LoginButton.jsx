import React from 'react'
import PropTypes from "prop-types";
import Button from "@material-ui/core/es/Button/Button";
import {Link} from "react-router-dom";

export default class LoginButton extends React.Component {
  static propTypes = {
    isLoggedIn: PropTypes.bool.isRequired,
    isLoading: PropTypes.bool.isRequired,
  };

  constructor(props) {
    super(props)
    this.state = {
      loginModalOpen : false,
      logoutModalOpen : false
    }
    this.handleLoginClick = this.handleLoginClick.bind(this);
    this.handleLogoutClick = this.handleLogoutClick.bind(this);
  }

  handleLoginClick() {
    this.setState(prevState => ({
      loginModalOpen: !prevState.loginModalOpen
    }))
  }

  handleLogoutClick() {
    this.setState(prevState => ({
      logoutModalOpen: !prevState.logoutModalOpen
    }))
  }

  render() {
    return (
        <div>
          {!this.props.isLoggedIn && !this.props.isLoading &&
          <Button onClick={this.handleLoginClick} color={"inherit"} ><Link to="/login">Login</Link></Button>}
          {this.props.isLoggedIn &&
          <Button onClick={this.handleLoginClick} color={"inherit"}>Logout</Button>}
        </div>
    );
  }
}
