// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;

namespace Org.OpenAPITools.Client
{
    /// <summary>
    /// API Exception
    /// </summary>
    public class ApiException : Exception
    {
        /// <summary>
        /// The reason the api request failed
        /// </summary>
        public string ReasonPhrase { get; }

        /// <summary>
        /// The HttpStatusCode
        /// </summary>
        public System.Net.HttpStatusCode StatusCode { get; }

        /// <summary>
        /// The raw data returned by the api
        /// </summary>
        public string RawContent { get; }
        
        /// <summary>
        /// Construct the ApiException from parts of the response
        /// </summary>
        /// <param name="reasonPhrase"></param>
        /// <param name="statusCode"></param>
        /// <param name="rawContent"></param>
        public ApiException(string reasonPhrase, System.Net.HttpStatusCode statusCode, string rawContent) : base(reasonPhrase ?? rawContent)
        {
            ReasonPhrase = reasonPhrase;

            StatusCode = statusCode;

            RawContent = rawContent;
        }
    }
}
