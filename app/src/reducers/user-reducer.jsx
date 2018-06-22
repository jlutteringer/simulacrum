import {TYPES} from "actions/user-actions";

const INITIAL_STATE = {
  isLoggedIn: false,
  isLoading: true,
  info: null
}

export function userReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case TYPES.LOAD_USER_FROM_TOKEN:
      return { ...state, info: null, isLoggedIn: false, isLoading: true};
    case TYPES.LOAD_USER_FROM_TOKEN_SUCCESS:
      return { ...state, info: action.user, isLoggedIn: true, isLoading: false};
    case TYPES.LOAD_USER_FROM_TOKEN_FAILURE:
      return { ...state, info: null, isLoggedIn: false, isLoading: false};
    case TYPES.LOGIN_USER_SUCCESS:
      return { ...state, info: action.user, isLoggedIn: true, isLoading: false};
    case TYPES.LOGOUT_USER:
      return { ...state, info: null, isLoggedIn: false, isLoading: false};
    default:
      return state
  }
}

