import React, {Component} from 'react';
import HeaderContainer from "containers/HeaderContainer";
import MainContainer from "containers/MainContainer";
import UserHomeBodyContainer from "containers/UserHomeBodyContainer";

export default class UserHomePage extends Component {
  render() {
    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            <UserHomeBodyContainer />
          </MainContainer>
        </React.Fragment>
    )
  }
}