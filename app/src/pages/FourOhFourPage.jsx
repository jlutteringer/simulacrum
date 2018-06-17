import React, {Component} from 'react';
import HeaderContainer from "../containers/HeaderContainer";

export default class FourOhFourPage extends Component {
  render() {
    return (
        <div>
          <HeaderContainer />
          <div>
            <p>Error!!</p>
          </div>
        </div>
    )
  }
}