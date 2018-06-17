import axios from 'axios'

const ROOT_URL = 'http://localhost:8080';

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
  return localStorage.getItem('accessToken');
}

function clearToken() {
  axios.defaults.headers.common['Authorization'] = null;
  localStorage.removeItem('accessToken');
}

export function login(googleUser) {
  return (dispatch) => {
    setUserToken(googleUser.accessToken)

    return axios.get(`${ROOT_URL}/user`)
    .then(response => {
      dispatch(loginUserSuccess(response.data))
    })
    .catch((error) => {
      dispatch(loginUserFailure(error))
    });
  }
}

export function loadUserFromToken() {
  return (dispatch) => {
    let token = getToken();
    if (!token || token === '') {
      return;
    }

    // TODO check for an expired token

    return axios({
      method: 'get',
      url: `${ROOT_URL}/user`,
      headers: {
        'Authorization': `Bearer ${token}`
      }
    })
    .then(response => {
      dispatch(loadUserFromTokenSuccess(token, response.data))
    }).catch((error) => {
      dispatch(loadUserFromTokenFailure(error))
    });
  }
}

export function loadUserFromTokenSuccess(token, user) {
  setUserToken(token)
  return {
    type: TYPES.LOAD_USER_FROM_TOKEN_SUCCESS,
    user
  };
}

export function loadUserFromTokenFailure(error) {
  console.log(error)
  clearToken()
  return {
    type: TYPES.LOAD_USER_FROM_TOKEN_FAILURE,
    error
  };
}

export function loginUserSuccess(user) {
  return {
    type: TYPES.LOGIN_USER_SUCCESS,
    user
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
