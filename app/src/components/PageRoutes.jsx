import React, {Component} from 'react';
import {Redirect, Route, Switch} from 'react-router-dom';
import FourOhFourPage from 'components/error/FourOhFourPage';
import HomePage from 'components/home/HomePage';
import LoginPage from 'components/login/LoginPage';
import UserHomePage from 'components/home/UserHomePage';
import CampaignPage from 'components/campaign/CampaignPage';
import CampaignInfoPage from 'components/campaign/info/CampaignInfoPage';
import CampaignCreationPage from 'components/campaign/create/CampaignCreationPage';

export default class PageRoutes extends Component {
  componentDidMount() {
    this.props.loadUserFromToken();
  }

  render() {
    if (this.props.isLoading) {
      return null;
    }
    return (
      <Switch>
        <Route exact path={'/'} render={(props) => {
          return this.props.isLoggedIn ? <UserHomePage {...props} /> : <HomePage {...props} />;
        }}/>
        <Route path={'/login'} component={LoginPage} {...this.props} />
        <PrivateRoute exact path={'/campaigns/new'} component={CampaignCreationPage} {...this.props}/>
        <PrivateRoute exact path={'/campaigns/:campaignId'} component={CampaignPage} {...this.props}/>
        <PrivateRoute exact path={'/campaigns/:campaignId/info'} component={CampaignInfoPage} {...this.props}/>
        <Route component={FourOhFourPage}/>
      </Switch>
    );
  }
}

const PrivateRoute = ({component: Component, isLoggedIn, ...rest}) => (
    <Route {...rest}
        render={
          (props) => isLoggedIn
              ? <Component {...props} />
              : <Redirect to={{
                pathname: '/login',
                state: {from: props.location},
              }}/>
        }
    />
);
