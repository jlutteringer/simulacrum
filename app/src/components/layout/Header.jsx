import React, { Component } from 'react';
import Typography from "@material-ui/core/Typography";
import Toolbar from "@material-ui/core/Toolbar";
import AppBar from "@material-ui/core/AppBar";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from '@material-ui/icons/Menu';
import { withStyles } from '@material-ui/core/styles';
import PropTypes from "prop-types";
import Button from "@material-ui/core/es/Button/Button";
import {Link} from "react-router-dom";
import UserNavMenu from "components/layout/UserNavMenu";

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
    const { classes } = this.props;

    return (
      <AppBar className={classes.root} position="static" color="default">
        <Toolbar>
          <IconButton className={classes.menuButton} color="inherit" aria-label="Menu">
            <MenuIcon />
          </IconButton>
          <Link to={'/'}>
            <img src={'/logo.png'} className={classes.appLogo} alt="logo"/>
          </Link>
          <Typography variant="title" color="inherit" className={classes.appTitle}>
            <Link to={'/'}>
              Simulacrum
            </Link>
          </Typography>
          {
            !this.props.isLoggedIn && !this.props.isLoading &&
            <Link to="/login"><Button color={"inherit"}>Login</Button></Link>
          }
          {
            this.props.isLoggedIn && <UserNavMenu {...this.props} />
          }
        </Toolbar>
      </AppBar>
    );
  }
}

export default withStyles(styles)(Header);