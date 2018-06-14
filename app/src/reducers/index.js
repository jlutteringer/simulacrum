import {combineReducers} from 'redux';
import {userReducer} from './user-reducers.jsx';

export default combineReducers({
  user: userReducer
});
