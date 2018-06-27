import React, {Component} from 'react';
import {Redirect, Route, Switch} from "react-router-dom";
import FourOhFourPage from "components/error/FourOhFourPage";
import HomePage from "components/home/HomePage";
import LoginPage from "components/login/LoginPage";
import UserHomePage from "components/home/UserHomePage";
import CampaignPage from "components/campaign/CampaignPage";
import CampaignInfoPage from "components/campaign/info/CampaignInfoPage";

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
        <Route path={'/login'} component={LoginPage} {...this.props} />
        <PrivateRoute exact path={'/campaign/:campaignId'} component={CampaignPage} isAuthenticated={this.props.isLoggedIn}/>
        <PrivateRoute exact path={'/campaign/:campaignId/info'} component={CampaignInfoPage} isAuthenticated={this.props.isLoggedIn}/>
        <Route component={FourOhFourPage}/>
      </Switch>
    )
  }
}

const PrivateRoute = ({ component: Component, isAuthenticated, ...rest }) => (
    <Route {...rest}
        render={
          props => isAuthenticated
              ? <Component {...props} />
              : <Redirect to={{
                pathname: '/login',
                state: {from: props.location}
              }}/>
        }
    />
);
