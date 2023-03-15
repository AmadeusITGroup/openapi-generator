# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import annotations
from inspect import getfullargspec
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import Dict, Optional
from pydantic import BaseModel, Field, StrictStr
from petstore_api.models.animal import Animal

class MixedPropertiesAndAdditionalPropertiesClass(BaseModel):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    uuid: Optional[StrictStr] = None
    date_time: Optional[datetime] = Field(None, alias="dateTime")
    map: Optional[Dict[str, Animal]] = None
    __properties = ["uuid", "dateTime", "map"]

    class Config:
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> MixedPropertiesAndAdditionalPropertiesClass:
        """Create an instance of MixedPropertiesAndAdditionalPropertiesClass from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each value in map (dict)
        _field_dict = {}
        if self.map:
            for _key in self.map:
                if self.map[_key]:
                    _field_dict[_key] = self.map[_key].to_dict()
            _dict['map'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> MixedPropertiesAndAdditionalPropertiesClass:
        """Create an instance of MixedPropertiesAndAdditionalPropertiesClass from a dict"""
        if obj is None:
            return None

        if type(obj) is not dict:
            return MixedPropertiesAndAdditionalPropertiesClass.parse_obj(obj)

        _obj = MixedPropertiesAndAdditionalPropertiesClass.parse_obj({
            "uuid": obj.get("uuid"),
            "date_time": obj.get("dateTime"),
            "map": dict((_k, Dict[str, Animal].from_dict(_v)) for _k, _v in obj.get("map").items())
        })
        return _obj

