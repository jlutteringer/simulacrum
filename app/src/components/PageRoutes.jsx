import React, {Component} from 'react';
import {Route, Switch} from "react-router-dom";
import FourOhFourPage from "../pages/FourOhFourPage";
import HomePage from "../pages/HomePage";
import LoginPage from "../pages/LoginPage";

export default class PageRoutes extends Component {
  render() {
    return (
      <Switch>
        <Route exact path={'/'} component={HomePage} />
        <Route path={'/login'} component={LoginPage} />
        <Route component={FourOhFourPage} />
      </Switch>
    )
  }
}
