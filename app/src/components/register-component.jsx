import React from 'react'
import {GoogleLogin} from 'react-google-login';
import UserActions from '../actions/user-actions';

class RegisterComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleUsernameChange = this.handleUsernameChange.bind(this);
    this.handlePasswordChange = this.handlePasswordChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleUsernameChange(event) {
    this.setState({username: event.target.value});
  }

  handlePasswordChange(event) {
    this.setState({password: event.target.value});
  }

  handleSubmit(event) {
    UserActions.register({username: this.state.username, password: this.state.password})
    event.preventDefault()
  }

  render() {
    return <form onSubmit={this.handleSubmit}>
      <label>
        Username:
        <input type="text" value={this.state.username} onChange={this.handleUsernameChange}/>
      </label>
      <label>
        Password:
        <input type="password" value={this.state.value} onChange={this.handlePasswordChange}/>
      </label>
      <input type="submit" value="Register" />
    </form>
  }
}

export default RegisterComponent