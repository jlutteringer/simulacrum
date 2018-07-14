import React, {Component} from "react";
import {withStyles} from "@material-ui/core/styles";
import PropTypes from "prop-types";
import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";
import Typography from "@material-ui/core/Typography";
import CardMedia from "@material-ui/core/CardMedia";
import Grid from "@material-ui/core/Grid";

const styles = (theme) => ({
  entities: {
    display: "flex",
    flexWrap: "wrap",
    justifyContent: "start",
    overflow: "hidden",
  },
  entityGrid: {
    marginBottom: 0,
  },
  entityCard: {
    // width: "250px",
    // maxWidth: "100%",
    // margin: "auto",
    // marginBottom: 16,
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

class EntitiesSection extends Component {
  static propTypes = {
    classes: PropTypes.object.isRequired,
    entities: PropTypes.array.isRequired,
    type: PropTypes.string.isRequired,
  };

  render() {
    const {classes, entities, type} = this.props;
    if (entities.length === 0) {
      return null;
    }

    return (
        <div className={classes.entities}>
          <div>
            <Typography variant="headline" component="h2" align={"center"}>{type}</Typography>
          </div>
          <Grid container spacing={32} className={classes.entityGrid}>
            {
              entities.map(function(entity, index) {
                return (
                    <Grid item xs={12} sm={6} md={6} lg={4} xl={3} key={index}>
                      <Card className={classes.entityCard}>
                        <CardMedia
                            image="http://via.placeholder.com/250x150"
                            title="Placeholder"
                            className={classes.media}
                        />
                        <CardContent>
                          <Typography className={classes.entityTitle} color="primary">
                            {entity.name}
                          </Typography>
                        </CardContent>
                      </Card>
                    </Grid>
                );
              })
            }
          </Grid>
        </div>
    );
  }
}

export default withStyles(styles)(EntitiesSection);
