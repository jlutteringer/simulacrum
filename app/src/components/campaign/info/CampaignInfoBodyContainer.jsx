import {connect} from "react-redux";
import * as CampaignActions from "actions/CampaignActions";
import CampaignInfoBody from "components/campaign/info/CampaignInfoBody";

const mapStateToProps = (state, ownProps) => {
  const currentCampaign = state.campaigns.current !== null &&
    state.campaigns.current.id === ownProps.campaignId ? state.campaigns.current : null;
  return {
    campaign: currentCampaign,
    isLoading: state.campaigns.isLoading || currentCampaign === null,
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    loadCampaign: (campaignId) => {
      dispatch(CampaignActions.loadCampaign(campaignId));
    },
    invitePlayer: (form) => {
      const {email, campaignId} = form;
      dispatch(CampaignActions.invitePlayer(campaignId, email));
    },
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(CampaignInfoBody);
