import React, {Component} from "react";
import PropTypes from "prop-types";
import CampaignBodyContainer from "components/campaign/CampaignBodyContainer";
import MainContainer from "components/layout/MainContainer";
import _ from "lodash";

export default class CampaignPage extends Component {
  static propTypes = {
    match: PropTypes.object.isRequired,
  };

  render() {
    const campaignId = _.toNumber(this.props.match.params.campaignId);

    return (
        <MainContainer>
          <CampaignBodyContainer campaignId={campaignId} {...this.props} />
        </MainContainer>
    );
  }
}
