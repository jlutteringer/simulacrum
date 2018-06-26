import axios from 'axios'

export const TYPES = {
  LOAD_CAMPAIGN_SUCCESS: 'LOAD_CAMPAIGN_SUCCESS',
  LOAD_CAMPAIGN_FAILURE: 'LOAD_CAMPAIGN_FAILURE',
  LOAD_CAMPAIGNS_SUCCESS: 'LOAD_CAMPAIGNS_SUCCESS',
  LOAD_CAMPAIGNS_FAILURE: 'LOAD_CAMPAIGNS_FAILURE',
  ADD_CAMPAIGN_SUCCESS: 'ADD_CAMPAIGN_SUCCESS',
  ADD_CAMPAIGN_FAILURE: 'ADD_CAMPAIGN_FAILURE'
}

export function loadCampaigns() {
  return (dispatch, getState) => {
    return axios.get(`/api/campaign`)
    .then(response => {
      dispatch(loadCampaignsSuccess(response.data))
    }).catch((error) => {
      dispatch(loadCampaignsFailure(error))
    });
  }
}

export function loadCampaign(campaignId) {
  return (dispatch, getState) => {
    return axios.get(`/api/campaign/${campaignId}`)
    .then(response => {
      dispatch(loadCampaignSuccess(response.data))
    }).catch((error) => {
      dispatch(loadCampaignFailure(error))
    });
  }
}

export function createCampaign(campaign) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaign`, campaign)
    .then(response => {
      dispatch(addCampaignsSuccess(response.data))
    }).catch((error) => {
      dispatch(addCampaignsFailure(error))
    });
  }
}

export function loadCampaignsSuccess(campaigns) {
  return {
    type: TYPES.LOAD_CAMPAIGNS_SUCCESS,
    campaigns
  }
}

export function loadCampaignsFailure(error) {
  console.log(error)
  return {
    type: TYPES.LOAD_CAMPAIGNS_FAILURE,
    error
  }
}

export function loadCampaignSuccess(campaign) {
  return {
    type: TYPES.LOAD_CAMPAIGN_SUCCESS,
    campaign
  }
}

export function loadCampaignFailure(error) {
  console.log(error)
  return {
    type: TYPES.LOAD_CAMPAIGN_FAILURE,
    error
  }
}

export function addCampaignsSuccess(campaign) {
  return {
    type: TYPES.ADD_CAMPAIGN_SUCCESS,
    campaign
  }
}

export function addCampaignsFailure(error) {
  console.log(error)
  return {
    type: TYPES.ADD_CAMPAIGN_FAILURE,
    error
  }
}