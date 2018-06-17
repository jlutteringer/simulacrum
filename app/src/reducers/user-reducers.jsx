import {TYPES} from "../actions/user-actions";

const INITIAL_STATE = {
  status: "LOADING",
  info: null
}

export function userReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case TYPES.LOAD_USER_FROM_TOKEN:
      return { ...state, info: null, status: "LOADING"};
    case TYPES.LOAD_USER_FROM_TOKEN_SUCCESS:
      return { ...state, info: action.user, status: "LOGGED IN"};
    case TYPES.LOGIN_USER_SUCCESS:
      return { ...state, info: action.user, status: "LOGGED IN"};
    case TYPES.LOGOUT_USER:
      return { ...state, info: null, status: "LOGGED OUT"};
    default:
      return state
  }
}

