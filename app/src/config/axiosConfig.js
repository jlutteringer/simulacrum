import axios from "axios/index";

const configureAxios = (history, store) => {
  const timeoutDuration = 1000 * 60 * 60;
  let timeoutInterval;

  const logout = () => {
    localStorage.clear();
    store.dispatch(
        {
          "type": "TIMEOUT",
        }
    );
    history.push("/login");
  };

  const startLogoutTimer = () => {
    clearInterval(timeoutInterval);
    timeoutInterval = setInterval(logout, timeoutDuration);
  };

  axios.interceptors.response.use(function(response) {
    startLogoutTimer();
    return response;
  }, function(error) {
    if (401 === error.response.status) {
      logout();
    } else {
      return Promise.reject(error);
    }
  });
};

export default configureAxios;
