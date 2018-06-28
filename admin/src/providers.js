import {AUTH_LOGIN, fetchUtils} from 'react-admin';
import simpleRestProvider from 'ra-data-simple-rest';

export const authProvider = (type, params) => {
  if (type === AUTH_LOGIN) {
    const { accessToken } = params;
    const request = new Request('/api/user', {
      method: 'GET',
      headers: new Headers({ 'Authorization': `Bearer ${accessToken}` }),
    })
    return fetch(request)
    .then(response => {
      if (response.status < 200 || response.status >= 300) {
        throw new Error(response.statusText);
      }
      localStorage.setItem('token', accessToken);
    });
  }
  return Promise.resolve();
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
