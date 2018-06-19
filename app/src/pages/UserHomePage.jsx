import React, {Component} from 'react';
import HeaderContainer from "../containers/HeaderContainer";
import MainContainer from "../containers/MainContainer";

export default class UserHomePage extends Component {
  render() {
    return (
        <div>
          <HeaderContainer />
          <MainContainer>
            <h1>Live Your RPG</h1>
          </MainContainer>
        </div>
    )
  }
}