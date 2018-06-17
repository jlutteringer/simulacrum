import {TYPES} from "../actions/user-actions";

const INITIAL_STATE = {

}

export function userReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case TYPES.LOAD_USER_FROM_TOKEN_SUCCESS:
      return { ...action.user};
    case TYPES.LOGIN_USER_SUCCESS:
      return { ...action.user};
    case TYPES.LOGOUT_USER:
      return {};
    default:
      return state
  }
}

