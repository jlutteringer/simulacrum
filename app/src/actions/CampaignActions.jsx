import axios from 'axios'
import {history} from 'App'

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
  CREATE_CAMPAIGN_FAILURE: 'CREATE_CAMPAIGN_FAILURE'
}

export function loadCampaigns() {
  return (dispatch, getState) => {
    dispatch(loadCampaignsStart())
    return axios.get(`/api/campaigns/currentUser`)
    .then(response => {
      dispatch(loadCampaignsSuccess(response.data))
    }).catch((error) => {
      dispatch(loadCampaignsFailure(error))
    });
  }
}

export function loadCampaign(campaignId) {
  return (dispatch, getState) => {
    dispatch(loadCampaignStart(campaignId))
    return axios.get(`/api/campaigns/${campaignId}`)
    .then(response => {
      dispatch(loadCampaignSuccess(response.data))
    }).catch((error) => {
      dispatch(loadCampaignFailure(error))
    });
  }
}

export function createCampaign(campaign) {
  return (dispatch, getState) => {
    return axios.post(`/api/campaigns`, campaign)
    .then(response => {
      dispatch(createCampaignSuccess(response.data))
      history.push(`/campaigns/${response.data.id}/info`)
    }).catch((error) => {
      dispatch(createCampaignFailure(error))
    });
  }
}

export function loadCampaignsStart(campaigns) {
  return {
    type: TYPES.LOAD_CAMPAIGNS_START,
    campaigns
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

export function loadCampaignStart(campaignId) {
  return {
    type: TYPES.LOAD_CAMPAIGN_START,
    campaignId
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

export function addCampaignSuccess(campaign) {
  return {
    type: TYPES.ADD_CAMPAIGN_SUCCESS,
    campaign
  }
}

export function addCampaignFailure(error) {
  console.log(error)
  return {
    type: TYPES.ADD_CAMPAIGN_FAILURE,
    error
  }
}

export function createCampaignSuccess(campaign) {
  return {
    type: TYPES.CREATE_CAMPAIGN_SUCCESS,
    campaign
  }
}

export function createCampaignFailure(error) {
  console.log(error)
  return {
    type: TYPES.CREATE_CAMPAIGN_FAILURE,
    error
  }
}