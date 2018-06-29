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
import {Link} from "react-router-dom";
import CardMedia from "@material-ui/core/es/CardMedia/CardMedia";
import Grid from "@material-ui/core/es/Grid/Grid";

const styles = (theme) => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap',
    justifyContent: 'start',
    overflow: 'hidden',
  },
  campaignGrid: {
    marginBottom: 0
  },
  campaignCard: {
    width: '250px',
    maxWidth: '100%',
    margin: 'auto',
    marginBottom: 16
  },
  subheader: {
    width: '100%',
  },
  media: {
    height: 0,
    paddingTop: '56.25%',
    width: '100%'
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
    const {campaigns, classes, createCampaign} = this.props

    return (
        <div className={classes.root} elevation={4}>
          <div>
            <Typography variant="headline" component="h2" align={"center"}>
              Campaigns
              <IconButton onClick={() => createCampaign({"name": "Test!!"})} color={"inherit"}>
                <AddCircleOutlineIcon/>
              </IconButton>
            </Typography>
          </div>
          <Grid container spacing={32} className={classes.campaignGrid}>
          {
            campaigns.instances.map(function (campaign, index) {
              return (
                <Grid item xs={12} sm={6} md={6} lg={4} xl={3} key={index}>
                  <Card className={classes.campaignCard}>
                    <CardMedia
                        image="http://via.placeholder.com/250x150"
                        title="Placeholder"
                        className={classes.media}
                    />
                    <CardContent>
                      <Typography className={classes.campaignTitle} color="primary">
                        {campaign.name}
                      </Typography>
                    </CardContent>
                    <CardActions>
                      <Button size="small"><Link to={`/campaigns/${campaign.id}`}>Start Playing</Link></Button>
                      <Button size="small"><Link to={`/campaigns/${campaign.id}/info`}>Campaign Info</Link></Button>
                    </CardActions>
                  </Card>
                </Grid>
              )})
          }
          </Grid>
        </div>
    )
  }

  render() {
    return (
        <React.Fragment>
          <Grid container>
            <Grid item sm={12} md={8}>
              {
                this.renderCampaigns()
              }
            </Grid>
            <Grid item sm={12} md={4}>

            </Grid>
          </Grid>
        </React.Fragment>
    );
  }
}

export default withStyles(styles)(UserHomeBody)