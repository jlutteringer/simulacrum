import React, {Component} from "react";
import UserHomeBodyContainer from "components/home/UserHomeBodyContainer";
import TemplatePage from "components/layout/TemplatePage";

export default class UserHomePage extends Component {
  render() {
    return (
        <TemplatePage>
            <UserHomeBodyContainer />
        </TemplatePage>
    );
  }
}
