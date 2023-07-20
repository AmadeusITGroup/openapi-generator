# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from petstore_api.configuration import Configuration


class MixedPropertiesAndAdditionalPropertiesClass(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'uuid': 'str',
        'date_time': 'datetime',
        'map': 'dict[str, Animal]'
    }

    attribute_map = {
        'uuid': 'uuid',
        'date_time': 'dateTime',
        'map': 'map'
    }

    def __init__(self, uuid=None, date_time=None, map=None, local_vars_configuration=None):  # noqa: E501
        """MixedPropertiesAndAdditionalPropertiesClass - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._uuid = None
        self._date_time = None
        self._map = None
        self.discriminator = None

        if uuid is not None:
            self.uuid = uuid
        if date_time is not None:
            self.date_time = date_time
        if map is not None:
            self.map = map

    @property
    def uuid(self):
        """Gets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """Sets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.


        :param uuid: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type uuid: str
        """

        self._uuid = uuid

    @property
    def date_time(self):
        """Gets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time):
        """Sets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.


        :param date_time: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type date_time: datetime
        """

        self._date_time = date_time

    @property
    def map(self):
        """Gets the map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: dict[str, Animal]
        """
        return self._map

    @map.setter
    def map(self, map):
        """Sets the map of this MixedPropertiesAndAdditionalPropertiesClass.


        :param map: The map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type map: dict[str, Animal]
        """

        self._map = map

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, MixedPropertiesAndAdditionalPropertiesClass):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MixedPropertiesAndAdditionalPropertiesClass):
            return True

        return self.to_dict() != other.to_dict()
