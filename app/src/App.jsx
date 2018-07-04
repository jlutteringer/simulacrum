import React, {Component} from 'react';
import 'typeface-roboto';
import {create} from 'jss';
import JssProvider from 'react-jss/lib/JssProvider';
import CssBaseline from '@material-ui/core/CssBaseline';
import {MuiThemeProvider, createMuiTheme, createGenerateClassName, jssPreset} from '@material-ui/core/styles';
import {lightBlue as primary, green as secondary, yellow as accent} from '@material-ui/core/colors';
import PageRoutesContainer from './components/PageRoutesContainer';
import {applyMiddleware, compose, createStore} from 'redux';
import thunk from 'redux-thunk';
import rootReducer from './reducers/index';
import {Provider} from 'react-redux';
import createHistory from 'history/createBrowserHistory';
import axios from 'axios';
import {ConnectedRouter, connectRouter, routerMiddleware} from 'connected-react-router';

const initialState = {};

const theme = createMuiTheme({
  palette: {
    primary: primary,
    secondary: secondary,
    accent: accent,
    type: 'light',
  },
});

export const history = createHistory();

const enhancers = [];
const middleware = [
  thunk,
  routerMiddleware(history),
];

if (process.env.NODE_ENV === 'development') {
  const devToolsExtension = window.__REDUX_DEVTOOLS_EXTENSION__;

  if (typeof devToolsExtension === 'function') {
    enhancers.push(devToolsExtension());
  }
}

const composedEnhancers = compose(
    applyMiddleware(...middleware),
    ...enhancers
);

const store = createStore(
    connectRouter(history)(rootReducer),
    initialState,
    composedEnhancers
);

const jss = create(jssPreset());

const generateClassName = createGenerateClassName();

axios.interceptors.response.use(function(response) {
  return response;
}, function(error) {
  if (401 === error.response.status) {
    localStorage.clear();
    window.location = '/login';
  } else {
    return Promise.reject(error);
  }
});

class App extends Component {
  render() {
    return (
        <Provider store={store}>
          <JssProvider jss={jss} generateClassName={generateClassName}>
            <MuiThemeProvider theme={theme} sheetsManager={new Map()}>
              <CssBaseline/>
              <ConnectedRouter history={history}>
                <PageRoutesContainer/>
              </ConnectedRouter>
            </MuiThemeProvider>
          </JssProvider>
        </Provider>
    );
  }
}

export default App;
