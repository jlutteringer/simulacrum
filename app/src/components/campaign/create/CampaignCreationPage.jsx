import React, {Component} from 'react';
import MainContainer from "components/layout/MainContainer";
import HeaderContainer from "components/layout/HeaderContainer";
import CampaignCreationFormContainer from "components/campaign/create/CampaignCreationFormContainer";

export default class CampaignCreationPage extends Component {
  render() {
    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            <CampaignCreationFormContainer />
          </MainContainer>
        </React.Fragment>
    )
  }
}