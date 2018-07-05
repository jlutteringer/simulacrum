import {connect} from "react-redux";
import * as CampaignActions from "actions/CampaignActions";
import InvitationNotificationDialog from "components/layout/InvitationNotificationDialog";

const mapStateToProps = (state, ownProps) => {
  return {

  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    handleDeclineInvitation: (token, notificationId) => {
      dispatch(CampaignActions.declineInvite(token, notificationId));
    },
    handleAcceptInvitation: (token, notificationId) => {
      dispatch(CampaignActions.acceptInvite(token));
    },
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(InvitationNotificationDialog);
