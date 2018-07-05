import React from "react";
import PropTypes from "prop-types";
import TextField from "@material-ui/core/es/TextField/TextField";

export const FormTextField = ({input, label, meta: {touched, error}, ...custom}) => (
    <TextField placeholder={label}
               error={touched && error}
               helperText={touched && error}
               {...input}
               {...custom}
    />
);

FormTextField.propTypes = {
  input: PropTypes.any,
  label: PropTypes.string,
  meta: PropTypes.any,
};
