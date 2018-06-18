import React from 'react'
import PropTypes from 'prop-types';
import {GoogleLogout} from 'react-google-login';
import Button from "@material-ui/core/Button";

export default class Logout extends React.Component {
  static propTypes = {
    logout : PropTypes.func.required
  }
  render() {
    return <GoogleLogout
        onLogoutSuccess={this.props.logout}
        disabledStyle={true}
    >

    </GoogleLogout>
  }
}