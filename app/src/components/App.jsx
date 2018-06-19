import React, { Component } from 'react';
import 'typeface-roboto';
import { create } from 'jss';
import JssProvider from 'react-jss/lib/JssProvider';
import CssBaseline from "@material-ui/core/CssBaseline";
import { MuiThemeProvider, createMuiTheme, createGenerateClassName, jssPreset } from "@material-ui/core/styles";
import { lightBlue as primary, green as secondary, yellow as accent } from '@material-ui/core/colors';
import { withStyles } from '@material-ui/core/styles';

const theme = createMuiTheme({
  palette: {
    primary: primary,
    secondary: secondary,
    accent: accent,
    type: 'light',
  }
});

const styles = (theme) => ({

})

const jss = create(jssPreset());

const generateClassName = createGenerateClassName();

class App extends Component {
  componentWillMount() {
    this.props.loadUserFromToken();
  }

  render() {
    return (
        <JssProvider jss={jss} generateClassName={generateClassName}>
          <MuiThemeProvider theme={theme} sheetsManager={new Map()}>
            <CssBaseline />
            {React.cloneElement(this.props.children, {...this.props})}
          </MuiThemeProvider>
        </JssProvider>
    );
  }
}

export default withStyles(styles)(App)