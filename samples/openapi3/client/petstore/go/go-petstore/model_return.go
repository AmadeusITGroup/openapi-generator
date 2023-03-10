/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
)

// checks if the Return type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Return{}

// Return Model for testing reserved words
type Return struct {
	Return *int32 `json:"return,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _Return Return

// NewReturn instantiates a new Return object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReturn() *Return {
	this := Return{}
	return &this
}

// NewReturnWithDefaults instantiates a new Return object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReturnWithDefaults() *Return {
	this := Return{}
	return &this
}

// GetReturn returns the Return field value if set, zero value otherwise.
func (o *Return) GetReturn() int32 {
	if o == nil || IsNil(o.Return) {
		var ret int32
		return ret
	}
	return *o.Return
}

// GetReturnOk returns a tuple with the Return field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Return) GetReturnOk() (*int32, bool) {
	if o == nil || IsNil(o.Return) {
		return nil, false
	}
	return o.Return, true
}

// HasReturn returns a boolean if a field has been set.
func (o *Return) HasReturn() bool {
	if o != nil && !IsNil(o.Return) {
		return true
	}

	return false
}

// SetReturn gets a reference to the given int32 and assigns it to the Return field.
func (o *Return) SetReturn(v int32) {
	o.Return = &v
}

func (o Return) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Return) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Return) {
		toSerialize["return"] = o.Return
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Return) UnmarshalJSON(bytes []byte) (err error) {
	varReturn := _Return{}

	if err = json.Unmarshal(bytes, &varReturn); err == nil {
		*o = Return(varReturn)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "return")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableReturn struct {
	value *Return
	isSet bool
}

func (v NullableReturn) Get() *Return {
	return v.value
}

func (v *NullableReturn) Set(val *Return) {
	v.value = val
	v.isSet = true
}

func (v NullableReturn) IsSet() bool {
	return v.isSet
}

func (v *NullableReturn) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReturn(val *Return) *NullableReturn {
	return &NullableReturn{value: val, isSet: true}
}

func (v NullableReturn) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReturn) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


