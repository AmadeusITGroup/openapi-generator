/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Category } from './Category';
import {
    CategoryFromJSON,
    CategoryFromJSONTyped,
    CategoryToJSON,
} from './Category';
import type { Tag } from './Tag';
import {
    TagFromJSON,
    TagFromJSONTyped,
    TagToJSON,
} from './Tag';

/**
 * 
 * @export
 * @interface Pet
 */
export interface Pet {
    /**
     * 
     * @type {number}
     * @memberof Pet
     */
    id?: number;
    /**
     * 
     * @type {Category}
     * @memberof Pet
     */
    category?: Category;
    /**
     * 
     * @type {string}
     * @memberof Pet
     */
    name: string;
    /**
     * 
     * @type {Set<string>}
     * @memberof Pet
     */
    photoUrls: Set<string>;
    /**
     * 
     * @type {Array<Tag>}
     * @memberof Pet
     */
    tags?: Array<Tag>;
    /**
     * pet status in the store
     * @type {string}
     * @memberof Pet
     */
    status?: PetStatusEnum;
}


/**
 * @export
 */
export const PetStatusEnum = {
    Available: 'available',
    Pending: 'pending',
    Sold: 'sold'
} as const;
export type PetStatusEnum = typeof PetStatusEnum[keyof typeof PetStatusEnum];


/**
 * Check if a given object implements the Pet interface.
 */
export function instanceOfPet(value: object): boolean {
    if (!('name' in value)) return false;
    if (!('photoUrls' in value)) return false;
    return true;
}

export function PetFromJSON(json: any): Pet {
    return PetFromJSONTyped(json, false);
}

export function PetFromJSONTyped(json: any, ignoreDiscriminator: boolean): Pet {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'] == null ? undefined : json['id'],
        'category': json['category'] == null ? undefined : CategoryFromJSON(json['category']),
        'name': json['name'],
        'photoUrls': json['photoUrls'],
        'tags': json['tags'] == null ? undefined : ((json['tags'] as Array<any>).map(TagFromJSON)),
        'status': json['status'] == null ? undefined : json['status'],
    };
}

export function PetToJSON(value?: Pet | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'category': CategoryToJSON(value['category']),
        'name': value['name'],
        'photoUrls': Array.from(value['photoUrls'] as Set<any>),
        'tags': value['tags'] == null ? undefined : ((value['tags'] as Array<any>).map(TagToJSON)),
        'status': value['status'],
    };
}

