import React, {Component} from 'react';
import HeaderContainer from "containers/HeaderContainer";
import LoginBodyContainer from "containers/LoginBodyContainer";
import MainContainer from "containers/MainContainer";

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