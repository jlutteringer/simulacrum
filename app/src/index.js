import configureStore from "config/storeConfig";
import createHistory from "history/createBrowserHistory";
import React from "react";
import ReactDOM from "react-dom";
import registerServiceWorker from "./registerServiceWorker";
import App from "./App";

export const history = createHistory();
const store = configureStore(history);

const root = document.getElementById("root");
ReactDOM.render(<App store={store} history={history}/>, root);

if (module.hot) {
  module.hot.accept("./App", () => {
    const NextApp = require("./App").default;
    ReactDOM.render(<NextApp store={store} history={history}/>, root);
  });
}

registerServiceWorker();
