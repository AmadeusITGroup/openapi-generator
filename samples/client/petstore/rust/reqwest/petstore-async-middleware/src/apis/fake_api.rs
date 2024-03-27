/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::{apis::ResponseContent, models};
use super::{Error, configuration};

/// struct for passing parameters to the method [`test_nullable_required_param`]
#[derive(Clone, Debug)]
pub struct TestNullableRequiredParamParams {
    /// The name that needs to be fetched. Use user1 for testing.
    pub username: String,
    /// To test nullable required parameters
    pub dummy_required_nullable_param: Option<String>,
    /// To test parameter names in upper case
    pub uppercase: Option<String>
}


/// struct for typed successes of method [`test_nullable_required_param`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum TestNullableRequiredParamSuccess {
    Status200(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`test_nullable_required_param`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum TestNullableRequiredParamError {
    Status400(),
    Status404(),
    UnknownValue(serde_json::Value),
}


/// 
pub async fn test_nullable_required_param(configuration: &configuration::Configuration, params: TestNullableRequiredParamParams) -> Result<ResponseContent<TestNullableRequiredParamSuccess>, Error<TestNullableRequiredParamError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let username = params.username;
    let dummy_required_nullable_param = params.dummy_required_nullable_param;
    let uppercase = params.uppercase;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/fake/user/{username}", local_var_configuration.base_path, username=crate::apis::urlencode(username));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    match dummy_required_nullable_param {
        Some(local_var_param_value) => { local_var_req_builder = local_var_req_builder.header("dummy_required_nullable_param", local_var_param_value.to_string()); },
        None => { local_var_req_builder = local_var_req_builder.header("dummy_required_nullable_param", ""); },
    }
    if let Some(local_var_param_value) = uppercase {
        local_var_req_builder = local_var_req_builder.header("UPPERCASE", local_var_param_value.to_string());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<TestNullableRequiredParamSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<TestNullableRequiredParamError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

