import React, { Component } from 'react';
import './App.css';
import HeaderComponent from "./components/header-component";
import { connect } from 'react-redux';

class AppContainer extends Component {
  render() {
    return (
      <div className="App">
        <HeaderComponent />
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
}

const App = connect(
    (state, ownProps) => {
      return {
        user: state.user
      }
    }
) (AppContainer)

export default App;
