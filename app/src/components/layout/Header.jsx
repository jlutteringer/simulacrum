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
import UserNotificationMenu from "components/layout/UserNotificationMenu";

const styles = (theme) => ({
  root: {
    flexGrow: 1,
    backgroundColor: '#090809',
    color: '#ffffff'
  },
  appTitle: {
    flex: 1,
    'a': {
      color: '#ffffff !important'
    }
  },
  appTitleLink: {
    color: '#ffffff !important'
  },
  menuButton: {
    marginLeft: -12,
  },
  appLogo: {
    height: 30
  },
  subMenu: {
    height: 400,
    display: 'block',
    position: 'relative',
    marginBottom: '20px',
    "&:after" : {
      content: '""',
      background: 'url(https://c1.staticflickr.com/5/4259/35185763616_dc78259d19_h.jpg)',
      backgroundRepeatX: 'no-repeat',
      backgroundSize: '100%',
      opacity: 0.4,
      top: 0,
      left: 0,
      bottom: 0,
      right: 0,
      position: 'absolute',
      zIndex: -1,
      boxShadow: '0px 2px 4px -1px rgba(0, 0, 0, 0.2), 0px 4px 5px 0px rgba(0, 0, 0, 0.14), 0px 1px 10px 0px rgba(0, 0, 0, 0.12)'
    }
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
        <React.Fragment>
      <AppBar className={classes.root} position="static" color="default">
        <Toolbar>
          <IconButton className={classes.menuButton} color="inherit" aria-label="Menu">
            <MenuIcon />
          </IconButton>
          <Link to={'/'}>
            <img src={'/logo.png'} className={classes.appLogo} alt="logo"/>
          </Link>
          <Typography variant="title" color="inherit" className={classes.appTitle}>
            <Link to={'/'} className={classes.appTitleLink}>Simulacrum</Link>
          </Typography>
          { this.props.isLoggedIn && <UserNotificationMenu {...this.props} /> }
          {
            !this.props.isLoggedIn && !this.props.isLoading &&
            <Button color={"inherit"}><Link to="/login">Login</Link></Button>
          }
          {
            this.props.isLoggedIn && <UserNavMenu {...this.props} />
          }
        </Toolbar>
      </AppBar>
          <div className={classes.subMenu}></div>

          </React.Fragment>
    );
  }
}

export default withStyles(styles)(Header);