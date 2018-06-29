import React, { Component } from 'react';
import 'typeface-roboto';
import { create } from 'jss';
import JssProvider from 'react-jss/lib/JssProvider';
import CssBaseline from "@material-ui/core/CssBaseline";
import { MuiThemeProvider, createMuiTheme, createGenerateClassName, jssPreset } from "@material-ui/core/styles";
import { lightBlue as primary, green as secondary, yellow as accent } from '@material-ui/core/colors';
import PageRoutesContainer from "./components/PageRoutesContainer";
import {applyMiddleware, createStore} from "redux";
import thunk from "redux-thunk";
import rootReducer from "./reducers/index";
import {Provider} from "react-redux";
import {BrowserRouter} from "react-router-dom";
import axios from 'axios'

const theme = createMuiTheme({
  palette: {
    primary: primary,
    secondary: secondary,
    accent: accent,
    type: 'light',
  }
});

const store = createStore(
    rootReducer,
    {},
    applyMiddleware(thunk)
);

const jss = create(jssPreset());

const generateClassName = createGenerateClassName();

axios.interceptors.response.use(function (response) {
  return response;
}, function (error) {
  if (401 === error.response.status) {
    localStorage.clear()
    window.location = "/login"
  } else {
    return Promise.reject(error);
  }
});

class App extends Component {

  render() {
    return (
        <Provider store={store}>
          <BrowserRouter>
            <JssProvider jss={jss} generateClassName={generateClassName}>
              <MuiThemeProvider theme={theme} sheetsManager={new Map()}>
                <CssBaseline/>
                <PageRoutesContainer/>
              </MuiThemeProvider>
            </JssProvider>
          </BrowserRouter>
        </Provider>
    );
  }
}

export default App