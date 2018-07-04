import axios from 'axios/index';

export const TYPES = {
  LOAD_NOTIFICATIONS_START: 'LOAD_NOTIFICATIONS_START',
  LOAD_NOTIFICATIONS_SUCCESS: 'LOAD_NOTIFICATIONS_SUCCESS',
  LOAD_NOTIFICATIONS_FAILURE: 'LOAD_NOTIFICATIONS_FAILURE',
  MARK_NOTIFICATION_READ_START: 'MARK_NOTIFICATION_READ_START',
  MARK_NOTIFICATION_READ_SUCCESS: 'MARK_NOTIFICATION_READ_SUCCESS',
  MARK_NOTIFICATION_READ_FAILURE: 'MARK_NOTIFICATION_READ_FAILURE',
};

export function loadNotifications() {
  return (dispatch) => {
    dispatch(loadNotificationsStart());
    return axios.get(`/api/notifications/currentUser`)
    .then((response) => {
      dispatch(loadNotificationsSuccess(response.data));
    }).catch((error) => {
      dispatch(loadNotificationsFailure(error));
    });
  };
}

export function markNotificationRead(notificationId) {
  return (dispatch) => {
    dispatch(markNotificationReadStart(notificationId));
    return axios.post(`/api/notifications/${notificationId}/read`)
    .then((response) => {
      dispatch(markNotificationReadSuccess(response.data));
    }).catch((error) => {
      dispatch(markNotificationReadFailure(error, notificationId));
    });
  };
}

export function loadNotificationsStart(notifications) {
  return {
    type: TYPES.LOAD_NOTIFICATIONS_START,
    notifications,
  };
}

export function loadNotificationsSuccess(notifications) {
  return {
    type: TYPES.LOAD_NOTIFICATIONS_SUCCESS,
    notifications,
  };
}

export function loadNotificationsFailure(error) {
  return {
    type: TYPES.LOAD_NOTIFICATIONS_FAILURE,
    error,
  };
}

export function markNotificationReadStart(notificationId) {
  return {
    type: TYPES.MARK_NOTIFICATION_READ_START,
    notificationId,
  };
}

export function markNotificationReadSuccess(notification) {
  return {
    type: TYPES.MARK_NOTIFICATION_READ_SUCCESS,
    notification,
  };
}

export function markNotificationReadFailure(error, notificationId) {
  return {
    type: TYPES.MARK_NOTIFICATION_READ_FAILURE,
    error,
    notificationId,
  };
}
