import React, {Component} from "react";
import CampaignCreationFormContainer from "components/campaign/create/CampaignCreationFormContainer";
import TemplatePage from "components/layout/TemplatePage";

export default class CampaignCreationPage extends Component {
  render() {
    return (
        <TemplatePage>
          <CampaignCreationFormContainer/>
        </TemplatePage>
    );
  }
}
