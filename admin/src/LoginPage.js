import React, { Component } from 'react';
import { connect } from 'react-redux';
import { userLogin } from 'react-admin';
import { withStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import Avatar from '@material-ui/core/Avatar';
import LockOutline from '@material-ui/icons/LockOutline';
import {GoogleLogin} from "react-google-login";
const styles = function styles(theme) {
  return {
    root: {
      display: 'flex',
      flexDirection: 'column',
      minHeight: '100vh',
      height: '1px',
      alignItems: 'center',
      justifyContent: 'flex-start',
      background: 'url(https://source.unsplash.com/random/1600x900)',
      backgroundRepeat: 'no-repeat',
      backgroundSize: 'cover'
    },
    card: {
      minWidth: 300,
      marginTop: '6em'
    },
    avatar: {
      margin: '1em',
      display: 'flex',
      justifyContent: 'center'
    },
    icon: {
      backgroundColor: theme.palette.secondary[500]
    }
  };
};

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

  }

  render() {
    const {classes} = this.props

    return (
        <div className={classes.root}>
          <Card className={classes.card}>
            <div className={classes.avatar}>
              <Avatar className={classes.icon}>
                <LockOutline/>
              </Avatar>
            </div>
            <div className={classes.avatar}>
              <GoogleLogin
                  clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                  onSuccess={this.loginSuccess}
                  onFailure={this.loginFailure}
              />
            </div>
          </Card>
        </div>
    );
  }
};

export default withStyles(styles)(connect(undefined, { userLogin })(LoginPage));
