import React, {Component} from 'react';
import {Redirect, Route, Switch} from "react-router-dom";
import FourOhFourPage from "components/error/FourOhFourPage";
import HomePage from "components/home/HomePage";
import LoginPage from "components/login/LoginPage";
import UserHomePage from "components/home/UserHomePage";
import CampaignPage from "components/campaign/CampaignPage";

export default class PageRoutes extends Component {
  componentWillMount() {
    this.props.loadUserFromToken()
  }

  render() {
    if (this.props.isLoading) {
      return null
    }
    return (
      <Switch>
        <Route exact path={'/'} render={(props) => {
          return this.props.isLoggedIn ? <UserHomePage {...props} /> : <HomePage {...props} />
        }}/>
        <AnonymousRoute path={'/login'} component={LoginPage} isAuthenticated={this.props.isLoggedIn}/>
        <PrivateRoute exact path={'/campaign/:campaignId'} component={CampaignPage}
                      isAuthenticated={this.props.isLoggedIn}/>
        <Route component={FourOhFourPage}/>
      </Switch>
    )
  }
}

const PrivateRoute = ({ component: Component, isAuthenticated, ...rest }) => (
    <Route
        {...rest}
        render={props =>
            isAuthenticated ?
                (
                    <Component {...props} />
                )
                :
                (
                    <Redirect
                        to={{
                          pathname: "/login",
                          state: {from: props.location}
                        }}
                    />
                )
        }
    />
);

const AnonymousRoute = ({ component: Component, isAuthenticated, ...rest }) => (
    <Route
        {...rest}
        render={props =>
            !isAuthenticated ? (
                <Component {...props} />
            ) : (
                <Redirect
                    from={props.location.pathname}
                    to={"/"} />
            )
        }
    />
);
