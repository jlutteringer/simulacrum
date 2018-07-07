import React, {Component} from "react";
import PropTypes from "prop-types";
import "typeface-roboto";
import {create} from "jss";
import JssProvider from "react-jss/lib/JssProvider";
import CssBaseline from "@material-ui/core/CssBaseline";
import {MuiThemeProvider, createMuiTheme, createGenerateClassName, jssPreset} from "@material-ui/core/styles";
import {lightBlue as primary, green as secondary, yellow as accent} from "@material-ui/core/colors";
import PageRoutesContainer from "./components/PageRoutesContainer";
import {Provider} from "react-redux";
import axios from "axios";
import {ConnectedRouter} from "connected-react-router";

const theme = createMuiTheme({
  palette: {
    primary: primary,
    secondary: secondary,
    accent: accent,
    type: "light",
  },
});

const jss = create(jssPreset());

const generateClassName = createGenerateClassName();

axios.interceptors.response.use(function(response) {
  return response;
}, function(error) {
  if (401 === error.response.status) {
    localStorage.clear();
    window.location = "/login";
  } else {
    return Promise.reject(error);
  }
});

class App extends Component {
  static propTypes = {
    store: PropTypes.object,
    history: PropTypes.object,
  };

  render() {
    return (
        <Provider store={this.props.store}>
          <JssProvider jss={jss} generateClassName={generateClassName}>
            <MuiThemeProvider theme={theme} sheetsManager={new Map()}>
              <CssBaseline/>
              <ConnectedRouter history={this.props.history}>
                <PageRoutesContainer/>
              </ConnectedRouter>
            </MuiThemeProvider>
          </JssProvider>
        </Provider>
    );
  }
}

export default App;
