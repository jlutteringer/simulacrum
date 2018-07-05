import {connect} from "react-redux";
import * as CampaignActions from "actions/CampaignActions";
import CampaignCreationForm from "components/campaign/create/CampaignCreationForm";

const mapStateToProps = (state, ownProps) => {
  return {
  };
};

const mapDispatchToProps = (dispatch) => {
  return {
    onSubmit: (form) => {
      dispatch(CampaignActions.createCampaign(form));
    },
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(CampaignCreationForm);
