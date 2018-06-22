import {connect} from "react-redux";
import CampaignBody from "components/campaign/CampaignBody";
import * as CampaignActions from "actions/campaign-actions";

const mapStateToProps = (state, ownProps) => {
  return {
    campaign : state.campaigns.current !== null &&
               state.campaigns.current.id === ownProps.campaignId ? state.campaigns.current : null
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadCampaign: (campaignId) => {
      dispatch(CampaignActions.loadCampaign(campaignId))
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(CampaignBody);