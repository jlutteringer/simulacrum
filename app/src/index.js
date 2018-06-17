import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {Provider} from 'react-redux';
import rootReducer from './reducers/index';
import thunk from 'redux-thunk';
import {applyMiddleware, createStore} from 'redux';
import registerServiceWorker from './registerServiceWorker';
import {BrowserRouter} from "react-router-dom";
import AppPage from "./pages/AppPage";

const store = createStore(
    rootReducer,
    {},
    applyMiddleware(thunk)
);

ReactDOM.render(
    <Provider store={store}>
      <BrowserRouter>
        <AppPage />
      </BrowserRouter>
    </Provider>,
    document.getElementById('root'));
registerServiceWorker();
