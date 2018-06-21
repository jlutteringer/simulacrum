import React, {Component} from 'react';
import CampaignBodyContainer from "../containers/CampaignBodyContainer";
import MainContainer from "../containers/MainContainer";

export default class CampaignPage extends Component {
  render() {
    const campaignId = this.props.match.params.campaignId

    return (
        <MainContainer>
          <CampaignBodyContainer campaignId={campaignId} />
        </MainContainer>
    )
  }
}