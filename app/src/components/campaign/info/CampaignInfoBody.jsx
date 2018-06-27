import React from 'react'
import PropTypes from "prop-types";
import { withStyles } from '@material-ui/core/styles';
import _ from 'lodash'
import {Redirect} from "react-router-dom";

const styles = (themes) => ({
  root: {

  }
});

class CampaignInfoBody extends React.Component {
  static propTypes = {
    campaignId: PropTypes.number.isRequired,
    loadCampaign: PropTypes.func.isRequired,
    campaign: PropTypes.object
  };

  componentWillMount() {
    if(_.isEmpty(this.props.campaign)) {
      const campaignId = _.toNumber(this.props.campaignId)
      this.props.loadCampaign(campaignId);
    }
  }

  render() {
    const {classes, campaign, isLoading} = this.props

    if(isLoading) {
      return null;
    }

    if(_.isEmpty(campaign)) {
      return <Redirect to={'/'} />
    }

    return (
        <div className={classes.root}>
          {/*TODO create an info page */}
          {campaign.name}
        </div>
    );
  }
}

export default withStyles(styles)(CampaignInfoBody)