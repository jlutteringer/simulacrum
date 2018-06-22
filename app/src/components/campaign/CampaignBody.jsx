import React from 'react'
import PropTypes from "prop-types";
import { withStyles } from '@material-ui/core/styles';
import _ from 'lodash'
import PhaserGame from "./PhaserGame";

const styles = (themes) => ({
  root: {

  }
});

class CampaignBody extends React.Component {
  static propTypes = {
    campaignId: PropTypes.number.isRequired,
    loadCampaign: PropTypes.func.isRequired,
    campaign: PropTypes.object
  };

  componentWillMount() {
    if(_.isEmpty(this.props.campaign)) {
      this.props.loadCampaign(this.props.campaignId);
    }
  }

  render() {
    const {classes, campaign} = this.props

    if(_.isEmpty(campaign)) {
      return null;
    }

    return (
        <div className={classes.root}>
          <PhaserGame />
          {/*Implement sidebar*/}
        </div>
    );
  }
}

export default withStyles(styles)(CampaignBody)