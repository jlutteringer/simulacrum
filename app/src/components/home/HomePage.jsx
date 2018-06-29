import React, {Component} from 'react';
import HeaderContainer from "components/layout/HeaderContainer";
import MainContainer from "components/layout/MainContainer";

export default class HomePage extends Component {
  render() {
    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            <h1>Live Your RPG</h1>
          </MainContainer>
        </React.Fragment>
    )
  }
}