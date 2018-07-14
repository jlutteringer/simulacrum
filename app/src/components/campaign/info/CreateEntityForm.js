import Button from "@material-ui/core/Button";
import React from "react";
import PropTypes from "prop-types";
import {withStyles} from "@material-ui/core/styles";
import _ from "lodash";
import {Redirect} from "react-router-dom";
import CardActions from "@material-ui/core/CardActions";
import {Field, reduxForm} from "redux-form";
import Typography from "@material-ui/core/Typography";
import CardContent from "@material-ui/core/CardContent";
import Card from "@material-ui/core/Card";
import {FormTextField} from "components/util/ReduxFields";

const styles = (themes) => ({
  campaignInfoContainer: {
    display: "flex",
    justifyContent: "center",
  },
});

const validate = (values) => {
  const errors = {};
  const requiredFields = ["email"];
  requiredFields.forEach((field) => {
    if (!values[field]) {
      errors[field] = "Required";
    }
  });
  return errors;
};

class CreateEntityForm extends React.Component {
  static propTypes = {
    campaignId: PropTypes.number.isRequired,
    loadCampaign: PropTypes.func.isRequired,
    initialize: PropTypes.func.isRequired,
    handleSubmit: PropTypes.func.isRequired,
    invitePlayer: PropTypes.func.isRequired,
    campaign: PropTypes.object.isRequired,
    classes: PropTypes.object.isRequired,
    isLoading: PropTypes.bool.isRequired,
    pristine: PropTypes.bool.isRequired,
    submitting: PropTypes.bool.isRequired,
  };

  componentDidMount() {
    if (_.isEmpty(this.props.campaign)) {
      const campaignId = _.toNumber(this.props.campaignId);
      this.props.loadCampaign(campaignId);
      this.props.initialize(this.props.campaignId);
    }
  }

  render() {
    const {handleSubmit, pristine, submitting, classes, isLoading, campaign, invitePlayer} = this.props;

    if (isLoading) {
      return null;
    }

    return (
        <div className={classes.campaignInfoContainer}>
          <form onSubmit={handleSubmit(invitePlayer)}>
            <Card className={classes.campaignForm}>
              <CardContent>
                <Typography variant="headline" color={"inherit"} gutterBottom className={classes.campaignFormTitle}>
                  Add a New Character
                </Typography>
                <div>
                  <Field name="name" type="text"
                         component={FormTextField} label="Name"
                  />
                  <Field name="type" type="text"
                         component={FormTextField} label="Type"
                  />
                </div>
              </CardContent>
              <CardActions>
                <Button type="submit" disabled={pristine || submitting} color={"inherit"}>Create Character</Button>
              </CardActions>
            </Card>
          </form>
        </div>
    );
  }
}

export default withStyles(styles)(reduxForm({
  form: "CreateEntityForm",
  validate,
})(CreateEntityForm));
