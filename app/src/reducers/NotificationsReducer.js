import _ from "lodash";
import {TYPES} from "actions/NotificationActions";

const INITIAL_STATE = {
  isLoggedIn: false,
  isLoading: true,
  info: null,
  isLoadingNotifications: true,
  instances: [],
};

export function notificationReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case TYPES.LOAD_NOTIFICATIONS_START:
      return {...state, isLoadingNotifications: true};
    case TYPES.LOAD_NOTIFICATIONS_SUCCESS:
      return {...state, instances: action.notifications,
        isLoadingNotifications: false};
    case TYPES.LOAD_NOTIFICATIONS_FAILURE:
      return {...state, instances: [], isLoadingNotifications: false};
    // case TYPES.MARK_NOTIFICATION_READ_START:
      // return { ...state, instances: [], isLoadingNotifications: true};
    case TYPES.MARK_NOTIFICATION_READ_SUCCESS:
      return {...state, instances: replace(state.instances, action.notification)};
    // case TYPES.MARK_NOTIFICATION_READ_FAILURE:
    //   return { ...state, instances: [], isLoadingNotifications: false};
    default:
      return state;
  }
}

const replace = (notifications, notification) => {
  const newNotifications = _.filter(notifications, (n) => {
    return notification.id !== n.id;
  });
  newNotifications.push(notification);
  return newNotifications;
};
