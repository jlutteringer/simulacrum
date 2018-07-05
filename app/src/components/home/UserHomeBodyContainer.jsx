import {connect} from "react-redux";
import UserHomeBody from "components/home/UserHomeBody";
import * as CampaignActions from "actions/CampaignActions";

const mapStateToProps = (state, ownProps) => {
  return {
    campaigns: state.campaigns,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    loadCampaigns: () => {
      dispatch(CampaignActions.loadCampaigns());
    },
    createCampaign: (campaign) => {
      dispatch(CampaignActions.createCampaign(campaign));
    },
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(UserHomeBody);
