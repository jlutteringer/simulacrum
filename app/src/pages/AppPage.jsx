import React, {Component} from 'react';
import AppContainer from "../containers/AppContainer";
import PageRoutesContainer from "../containers/PageRoutesContainer";

export default class AppPage extends Component {
  render() {
    return (
        <AppContainer>
          <PageRoutesContainer />
        </AppContainer>
    )
  }
}