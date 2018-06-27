import React, {Component} from 'react';
import CampaignInfoBodyContainer from "containers/CampaignInfoBodyContainer";
import MainContainer from "containers/MainContainer";
import _ from 'lodash'
import HeaderContainer from "containers/HeaderContainer";

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