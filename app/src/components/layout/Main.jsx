import React, {Component} from "react";
import PropTypes from "prop-types";
import {withStyles} from "@material-ui/core/styles";

const styles = (theme) => ({
  main: {
    paddingLeft: 32,
    paddingRight: 32,
    minHeight: 100,
  },
});

class Main extends Component {
  static propTypes = {
    classes: PropTypes.object.isRequired,
    children: PropTypes.node,
  };

  render() {
    const {classes} = this.props;

    return (
        <main className={classes.main}>
          {this.props.children}
        </main>
    );
  }
}

export default withStyles(styles)(Main);
