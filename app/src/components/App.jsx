import React, { Component } from 'react';
import './App.css';

export default class App extends Component {
  componentWillMount() {
    this.props.loadUserFromToken();
  }

  render() {
    return (
        <div className={"App"}>
          {this.props.children}
        </div>
    );
  }
}
