import React, {Component} from 'react';
import HeaderContainer from "components/layout/HeaderContainer";
import LoginBodyContainer from "components/login/LoginBodyContainer";
import MainContainer from "components/layout/MainContainer";

export default class LoginPage extends Component {
  render() {
    return (
        <div>
          <HeaderContainer/>
          <MainContainer>
            <LoginBodyContainer {...this.props}/>
          </MainContainer>
        </div>
    )
  }
}