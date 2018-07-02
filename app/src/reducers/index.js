import {combineReducers} from 'redux';
import {userReducer} from './UserReducer';
import {campaignReducer} from "./CampaignReducer";
import { reducer as formReducer } from 'redux-form'

export default combineReducers({
  user: userReducer,
  campaigns: campaignReducer,
  form: formReducer
});
