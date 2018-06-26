import {connect} from "react-redux";
import CampaignBody from "components/campaign/CampaignBody";
import * as CampaignActions from "actions/CampaignActions";

const mapStateToProps = (state, ownProps) => {
  return {
    campaign : state.campaigns.current !== null &&
               state.campaigns.current.campaignId === ownProps.campaignId ? state.campaigns.current : null,
    token : state.user.token,
    userId : state.user.info.userId
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