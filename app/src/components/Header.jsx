import React, { Component } from 'react';
import logo from '../logo.svg';
import Login from "./Login";

export class Header extends Component {

  render() {
    return <header className="App-header">
      <img src={logo} className="App-logo" alt="logo" />
      <h1 className="App-title">Welcome to React</h1>
      {!this.props.isLoggedIn && <Login {...this.props} />}
      {this.props.isLoggedIn && "Logged In!"}
    </header>
  }
}
