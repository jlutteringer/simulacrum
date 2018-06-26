import axios from 'axios'
import _ from 'lodash'

export const TYPES = {
  UPDATE_USER: 'UPDATE_USER',
  LOAD_USER_FROM_TOKEN: 'LOAD_USER_FROM_TOKEN',
  LOAD_USER_FROM_TOKEN_SUCCESS: 'LOAD_USER_FROM_TOKEN_SUCCESS',
  LOAD_USER_FROM_TOKEN_FAILURE: 'LOAD_USER_FROM_TOKEN_FAILURE',
  RESET_TOKEN: 'RESET_TOKEN',
  LOGIN_USER_SUCCESS: 'LOGIN_USER_SUCCESS',
  LOGIN_USER_FAILURE: 'LOGIN_USER_FAILURE',
  LOGOUT_USER: 'LOGOUT_USER',
  USER_FROM_TOKEN: 'USER_FROM_TOKEN'
}

function setUserToken(token) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${token}`;
  localStorage.setItem('accessToken', token)
}

function getToken() {
  const token = localStorage.getItem('accessToken');
  axios.defaults.headers.common['Authorization'] = `Bearer ${token}`;
  return token
}

function clearToken() {
  axios.defaults.headers.common['Authorization'] = null;
  localStorage.removeItem('accessToken');
}

export function login(googleUser) {
  return (dispatch) => {
    setUserToken(googleUser.accessToken)

    return axios.get(`/api/user`)
    .then(response => {
      dispatch(loginUserSuccess(response.data, googleUser.accessToken))
    })
    .catch((error) => {
      dispatch(loginUserFailure(error))
    });
  }
}

export function loadUserFromToken() {
  return (dispatch) => {
    let token = getToken();
    if (_.isEmpty(token)) {
      dispatch(loadUserFromTokenFailure("No Token"))
      return;
    }

    // TODO check for an expired token
    return axios.get(`/api/user`, {
      headers: {
        'Authorization': `Bearer ${token}`
      }
    })
    .then(response => {
      dispatch(loadUserFromTokenSuccess(response.data, token))
    }).catch((error) => {
      dispatch(loadUserFromTokenFailure(error))
    });
  }
}

export function loadUserFromTokenSuccess(user, token) {
  setUserToken(token)
  return {
    type: TYPES.LOAD_USER_FROM_TOKEN_SUCCESS,
    user,
    token
  };
}

export function loadUserFromTokenFailure(error) {
  clearToken()
  return {
    type: TYPES.LOAD_USER_FROM_TOKEN_FAILURE,
    error
  };
}

export function loginUserSuccess(user, token) {
  return {
    type: TYPES.LOGIN_USER_SUCCESS,
    user,
    token
  };
}

export function loginUserFailure(error) {
  return {
    type: TYPES.LOGIN_USER_FAILURE,
    error
  };
}

export function logoutUser() {
  clearToken()

  return {
    type: TYPES.LOGOUT_USER
  };
}
