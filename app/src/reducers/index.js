import {combineReducers} from 'redux';
import {userReducer} from './user-reducer';
import {campaignReducer} from "./campaign-reducer";

export default combineReducers({
  user: userReducer,
  campaigns: campaignReducer
});
