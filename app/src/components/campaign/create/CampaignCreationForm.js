import React from "react";
import {Field, reduxForm} from "redux-form";
import Button from "@material-ui/core/es/Button/Button";
import CardActions from "@material-ui/core/es/CardActions/CardActions";
import Card from "@material-ui/core/es/Card/Card";
import CardContent from "@material-ui/core/es/CardContent/CardContent";
import {withStyles} from "@material-ui/core/styles";
import Typography from "@material-ui/core/es/Typography/Typography";
import {FormTextField} from "components/util/FormTextField";
import PropTypes from "prop-types";

const styles = (theme) => ({
  campaignFormContainer: {
    display: "flex",
    justifyContent: "center",
  },
  campaignForm: {

  },
  campaignFormTitle: {

  },
});

const validate = (values) => {
  const errors = {};
  const requiredFields = ["name"];
  requiredFields.forEach((field) => {
    if (!values[field]) {
      errors[field] = "Required";
    }
  });
  return errors;
};

class CampaignCreationForm extends React.Component {
  static propTypes = {
    handleSubmit: PropTypes.func.isRequired,
    classes: PropTypes.object.isRequired,
    pristine: PropTypes.bool.isRequired,
    submitting: PropTypes.bool.isRequired,
  };

  render() {
    const {handleSubmit, pristine, submitting, classes} = this.props;
    return (
      <div className={classes.campaignFormContainer}>
        <form onSubmit={handleSubmit}>
          <Card className={classes.campaignForm}>
            <CardContent>
              <Typography variant="headline" color={"inherit"} gutterBottom className={classes.campaignFormTitle}>
                Start your next Adventure
              </Typography>
              <div>
                <Field name="name" component={FormTextField} label="Name"/>
              </div>
            </CardContent>
            <CardActions>
              <Button type="submit" disabled={pristine || submitting} color={"inherit"}>Create Campaign</Button>
            </CardActions>
          </Card>
        </form>
      </div>
    );
  }
}

export default withStyles(styles)(reduxForm({
  form: "CampaignInfoForm",
  validate,
})(CampaignCreationForm));
