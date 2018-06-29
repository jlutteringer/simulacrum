import React, { Component } from 'react';
import { withStyles } from '@material-ui/core/styles';

const styles = (theme) => ({
  main: {
    paddingLeft: 32,
    paddingRight: 32,
    minHeight: 100
  }
});

class Main extends Component {
  static propTypes = {

  }

  render() {
    const { classes } = this.props;

    return (
        <main className={classes.main}>
          {this.props.children}
        </main>
    );
  }
}

export default withStyles(styles)(Main);