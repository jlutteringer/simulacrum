import React, {Component} from 'react'
import { withStyles } from '@material-ui/core/styles';
import PropTypes from "prop-types";
import AddCircleOutlineIcon from '@material-ui/icons/AddCircleOutline';
import IconButton from "@material-ui/core/es/IconButton/IconButton";
import Card from "@material-ui/core/es/Card/Card";
import CardActions from "@material-ui/core/es/CardActions/CardActions";
import Button from "@material-ui/core/es/Button/Button";
import CardContent from "@material-ui/core/es/CardContent/CardContent";
import Typography from "@material-ui/core/es/Typography/Typography";
import GridListTile from "@material-ui/core/es/GridListTile/GridListTile";
import GridList from "@material-ui/core/es/GridList/GridList";
import {Link} from "react-router-dom";

const styles = (theme) => ({
  campaigns: {
    root: {
      display: 'flex',
      flexWrap: 'wrap',
      justifyContent: 'space-around',
      overflow: 'hidden',
      backgroundColor: theme.palette.background.paper,
    },
    gridList: {
      width: 500,
      height: 450,
    },
    subheader: {
      width: '100%',
    },
  }
});

class UserHomeBody extends Component {
  static propTypes = {
    campaigns: PropTypes.object,
    createCampaign: PropTypes.func
  }

  componentWillMount() {
    this.props.loadCampaigns();
  }

  renderCampaigns() {
    const {campaigns, createCampaign} = this.props

    const classes = this.props.classes.campaigns;

    return (
        <div className={classes.root} elevation={4}>
          <Typography variant="headline" component="h2">
            Campaigns
            <IconButton onClick={() => createCampaign({"name": "Test!!"})} color={"inherit"}>
              <AddCircleOutlineIcon/>
            </IconButton>
          </Typography>
          <GridList cellHeight={160} className={classes.gridList} cols={4}>
          {
            campaigns.instances.map(function (campaign, index) {
              return (
                <GridListTile key={campaign.campaignId} cols={1}>
                  <Card className={classes.campaignCard} key={index}>
                    <CardContent>
                      <Typography className={classes.campaignTitle} color="textSecondary">
                        {campaign.name}
                      </Typography>
                    </CardContent>
                    <CardActions>
                      <Button size="small"><Link to={`/campaign/${campaign.campaignId}`}>Start Playing</Link></Button>
                      <Button size="small"><Link to={`/campaign/${campaign.campaignId}/info`}>More Info</Link></Button>
                    </CardActions>
                  </Card>
                </GridListTile>
              )})
          }
          </GridList>
        </div>
    )
  }

  render() {
    return (
        <React.Fragment>
          <h1>Live Your RPG</h1>
          {
            this.renderCampaigns()
          }
        </React.Fragment>
    );
  }
}

export default withStyles(styles)(UserHomeBody)