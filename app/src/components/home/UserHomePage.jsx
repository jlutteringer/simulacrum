import React, {Component} from 'react';
import HeaderContainer from "components/layout/HeaderContainer";
import MainContainer from "components/layout/MainContainer";
import UserHomeBodyContainer from "components/home/UserHomeBodyContainer";

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