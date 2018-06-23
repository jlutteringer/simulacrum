import React, { Component } from 'react';
import PropTypes from "prop-types";
import {Link} from "react-router-dom";
import Menu from "@material-ui/core/es/Menu/Menu";
import MenuItem from "@material-ui/core/es/MenuItem/MenuItem";
import IconButton from "@material-ui/core/es/IconButton/IconButton";
import AccountCircleIcon from '@material-ui/icons/AccountCircle';
import ListItemText from "@material-ui/core/es/ListItemText/ListItemText";

class UserNavMenu extends Component {
  static propTypes = {
    handleLogoutClick: PropTypes.func.isRequired
  }

  constructor(props) {
    super(props)
    this.state = {
      anchorEl: null,
    };

    this.handleClick = this.handleClick.bind(this)
    this.handleClose = this.handleClose.bind(this)
  }

  handleClick = event => {
    this.setState({ anchorEl: event.currentTarget });
  };

  handleClose = () => {
    this.setState({ anchorEl: null });
  };

  render() {
    const { anchorEl} = this.state;
    const { handleLogoutClick } = this.props;

    return (
        <React.Fragment>
          <IconButton

              aria-owns={anchorEl ? 'simple-menu' : null}
              aria-haspopup="true"
              onClick={this.handleClick}
              color={"inherit"}>
            <AccountCircleIcon />
          </IconButton>
          <Menu id="simple-menu"
                anchorEl={anchorEl}
                open={Boolean(anchorEl)}
                onClose={this.handleClose}
          >
            <MenuItem><Link to={'/account'}>My account</Link></MenuItem>
            <MenuItem onClick={handleLogoutClick}>
              <ListItemText primary={"Logout"}  />
            </MenuItem>
          </Menu>
        </React.Fragment>
    );
  }
}

export default UserNavMenu;