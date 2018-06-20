import React, {Component} from 'react'
import { withStyles } from '@material-ui/core/styles';
import PropTypes from "prop-types";
import AddCircleOutlineIcon from '@material-ui/icons/AddCircleOutline';
import IconButton from "@material-ui/core/es/IconButton/IconButton";

const styles = (themes) => ({

});

class UserHomeBody extends Component {
  static propTypes = {
    campaigns: PropTypes.object,
    createCampaign: PropTypes.func
  }

  componentWillMount() {
    this.props.loadCampaigns();
  }

  renderCampaign(campaign, index) {
    return <div>{campaign.name}</div>
  }

  render() {
    const { campaigns, createCampaign } = this.props

    return (
        <React.Fragment>
          <h1>Live Your RPG</h1>
          <h2>Campaigns
            <IconButton onClick={() => createCampaign({"name":"Test!!"})} color={"inherit"}>
              <AddCircleOutlineIcon />
            </IconButton>
          </h2>
          {
            campaigns.instances.map(this.renderCampaign)
          }
        </React.Fragment>
    );
  }
}

export default withStyles(styles)(UserHomeBody)