import EntitiesSection from "components/campaign/info/EntitiesSection";
import React, {Component} from "react";
import PropTypes from "prop-types";
import _ from "lodash";

class EntityGrid extends Component {
  static propTypes = {
    campaign: PropTypes.object.isRequired,
    classes: PropTypes.object.isRequired,
  };

  render() {
    const {campaign} = this.props;
    if (campaign == null) {
      return null;
    }
    const entities = campaign.entities;
    if (entities == null) {
      return null;
    }

    const entityTypeOrder = ["PLAYER", "GOD", "CITY"];

    return (
        <React.Fragment>
          {
            entityTypeOrder.map(function(type, key) {
              const filteredEntities = _.filter(campaign.entities, (e) => e.type === type);
              return <EntitiesSection key={key} type={type} entities={filteredEntities}/>;
            })
          }

          <EntitiesSection type={"MISC"}
                           entities={_.filter(campaign.entities, (e) => !_.includes(entityTypeOrder, e.type))}/>
        </React.Fragment>
    );
  }
}

export default EntityGrid;
