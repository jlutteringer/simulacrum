import React, {Component} from 'react';
import HeaderContainer from "components/layout/HeaderContainer";
import MainContainer from "components/layout/MainContainer";

export default class FourOhFourPage extends Component {
  render() {
    console.log(this.props)
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