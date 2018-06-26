import {combineReducers} from 'redux';
import {userReducer} from './UserReducer';
import {campaignReducer} from "./CampaignReducer";

export default combineReducers({
  user: userReducer,
  campaigns: campaignReducer
});
