/* tslint:disable */
/* eslint-disable */
/**
 * Enum test
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  EnumPatternObject,
  FakeEnumRequestGetInline200Response,
  NumberEnum,
  StringEnum,
} from '../models';
import {
    EnumPatternObjectFromJSON,
    EnumPatternObjectToJSON,
    FakeEnumRequestGetInline200ResponseFromJSON,
    FakeEnumRequestGetInline200ResponseToJSON,
    NumberEnumFromJSON,
    NumberEnumToJSON,
    StringEnumFromJSON,
    StringEnumToJSON,
} from '../models';

export interface FakeEnumRequestGetInlineRequest {
    stringEnum?: FakeEnumRequestGetInlineStringEnumEnum;
    nullableStringEnum?: string | null;
    numberEnum?: FakeEnumRequestGetInlineNumberEnumEnum;
    nullableNumberEnum?: number | null;
}

export interface FakeEnumRequestGetRefRequest {
    stringEnum?: StringEnum;
    nullableStringEnum?: StringEnum | null;
    numberEnum?: NumberEnum;
    nullableNumberEnum?: NumberEnum | null;
}

export interface FakeEnumRequestPostInlineRequest {
    fakeEnumRequestGetInline200Response?: FakeEnumRequestGetInline200Response;
}

export interface FakeEnumRequestPostRefRequest {
    enumPatternObject?: EnumPatternObject;
}

/**
 * 
 */
export class DefaultApi extends runtime.BaseAPI {

    /**
     */
    async fakeEnumRequestGetInlineRaw(requestParameters: FakeEnumRequestGetInlineRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<FakeEnumRequestGetInline200Response>> {
        const queryParameters: any = {};

        if (requestParameters.stringEnum !== undefined) {
            queryParameters['string-enum'] = requestParameters.stringEnum;
        }

        if (requestParameters.nullableStringEnum !== undefined) {
            queryParameters['nullable-string-enum'] = requestParameters.nullableStringEnum;
        }

        if (requestParameters.numberEnum !== undefined) {
            queryParameters['number-enum'] = requestParameters.numberEnum;
        }

        if (requestParameters.nullableNumberEnum !== undefined) {
            queryParameters['nullable-number-enum'] = requestParameters.nullableNumberEnum;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fake/enum-request-inline`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => FakeEnumRequestGetInline200ResponseFromJSON(jsonValue));
    }

    /**
     */
    async fakeEnumRequestGetInline(requestParameters: FakeEnumRequestGetInlineRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<FakeEnumRequestGetInline200Response> {
        const response = await this.fakeEnumRequestGetInlineRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async fakeEnumRequestGetRefRaw(requestParameters: FakeEnumRequestGetRefRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EnumPatternObject>> {
        const queryParameters: any = {};

        if (requestParameters.stringEnum !== undefined) {
            queryParameters['string-enum'] = requestParameters.stringEnum;
        }

        if (requestParameters.nullableStringEnum !== undefined) {
            queryParameters['nullable-string-enum'] = requestParameters.nullableStringEnum;
        }

        if (requestParameters.numberEnum !== undefined) {
            queryParameters['number-enum'] = requestParameters.numberEnum;
        }

        if (requestParameters.nullableNumberEnum !== undefined) {
            queryParameters['nullable-number-enum'] = requestParameters.nullableNumberEnum;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fake/enum-request-ref`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EnumPatternObjectFromJSON(jsonValue));
    }

    /**
     */
    async fakeEnumRequestGetRef(requestParameters: FakeEnumRequestGetRefRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EnumPatternObject> {
        const response = await this.fakeEnumRequestGetRefRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async fakeEnumRequestPostInlineRaw(requestParameters: FakeEnumRequestPostInlineRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<FakeEnumRequestGetInline200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fake/enum-request-inline`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: FakeEnumRequestGetInline200ResponseToJSON(requestParameters.fakeEnumRequestGetInline200Response),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => FakeEnumRequestGetInline200ResponseFromJSON(jsonValue));
    }

    /**
     */
    async fakeEnumRequestPostInline(requestParameters: FakeEnumRequestPostInlineRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<FakeEnumRequestGetInline200Response> {
        const response = await this.fakeEnumRequestPostInlineRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     */
    async fakeEnumRequestPostRefRaw(requestParameters: FakeEnumRequestPostRefRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<EnumPatternObject>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/fake/enum-request-ref`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: EnumPatternObjectToJSON(requestParameters.enumPatternObject),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => EnumPatternObjectFromJSON(jsonValue));
    }

    /**
     */
    async fakeEnumRequestPostRef(requestParameters: FakeEnumRequestPostRefRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<EnumPatternObject> {
        const response = await this.fakeEnumRequestPostRefRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const FakeEnumRequestGetInlineStringEnumEnum = {
    One: 'one',
    Two: 'two',
    Three: 'three'
} as const;
export type FakeEnumRequestGetInlineStringEnumEnum = typeof FakeEnumRequestGetInlineStringEnumEnum[keyof typeof FakeEnumRequestGetInlineStringEnumEnum];
/**
 * @export
 */
export const FakeEnumRequestGetInlineNumberEnumEnum = {
    NUMBER_1: 1,
    NUMBER_2: 2,
    NUMBER_3: 3
} as const;
export type FakeEnumRequestGetInlineNumberEnumEnum = typeof FakeEnumRequestGetInlineNumberEnumEnum[keyof typeof FakeEnumRequestGetInlineNumberEnumEnum];
