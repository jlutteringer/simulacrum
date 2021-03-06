import EntityGrid from "components/campaign/info/EntityGrid";
import React from "react";
import PropTypes from "prop-types";
import {withStyles} from "@material-ui/core/styles";
import _ from "lodash";
import {Redirect} from "react-router-dom";
import InvitePlayerForm from "components/campaign/info/InvitePlayerForm";

const styles = (themes) => ({
  campaignInfoContainer: {

  },
});

class CampaignInfoBody extends React.Component {
  static propTypes = {
    classes: PropTypes.object.isRequired,
    isLoading: PropTypes.bool.isRequired,
    campaignId: PropTypes.number.isRequired,
    loadCampaign: PropTypes.func.isRequired,
    campaign: PropTypes.object,
    isCreator: PropTypes.bool.isRequired,
  };

  componentDidMount() {
    if (_.isEmpty(this.props.campaign)) {
      const campaignId = _.toNumber(this.props.campaignId);
      this.props.loadCampaign(campaignId);
    }
  }

  renderCreatorView() {
    return <React.Fragment>
      <EntityGrid {...this.props} />
      <InvitePlayerForm {...this.props} />;
    </React.Fragment>;
  }

  renderPlayerView() {
    return <React.Fragment>
      <EntityGrid {...this.props}/>
    </React.Fragment>;
  }

  render() {
    const {isCreator, isLoading, campaign} = this.props;

    if (isLoading) {
      return null;
    }

    if (_.isEmpty(campaign)) {
      return <Redirect to={"/"}/>;
    }

    return (
        <React.Fragment>
          {
            isCreator &&
            this.renderCreatorView()
          }
          {
            !isCreator &&
            this.renderPlayerView()
          }
        </React.Fragment>
    );
  }
}

export default withStyles(styles)(CampaignInfoBody);
