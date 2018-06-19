import React, { Component } from 'react';
import logo from '../static/logo.png';
import Typography from "@material-ui/core/Typography";
import Toolbar from "@material-ui/core/Toolbar";
import AppBar from "@material-ui/core/AppBar";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from '@material-ui/icons/Menu';
import LoginButton from "./login/LoginButton";
import { withStyles } from '@material-ui/core/styles';

const styles = (theme) => ({
  root : {
    flexGrow: 1
  },
  appTitle : {
    flex: 1
  },
  menuButton : {
    marginLeft: -12,
  },
  appLogo : {
    height: 30
  }
});

class Header extends Component {
  static propTypes = {

  }

  render() {
    const { classes } = this.props;

    return (
      <AppBar className={classes.root}>
        <Toolbar>
          <IconButton className={classes.menuButton} color="inherit" aria-label="Menu">
            <MenuIcon />
          </IconButton>
          <img src={logo} className={classes.appLogo} alt="logo"/>
          <Typography variant="title" color="inherit" className={classes.appTitle}>
            Simulacrum
          </Typography>
          <LoginButton {...this.props} />
        </Toolbar>
      </AppBar>
    );
  }
}

export default withStyles(styles)(Header);