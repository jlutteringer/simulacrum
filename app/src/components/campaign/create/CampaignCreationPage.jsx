import React, {Component} from 'react';
import CampaignCreationBodyContainer from "components/campaign/create/CampaignCreationBodyContainer";
import MainContainer from "components/layout/MainContainer";
import _ from 'lodash'
import HeaderContainer from "components/layout/HeaderContainer";

export default class CampaignCreationPage extends Component {
  render() {
    const campaignId = _.toNumber(this.props.match.params.campaignId)

    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            <CampaignCreationBodyContainer campaignId={campaignId} {...this.props}/>
          </MainContainer>
        </React.Fragment>
    )
  }
}