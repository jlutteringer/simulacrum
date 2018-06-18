import React, { Component } from 'react';
import './App.css';
import 'typeface-roboto';
import CssBaseline from "@material-ui/core/CssBaseline";
import { MuiThemeProvider, createMuiTheme } from "@material-ui/core/styles";
import { green, red } from '@material-ui/core/colors';

const theme = createMuiTheme({
  palette: {
    primary: green,
    accent: red,
    type: 'dark',
  },
});

export default class App extends Component {
  componentWillMount() {
    this.props.loadUserFromToken();
  }

  render() {
    return (
        <MuiThemeProvider theme={theme} sheetsManager={new Map()}>
          <CssBaseline />
          {this.props.children}
        </MuiThemeProvider>
    );
  }
}
