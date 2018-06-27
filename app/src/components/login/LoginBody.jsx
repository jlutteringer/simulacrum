import React, {Component} from 'react'
import PropTypes from "prop-types";
import {GoogleLogin} from "react-google-login";
import { withStyles } from '@material-ui/core/styles';
import {Redirect} from "react-router-dom";

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

  constructor(props) {
    super(props)

    this.state = {}
  }

  static getDerivedStateFromProps(props, current_state) {
    if (!current_state || !current_state.location || current_state.location.state !== props.location.state) {
      return {
        location: {
          state: props.location.state
        }
      }
    }
    return null
  }

  render() {
    const {classes, isLoggedIn, isLoading, loginSuccess, loginFailure} = this.props
    console.log(this.props)
    console.log(this.state)

    if(isLoading) {
      return null;
    }
    if(isLoggedIn) {
      const { from } = this.state.location.state || { from: { pathname: '/' } }
      return <Redirect to={from} />
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