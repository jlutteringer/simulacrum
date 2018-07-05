import React, {Component} from "react";
import PropTypes from "prop-types";
import CampaignInfoBodyContainer from "components/campaign/info/CampaignInfoBodyContainer";
import _ from "lodash";
import TemplatePage from "components/layout/TemplatePage";

export default class CampaignInfoPage extends Component {
  static propTypes = {
    match: PropTypes.object.isRequired,
  };

  render() {
    const campaignId = _.toNumber(this.props.match.params.campaignId);

    return (
        <TemplatePage>
          <CampaignInfoBodyContainer campaignId={campaignId} {...this.props}/>
        </TemplatePage>
    );
  }
}
