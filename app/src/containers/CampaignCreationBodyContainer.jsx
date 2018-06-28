import {connect} from "react-redux";
import * as CampaignActions from "actions/CampaignActions";
import CampaignInfoBody from "components/campaign/info/CampaignInfoBody";
import CampaignCreationBody from "components/campaign/create/CampaignCreationBody";

const mapStateToProps = (state, ownProps) => {
  return {
    campaign : state.campaigns.current !== null &&
               state.campaigns.current.campaignId === ownProps.campaignId ? state.campaigns.current : null,
    isLoading : state.campaigns.isLoading || state.campaigns.current === null || state.campaigns.current.campaignId !== ownProps.campaignId
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadCampaign: (campaignId) => {
      dispatch(CampaignActions.loadCampaign(campaignId))
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(CampaignCreationBody);