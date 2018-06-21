import React, {Component} from 'react'
import PropTypes from "prop-types";
import { withStyles } from '@material-ui/core/styles';
import _ from 'lodash'

const styles = (themes) => ({
  root: {

  }
});

class CampaignBody extends Component {
  static propTypes = {
    campaignId: PropTypes.string.isRequired,
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
          {campaign.name}
        </div>
    );
  }
}

export default withStyles(styles)(CampaignBody)