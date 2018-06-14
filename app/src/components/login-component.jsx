import React from 'react'
import {GoogleLogin} from 'react-google-login';
import UserActions from "../actions/user-actions";
import {connect} from "react-redux";

class LoginComponent extends React.Component {
  loginSuccess = (googleUser) => {
    this.props.dispatch(UserActions.login(googleUser));
  }

  loginFailure = (response) => {
    console.log(response);
  }

  render() {
    return <GoogleLogin
        clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
        buttonText="Login"
        onSuccess={this.loginSuccess}
        onFailure={this.loginFailure}
    />
  }
}

export default connect()(LoginComponent)