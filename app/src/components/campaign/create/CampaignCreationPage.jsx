import React, {Component} from 'react';
import CampaignCreationBodyContainer from "containers/CampaignCreationBodyContainer";
import MainContainer from "containers/MainContainer";
import _ from 'lodash'
import HeaderContainer from "containers/HeaderContainer";

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