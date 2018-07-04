import axios from 'axios';
import {history} from 'App';

export const TYPES = {
  LOAD_CAMPAIGN_START: 'LOAD_CAMPAIGN_START',
  LOAD_CAMPAIGN_SUCCESS: 'LOAD_CAMPAIGN_SUCCESS',
  LOAD_CAMPAIGN_FAILURE: 'LOAD_CAMPAIGN_FAILURE',
  LOAD_CAMPAIGNS_START: 'LOAD_CAMPAIGNS_START',
  LOAD_CAMPAIGNS_SUCCESS: 'LOAD_CAMPAIGNS_SUCCESS',
  LOAD_CAMPAIGNS_FAILURE: 'LOAD_CAMPAIGNS_FAILURE',
  ADD_CAMPAIGN_SUCCESS: 'ADD_CAMPAIGN_SUCCESS',
  ADD_CAMPAIGN_FAILURE: 'ADD_CAMPAIGN_FAILURE',
  CREATE_CAMPAIGN_SUCCESS: 'CREATE_CAMPAIGN_SUCCESS',
  CREATE_CAMPAIGN_FAILURE: 'CREATE_CAMPAIGN_FAILURE',
  INVITE_PLAYER_SUCCESS: 'INVITE_PLAYER_SUCCESS',
  INVITE_PLAYER_FAILURE: 'INVITE_PLAYER_FAILURE',
  ACCEPT_INVITE_SUCCESS: 'ACCEPT_INVITE_SUCCESS',
  ACCEPT_INVITE_FAILURE: 'ACCEPT_INVITE_FAILURE',
};

export function loadCampaigns() {
  return (dispatch, getState) => {
    dispatch(loadCampaignsStart());
    return axios.get(`/api/campaigns/currentUser`)
    .then((response) => {
      dispatch(loadCampaignsSuccess(response.data));
    }).catch((error) => {
      dispatch(loadCampaignsFailure(error));
    });
  };
}

export function loadCampaign(campaignId) {
  return (dispatch, getState) => {
    dispatch(loadCampaignStart(campaignId));
    return axios.get(`/api/campaigns/${campaignId}/load`)
    .then((response) => {
      dispatch(loadCampaignSuccess(response.data));
    }).catch((error) => {
      dispatch(loadCampaignFailure(error));
    });
  };
}

export function createCampaign(campaign) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaigns`, campaign)
    .then((response) => {
      dispatch(createCampaignSuccess(response.data));
      history.push(`/campaigns/${response.data.id}/info`);
    }).catch((error) => {
      dispatch(createCampaignFailure(error));
    });
  };
}

export function invitePlayer(campaignId, username) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaigns/invite`, {campaignId, username})
    .then((response) => {
      dispatch(invitePlayerSuccess(response.data));
    }).catch((error) => {
      dispatch(invitePlayerFailure(error));
    });
  };
}

export function acceptInvite(notification) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaigns/invite/${notification.token}/accept`)
    .then((response) => {
      dispatch(acceptInviteSuccess(response.data));
    }).catch((error) => {
      dispatch(acceptInviteFailure(error));
    });
  };
}

export function declineInvite(notification) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaigns/invite/${notification.token}/decline`)
    .then((response) => {
      dispatch(invitePlayerSuccess(response.data));
    }).catch((error) => {
      dispatch(invitePlayerFailure(error));
    });
  };
}

export function loadCampaignsStart(campaigns) {
  return {
    type: TYPES.LOAD_CAMPAIGNS_START,
    campaigns,
  };
}

export function loadCampaignsSuccess(campaigns) {
  return {
    type: TYPES.LOAD_CAMPAIGNS_SUCCESS,
    campaigns,
  };
}

export function loadCampaignsFailure(error) {
  return {
    type: TYPES.LOAD_CAMPAIGNS_FAILURE,
    error,
  };
}

export function loadCampaignStart(campaignId) {
  return {
    type: TYPES.LOAD_CAMPAIGN_START,
    campaignId,
  };
}

export function loadCampaignSuccess(campaign) {
  return {
    type: TYPES.LOAD_CAMPAIGN_SUCCESS,
    campaign,
  };
}

export function loadCampaignFailure(error) {
  return {
    type: TYPES.LOAD_CAMPAIGN_FAILURE,
    error,
  };
}

export function addCampaignSuccess(campaign) {
  return {
    type: TYPES.ADD_CAMPAIGN_SUCCESS,
    campaign,
  };
}

export function addCampaignFailure(error) {
  return {
    type: TYPES.ADD_CAMPAIGN_FAILURE,
    error,
  };
}

export function createCampaignSuccess(campaign) {
  return {
    type: TYPES.CREATE_CAMPAIGN_SUCCESS,
    campaign,
  };
}

export function createCampaignFailure(error) {
  return {
    type: TYPES.CREATE_CAMPAIGN_FAILURE,
    error,
  };
}

export function invitePlayerSuccess(campaign) {
  return {
    type: TYPES.INVITE_PLAYER_FAILURE,
    campaign,
  };
}

export function invitePlayerFailure(error) {
  return {
    type: TYPES.INVITE_PLAYER_FAILURE,
    error,
  };
}

export function acceptInviteSuccess(campaign) {
  return {
    type: TYPES.ACCEPT_INVITE_SUCCESS,
    campaign,
  };
}

export function acceptInviteFailure(error, notification) {
  return {
    type: TYPES.ACCEPT_INVITE_FAILURE,
    error,
    notification,
  };
}
