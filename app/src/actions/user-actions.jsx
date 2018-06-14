import axios from 'axios'

const UserActions = {}

UserActions.Types = {
  UPDATE_USER: 'UPDATE_USER'
}

UserActions.login = function (googleUser) {
  return dispatch => {
    console.log(googleUser)

    // TODO where to load
    window.localStorage["tokenId"] = googleUser.tokenId

    axios.defaults.headers.common['Authorization'] = `Bearer ${googleUser.accessToken}`;

    return axios.get('http://localhost:8080/user').then(response => {
      dispatch({
        type: UserActions.Types.UPDATE_USER,
        ...response.data
      })
    })
  }
}

// UserActions.register = function (googleUser) {
//   axios.defaults.headers.common['Authorization'] = `Bearer ${googleUser.tokenId}`;
//
//   return axios.post('http://localhost:8080/user/register').then(response => {
//     console.log(response)
//     return this.login(googleUser)
//   })
// }

export default UserActions