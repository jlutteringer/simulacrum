import React from 'react';
import { connect, state } from 'react-redux';
import LoginComponent from '../components/login-component';
import logo from '../logo.svg';

class HeaderComponent extends React.Component {

  render() {
    return <header className="App-header">
      <img src={logo} className="App-logo" alt="logo" />
      <h1 className="App-title">Welcome to React</h1>
      {!this.props.user && <LoginComponent/>}
      {this.props.user && "Logged In!"}
    </header>
  }
}

export default connect(
    (state) => {
      return {
        user : state.user
      }
    }
)(HeaderComponent)
