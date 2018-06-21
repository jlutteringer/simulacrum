import React, {Component} from 'react'
import PropTypes from "prop-types";
import {GoogleLogin} from "react-google-login";
import { withStyles } from '@material-ui/core/styles';

const styles = (themes) => ({
  root: {
    display: 'flex',
    justifyContent: 'center'
  }
});

class LoginBody extends Component {
  static propTypes = {
    loginSuccess : PropTypes.func.isRequired,
    loginFailure : PropTypes.func.isRequired
  };

  render() {
    const {classes, isLoggedIn, isLoading, loginSuccess, loginFailure} = this.props

    if(isLoggedIn || isLoading) {
      return null
    }

    /*TODO Style the Google Login button according to documentation*/
    return (
      <div className={classes.root}>
        <GoogleLogin
            clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
            onSuccess={loginSuccess}
            onFailure={loginFailure}
        />
      </div>
    );
  }
}

export default withStyles(styles)(LoginBody)