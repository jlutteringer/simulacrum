import React, { Component } from 'react';
import logo from '../../static/logo.png';
import Typography from "@material-ui/core/Typography";
import Toolbar from "@material-ui/core/Toolbar";
import AppBar from "@material-ui/core/AppBar";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from '@material-ui/icons/Menu';
import { withStyles } from '@material-ui/core/styles';
import PropTypes from "prop-types";
import Button from "@material-ui/core/es/Button/Button";
import {Link} from "react-router-dom";

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
    isLoggedIn: PropTypes.bool.isRequired,
    isLoading: PropTypes.bool.isRequired,
    handleLogoutClick: PropTypes.func.isRequired
  }

  render() {
    const { classes, handleLogoutClick } = this.props;

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
          {
            !this.props.isLoggedIn && !this.props.isLoading &&
            <Link to="/login"><Button color={"inherit"}>Login</Button></Link>
          }
          {
            this.props.isLoggedIn &&
            <Button onClick={handleLogoutClick} color={"inherit"}>Logout</Button>
          }
        </Toolbar>
      </AppBar>
    );
  }
}

export default withStyles(styles)(Header);