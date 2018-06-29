import React, {Component} from 'react';
import CampaignInfoBodyContainer from "components/campaign/info/CampaignInfoBodyContainer";
import MainContainer from "components/layout/MainContainer";
import _ from 'lodash'
import HeaderContainer from "components/layout/HeaderContainer";

export default class CampaignInfoPage extends Component {
  render() {
    const campaignId = _.toNumber(this.props.match.params.campaignId)

    return (
        <React.Fragment>
          <HeaderContainer />
          <MainContainer>
            <CampaignInfoBodyContainer campaignId={campaignId} {...this.props}/>
          </MainContainer>
        </React.Fragment>
    )
  }
}