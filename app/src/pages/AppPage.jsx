import React, {Component} from 'react';
import PageRoutesContainer from "../containers/PageRoutesContainer";
import AppContainer from "../containers/AppContainer";

export default class AppPage extends Component {
  render() {
    return (
        <AppContainer>
          <PageRoutesContainer />
        </AppContainer>
    )
  }
}