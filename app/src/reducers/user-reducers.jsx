import UserActions from "../actions/user-actions";

const initialState = {

}

export function userReducer(state = initialState, action) {
  switch (action.type) {
    case UserActions.Types.UPDATE_USER:
      return Object.assign({}, state, {
        username: action.username
      })
    default:
      return state
  }
}

