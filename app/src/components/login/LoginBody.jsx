import React, {Component} from "react";
import PropTypes from "prop-types";
import {GoogleLogin} from "react-google-login";
import {withStyles} from "@material-ui/core/styles";
import {Redirect} from "react-router-dom";
import CardContent from "@material-ui/core/CardContent";
import Card from "@material-ui/core/Card";
import Typography from "@material-ui/core/Typography";

const styles = (theme) => ({
  root: {
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",

  },
  row: {
  },
  card: {
    display: "flex",
    minWidth: "25%",
  },
  content: {
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
  },
  appLogo: {
    height: 75,
    display: "block",
  },
});

class LoginBody extends Component {
  static propTypes = {
    isLoggedIn: false,
    isLoading: true,
    loginSuccess: PropTypes.func.isRequired,
    loginFailure: PropTypes.func.isRequired,
    classes: PropTypes.object.isRequired,
  };

  state = {};

  static getDerivedStateFromProps(props, currentState) {
    if (!currentState || !currentState.location || currentState.location.state !== props.location.state) {
      return {
        location: {
          state: props.location.state,
        },
      };
    }
    return null;
  }

  render() {
    const {classes, isLoggedIn, isLoading, loginSuccess, loginFailure} = this.props;

    if (isLoading) {
      return null;
    }
    if (isLoggedIn) {
      const {from} = this.state.location.state || {from: {pathname: "/"}};
      return <Redirect to={from} />;
    }

    /* TODO Style the Google Login button according to documentation*/
    return (
        <div className={classes.root}>
          <div className={classes.row}>
            <Card className={classes.card}>
              <CardContent className={classes.content}>
                <div className={classes.row}>
                  <img src={"/logo.png"} className={classes.appLogo} alt="logo"/>
                </div>
                <div className={classes.row}>
                  <Typography variant="headline">Login with your Google account</Typography>
                </div>
                <GoogleLogin
                    clientId="1071523839085-1t6k75k97n5sec0osdkn7av98qoffael.apps.googleusercontent.com"
                    onSuccess={loginSuccess}
                    onFailure={loginFailure}
                />
              </CardContent>
            </Card>
          </div>
        </div>
    );
  }
}

export default withStyles(styles)(LoginBody);
