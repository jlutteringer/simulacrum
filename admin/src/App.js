import React, { Component } from 'react';
import { Admin, Resource } from 'react-admin';
import {UserList, UserEdit} from 'pages/users';
import LoginPage from 'LoginPage';
import {authProvider,dataProvider} from "providers";
import {CampaignEdit, CampaignList} from "pages/campaigns";
import DashBoard from 'pages/dashboard'
import UserIcon from '@material-ui/icons/Group';

class App extends Component {
  render() {
    return (
      <Admin loginPage={LoginPage} dataProvider={dataProvider} authProvider={authProvider} dashboard={DashBoard}>
        <Resource name="users" list={UserList} edit={UserEdit} icon={UserIcon}/>
        <Resource name="campaigns" list={CampaignList} edit={CampaignEdit}/>
      </Admin>
    );
  }
}

export default App;
