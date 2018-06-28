import {AUTH_LOGIN, AUTH_LOGOUT, AUTH_ERROR, AUTH_CHECK, fetchUtils} from 'react-admin';
import simpleRestProvider from 'ra-data-simple-rest';

export const authProvider = (type, params) => {
  // called when the user attempts to log in
  if (type === AUTH_LOGIN) {
    const { access_token } = params.Zi;
    const request = new Request('/api/users/currentUser', {
      method: 'GET',
      headers: new Headers({ 'Authorization': `Bearer ${access_token}` }),
    })
    return fetch(request)
    .then(response => {
      if (response.status < 200 || response.status >= 300) {
        throw new Error(response.statusText);
      }
      localStorage.setItem('token', access_token);
      return Promise.resolve();
    });
  }
  // called when the user clicks on the logout button
  if (type === AUTH_LOGOUT) {
    localStorage.removeItem('token');
    return Promise.resolve();
  }
  // called when the API returns an error
  if (type === AUTH_ERROR) {
    const { status } = params;
    if (status === 401 || status === 403) {
      localStorage.removeItem('token');
      return Promise.reject();
    }
    return Promise.resolve();
  }
  // called when the user navigates to a new location
  if (type === AUTH_CHECK) {
    return localStorage.getItem('token')
        ? Promise.resolve()
        : Promise.reject();
  }

  return Promise.reject('Unknown method');
}

const httpClient = (url, options = {}) => {
  if (!options.headers) {
    options.headers = new Headers({ Accept: 'application/json' });
  }
  const token = localStorage.getItem('token');
  options.headers.set('Authorization', `Bearer ${token}`);
  return fetchUtils.fetchJson(url, options);
}
export const dataProvider = simpleRestProvider('api', httpClient);
