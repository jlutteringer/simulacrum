import React, { Component } from 'react';
import PropTypes from 'prop-types';
import logo from '../static/logo.png';
import Login from "./Login";
import './Header.css';
import Typography from "@material-ui/core/Typography";
import Toolbar from "@material-ui/core/Toolbar";
import AppBar from "@material-ui/core/AppBar";
import Logout from "./Logout";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from '@material-ui/icons/Menu';

export default class Header extends Component {

  render() {
    return (
        <header className="App-header">
            <AppBar>
              <Toolbar>
                <IconButton className={"menu-button"} color="inherit" aria-label="Menu">
                  <MenuIcon />
                </IconButton>
                <img src={logo} className="App-logo" alt="logo"/>
                <Typography variant="title" color="inherit" className="App-header-title">
                  Simulacrum
                </Typography>

                {!this.props.isLoggedIn && !this.props.isLoading && <Login {...this.props} />}
                {this.props.isLoggedIn && <Logout {...this.props} />}
              </Toolbar>
            </AppBar>
        </header>
    );
  }
}

Header.propTypes = {
  isLoggedIn: PropTypes.bool.isRequired,
  isLoading: PropTypes.bool.isRequired,
};
