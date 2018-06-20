import {TYPES} from "../actions/campaign-actions";

const INITIAL_STATE = {
  isLoading: true,
  instances: [],
  error: false
}

export function campaignReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case TYPES.LOAD_CAMPAIGN_SUCCESS:
      return { ...state, instances: action.campaigns, isLoading: false, error: false};
    case TYPES.LOAD_CAMPAIGN_FAILURE:
      return { ...state, instances: [], isLoading: false, error: action.error};
      case TYPES.ADD_CAMPAIGN_SUCCESS:
      return { ...state, instances: [...state.instances, action.campaign], error: false};
    case TYPES.LOAD_CAMPAIGN_FAILURE:
      return { ...state, error: action.error};
    default:
      return state
  }
}

