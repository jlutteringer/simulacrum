import React, {Component} from 'react';
import CampaignInfoBodyContainer from 'components/campaign/info/CampaignInfoBodyContainer';
import _ from 'lodash';
import TemplatePage from 'components/layout/TemplatePage';

export default class CampaignInfoPage extends Component {
  render() {
    const campaignId = _.toNumber(this.props.match.params.campaignId);

    return (
        <TemplatePage>
          <CampaignInfoBodyContainer campaignId={campaignId} {...this.props}/>
        </TemplatePage>
    );
  }
}
