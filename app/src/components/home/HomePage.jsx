import React, {Component} from 'react';
import HeaderContainer from "containers/HeaderContainer";
import MainContainer from "containers/MainContainer";

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