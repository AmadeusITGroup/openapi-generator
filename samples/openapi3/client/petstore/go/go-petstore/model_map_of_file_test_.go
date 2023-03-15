/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"os"
)

// checks if the MapOfFileTest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MapOfFileTest{}

// MapOfFileTest test map of file in a property
type MapOfFileTest struct {
	// a property to test map of file
	PropTest *map[string]*os.File `json:"prop_test,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _MapOfFileTest MapOfFileTest

// NewMapOfFileTest instantiates a new MapOfFileTest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMapOfFileTest() *MapOfFileTest {
	this := MapOfFileTest{}
	return &this
}

// NewMapOfFileTestWithDefaults instantiates a new MapOfFileTest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMapOfFileTestWithDefaults() *MapOfFileTest {
	this := MapOfFileTest{}
	return &this
}

// GetPropTest returns the PropTest field value if set, zero value otherwise.
func (o *MapOfFileTest) GetPropTest() map[string]*os.File {
	if o == nil || IsNil(o.PropTest) {
		var ret map[string]*os.File
		return ret
	}
	return *o.PropTest
}

// GetPropTestOk returns a tuple with the PropTest field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MapOfFileTest) GetPropTestOk() (*map[string]*os.File, bool) {
	if o == nil || IsNil(o.PropTest) {
		return nil, false
	}
	return o.PropTest, true
}

// HasPropTest returns a boolean if a field has been set.
func (o *MapOfFileTest) HasPropTest() bool {
	if o != nil && !IsNil(o.PropTest) {
		return true
	}

	return false
}

// SetPropTest gets a reference to the given map[string]*os.File and assigns it to the PropTest field.
func (o *MapOfFileTest) SetPropTest(v map[string]*os.File) {
	o.PropTest = &v
}

func (o MapOfFileTest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MapOfFileTest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.PropTest) {
		toSerialize["prop_test"] = o.PropTest
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *MapOfFileTest) UnmarshalJSON(bytes []byte) (err error) {
	varMapOfFileTest := _MapOfFileTest{}

	if err = json.Unmarshal(bytes, &varMapOfFileTest); err == nil {
		*o = MapOfFileTest(varMapOfFileTest)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "prop_test")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMapOfFileTest struct {
	value *MapOfFileTest
	isSet bool
}

func (v NullableMapOfFileTest) Get() *MapOfFileTest {
	return v.value
}

func (v *NullableMapOfFileTest) Set(val *MapOfFileTest) {
	v.value = val
	v.isSet = true
}

func (v NullableMapOfFileTest) IsSet() bool {
	return v.isSet
}

func (v *NullableMapOfFileTest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMapOfFileTest(val *MapOfFileTest) *NullableMapOfFileTest {
	return &NullableMapOfFileTest{value: val, isSet: true}
}

func (v NullableMapOfFileTest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMapOfFileTest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


