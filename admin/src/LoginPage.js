import React, { Component } from 'react';
import { connect } from 'react-redux';
import { userLogin } from 'react-admin';
import {GoogleLogin} from "react-google-login";

class LoginPage extends Component {
  constructor(props) {
    super(props)

    this.loginSuccess = this.loginSuccess.bind(this)
    this.loginFailure = this.loginFailure.bind(this)
  }

  loginSuccess(googleUser) {
    this.props.userLogin(googleUser);
  }
  loginFailure(error) {
    console.log("User decided not to login")
    console.log(error)
  }

  render() {
    return (
        <GoogleLogin
            clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
            onSuccess={this.loginSuccess}
            onFailure={this.loginFailure}
        />
    );
  }
};

export default connect(undefined, { userLogin })(LoginPage);
