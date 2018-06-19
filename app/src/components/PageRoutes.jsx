import React, {Component} from 'react';
import {Redirect, Route, Switch} from "react-router-dom";
import FourOhFourPage from "../pages/FourOhFourPage";
import HomePage from "../pages/HomePage";
import LoginPage from "../pages/LoginPage";
import UserHomePage from "../pages/UserHomePage";

export default class PageRoutes extends Component {
  render() {
    return (
      <Switch>
        {
          !this.props.isLoggedIn &&
            <React.Fragment>
              <Route exact path={'/'} component={HomePage} />
              <Route path={'/login'} component={LoginPage} />
            </React.Fragment>
        }
        {
          this.props.isLoggedIn &&
          <React.Fragment>
            <Route exact path={'/'} component={UserHomePage} />
            <Route path={'/login'} render={() => <Redirect to={'/'} />} />
          </React.Fragment>
        }
        <Route component={FourOhFourPage} />
      </Switch>
    )
  }
}
