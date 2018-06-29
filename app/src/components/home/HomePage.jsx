import React, {Component} from 'react';
import HeaderContainer from "components/layout/HeaderContainer";
import MainContainer from "components/layout/MainContainer";
import Footer from "components/layout/Footer";

export default class HomePage extends Component {
  render() {
    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>

          </MainContainer>
          <Footer />
        </React.Fragment>
    )
  }
}