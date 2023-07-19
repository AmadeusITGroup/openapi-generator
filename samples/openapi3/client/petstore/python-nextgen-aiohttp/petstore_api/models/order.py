# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, validator

class Order(BaseModel):
    """
    Order
    """
    id: Optional[StrictInt] = None
    pet_id: Optional[StrictInt] = Field(None, alias="petId")
    quantity: Optional[StrictInt] = None
    ship_date: Optional[datetime] = Field(None, alias="shipDate")
    status: Optional[StrictStr] = Field(None, description="Order Status")
    complete: Optional[StrictBool] = False
    __properties = ["id", "petId", "quantity", "shipDate", "status", "complete"]

    @validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('placed', 'approved', 'delivered'):
            raise ValueError("must be one of enum values ('placed', 'approved', 'delivered')")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Order:
        """Create an instance of Order from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Order:
        """Create an instance of Order from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Order.parse_obj(obj)

        _obj = Order.parse_obj({
            "id": obj.get("id"),
            "pet_id": obj.get("petId"),
            "quantity": obj.get("quantity"),
            "ship_date": obj.get("shipDate"),
            "status": obj.get("status"),
            "complete": obj.get("complete") if obj.get("complete") is not None else False
        })
        return _obj

