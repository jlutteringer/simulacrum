import React, { Component } from 'react';
import { withStyles } from '@material-ui/core/styles';
import Typography from "@material-ui/core/es/Typography/Typography";

const styles = (theme) => ({
  root: {
    height: 400,
    flexGrow: 1,
    display: 'flex',
    color: theme.palette.common.white,
    justifyContent: 'center',
    position: 'relative',
    marginBottom: '20px',
    "&:after" : {
      content: '""',
      // TODO Setup image credits
      background: 'url(https://c1.staticflickr.com/5/4259/35185763616_dc78259d19_h.jpg)',
      backgroundRepeatX: 'no-repeat',
      backgroundSize: '100%',
      opacity: 0.8,
      top: 0,
      left: 0,
      bottom: 0,
      right: 0,
      position: 'absolute',
      zIndex: -1,
      boxShadow: '0px 2px 4px -1px rgba(0, 0, 0, 0.2), 0px 4px 5px 0px rgba(0, 0, 0, 0.14), 0px 1px 10px 0px rgba(0, 0, 0, 0.12)'
    },

  },
  headerTitle: {
    fontWeight: 600
  },
  container: {

  }
});

class Header extends Component {
  static propTypes = {

  }

  render() {
    const {classes} = this.props;

    return (
      <div className={classes.root}>
        <div className={classes.container}>
          <Typography variant="display3" gutterBottom color={"inherit"} className={classes.headerTitle} style={{"fontWeight": "600"}}>
            Live Your Game
          </Typography>
        </div>
      </div>
    );
  }
}

export default withStyles(styles)(Header);