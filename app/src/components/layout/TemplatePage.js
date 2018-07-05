import React, {Component} from "react";
import PropTypes from "prop-types";
import HeaderContainer from "components/layout/HeaderContainer";
import MainContainer from "components/layout/MainContainer";
import Footer from "components/layout/Footer";

export default class TemplatePage extends Component {
  static propTypes = {
    children: PropTypes.node,
  };

  render() {
    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            { this.props.children }
          </MainContainer>
          <Footer/>
        </React.Fragment>
    );
  }
}
