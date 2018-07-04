import React, {Component} from 'react';
import Typography from '@material-ui/core/Typography';
import Toolbar from '@material-ui/core/Toolbar';
import AppBar from '@material-ui/core/AppBar';
import {withStyles} from '@material-ui/core/styles';
import PropTypes from 'prop-types';
import Button from '@material-ui/core/es/Button/Button';
import {Link} from 'react-router-dom';
import UserNavMenu from 'components/layout/UserNavMenu';
import UserNotificationMenu from 'components/layout/UserNotificationMenu';
import SubMenu from 'components/layout/SubMenu';

const styles = (theme) => ({
  appbar: {
    flexGrow: 1,
    backgroundColor: '#090809',
    color: '#ffffff',
  },
  appTitle: {
    flex: 1,
  },
  appTitleLink: {
    color: '#ffffff',
    textDecoration: 'none',
  },
  loginLink: {
    color: '#ffffff',
    textDecoration: 'none',
  },
  menuButton: {
    marginLeft: -12,
  },
  appLogo: {
    height: 30,
  },
});

class Header extends Component {
  static propTypes = {
    isLoggedIn: PropTypes.bool.isRequired,
    isLoading: PropTypes.bool.isRequired,
    handleLogoutClick: PropTypes.func.isRequired,
  }

  render() {
    const {classes} = this.props;

    return (
        <React.Fragment>
          <AppBar className={classes.appbar} position="static" color="default">
            <Toolbar>
              <Link to={'/'}>
                <img src={'/logo.png'} className={classes.appLogo} alt="logo"/>
              </Link>
              <Typography variant="title" color="inherit" className={classes.appTitle}>
                <Link to={'/'} className={classes.appTitleLink}>Simulacrum</Link>
              </Typography>
              {this.props.isLoggedIn && <UserNotificationMenu {...this.props} />}
              {
                !this.props.isLoggedIn && !this.props.isLoading &&
                <Button color={'inherit'} component={Link} to="/login" className={classes.loginLink}>Login</Button>
              }
              {
                this.props.isLoggedIn && <UserNavMenu handleLogoutClick={this.props.handleLogoutClick} />
              }
            </Toolbar>
          </AppBar>
          <SubMenu />
        </React.Fragment>
    );
  }
}

export default withStyles(styles)(Header);
