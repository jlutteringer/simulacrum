import React, {Component} from "react";
import {withStyles} from "@material-ui/core/styles";
import PropTypes from "prop-types";
import AddCircleOutlineIcon from "@material-ui/icons/AddCircleOutline";
import Card from "@material-ui/core/Card";
import CardActions from "@material-ui/core/CardActions";
import Button from "@material-ui/core/Button";
import CardContent from "@material-ui/core/CardContent";
import Typography from "@material-ui/core/Typography";
import {Link} from "react-router-dom";
import CardMedia from "@material-ui/core/CardMedia";
import Grid from "@material-ui/core/Grid";

const styles = (theme) => ({
  root: {
    display: "flex",
    flexWrap: "wrap",
    justifyContent: "start",
    overflow: "hidden",
  },
  campaignGrid: {
    marginBottom: 0,
  },
  campaignCard: {
    width: "250px",
    maxWidth: "100%",
    margin: "auto",
    marginBottom: 16,
  },
  subheader: {
    width: "100%",
  },
  media: {
    height: 0,
    paddingTop: "56.25%",
    width: "100%",
  },
});

class UserHomeBody extends Component {
  static propTypes = {
    campaigns: PropTypes.object.isRequired,
    loadCampaigns: PropTypes.func.isRequired,
    classes: PropTypes.object.isRequired,
  };

  componentDidMount() {
    this.props.loadCampaigns();
  }

  renderCampaigns() {
    const {campaigns, classes} = this.props;

    return (
        <div className={classes.root} elevation={4}>
          <div>
            <Typography variant="headline" component="h2" align={"center"}>
              Campaigns
              <Button component={Link} to={"/campaigns/new"}><AddCircleOutlineIcon/></Button>
            </Typography>
          </div>
          <Grid container spacing={32} className={classes.campaignGrid}>
          {
            campaigns.instances.map(function(campaign, index) {
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
                      <Button size="small" component={Link} to={`/campaigns/${campaign.id}`}>Start Playing</Button>
                      <Button size="small" component={Link} to={`/campaigns/${campaign.id}/info`}>Campaign Info</Button>
                    </CardActions>
                  </Card>
                </Grid>
              );
})
          }
          </Grid>
        </div>
    );
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

export default withStyles(styles)(UserHomeBody);
