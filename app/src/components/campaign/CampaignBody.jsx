import React from "react";
import PropTypes from "prop-types";
import {withStyles} from "@material-ui/core/styles";
import _ from "lodash";
import GameContainer from "components/campaign/game/GameContainer";
import {Redirect} from "react-router-dom";

const styles = (themes) => ({
  root: {

  },
});

class CampaignBody extends React.Component {
  static propTypes = {
    classes: PropTypes.object.isRequired,
    isLoading: PropTypes.bool.isRequired,
    campaignId: PropTypes.number.isRequired,
    loadCampaign: PropTypes.func.isRequired,
    campaign: PropTypes.object,
  };

  componentDidMount() {
    if (_.isEmpty(this.props.campaign)) {
      this.props.loadCampaign(this.props.campaignId);
    }
  }

  render() {
    const {classes, campaign, isLoading} = this.props;

    if (isLoading) {
      return null;
    }

    if (_.isEmpty(campaign)) {
      return <Redirect to={"/"} />;
    }

    return (
        <div className={classes.root}>
          <GameContainer {...this.props} />
          {/* Implement sidebar*/}
        </div>
    );
  }
}

export default withStyles(styles)(CampaignBody);
