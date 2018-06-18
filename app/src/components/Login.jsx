import React from 'react'
import {GoogleLogin} from 'react-google-login';
import Button from "@material-ui/core/Button";

export default class Login extends React.Component {
  render() {
    return <GoogleLogin
        clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
        onSuccess={this.props.loginSuccess}
        onFailure={this.props.loginFailure}
        disabledStyle={false}
        // render={<Button color={"inherit"}>Login 2</Button>}
    />
  }
}
