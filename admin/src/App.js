import React, { Component } from 'react';
import { fetchUtils, Admin, Resource } from 'react-admin';
import {UserList, UserEdit} from 'pages/users';
import LoginPage from 'LoginPage';
import {authProvider,dataProvider} from "providers";

class App extends Component {
  render() {
    return (
      <Admin loginPage={LoginPage} dataProvider={dataProvider} authProvider={authProvider}>
        <Resource name="users" list={UserList} edit={UserEdit}/>
      </Admin>
    );
  }
}

export default App;
