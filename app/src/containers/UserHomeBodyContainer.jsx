import {connect} from "react-redux";
import UserHomeBody from "../components/UserHomeBody";
import * as CampaignActions from "../actions/campaign-actions";

const mapStateToProps = (state, ownProps) => {
  return {
    campaigns : state.campaigns
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    loadCampaigns : () => {
      dispatch(CampaignActions.loadCampaigns())
    },
    createCampaign : (campaign) => {
      dispatch(CampaignActions.createCampaign(campaign))
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(UserHomeBody);