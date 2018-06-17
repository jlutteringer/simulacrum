import React from 'react'
import {GoogleLogin} from 'react-google-login';

export default class Login extends React.Component {
  render() {
    return <GoogleLogin
        clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
        buttonText="Login"
        onSuccess={this.props.loginSuccess}
        onFailure={this.props.loginFailure}
    />
  }
}
