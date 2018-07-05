import {combineReducers} from "redux";
import {userReducer} from "./UserReducer";
import {campaignReducer} from "reducers/CampaignReducer";
import {reducer as formReducer} from "redux-form";
import {notificationReducer} from "reducers/NotificationsReducer";

export default combineReducers({
  user: userReducer,
  notifications: notificationReducer,
  campaigns: campaignReducer,
  form: formReducer,
});
