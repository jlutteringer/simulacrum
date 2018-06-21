import React, { Component } from 'react';
import { withStyles } from '@material-ui/core/styles';

const styles = (theme) => ({
  root: {
    paddingLeft: 32,
    paddingRight: 32
  }
});

class Main extends Component {
  static propTypes = {

  }

  render() {
    const { classes } = this.props;

    return (
        <main className={classes.root}>
          {this.props.children}
        </main>
    );
  }
}

export default withStyles(styles)(Main);