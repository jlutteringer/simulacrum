import React, {Component} from 'react';
import HeaderContainer from "containers/HeaderContainer";
import MainContainer from "containers/MainContainer";

export default class FourOhFourPage extends Component {
  render() {
    return (
      <div>
        <HeaderContainer />
        <MainContainer>
          <p>Error!!</p>

        </MainContainer>
      </div>
    )
  }
}