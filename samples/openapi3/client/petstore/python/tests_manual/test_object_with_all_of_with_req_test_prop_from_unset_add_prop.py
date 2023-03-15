# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

import unittest

import petstore_api
from petstore_api.model.object_with_all_of_with_req_test_prop_from_unset_add_prop import ObjectWithAllOfWithReqTestPropFromUnsetAddProp
from petstore_api import configuration


class TestObjectWithAllOfWithReqTestPropFromUnsetAddProp(unittest.TestCase):
    """ObjectWithAllOfWithReqTestPropFromUnsetAddProp unit test stubs"""

    def test_model_instantiation(self):
        inst = ObjectWithAllOfWithReqTestPropFromUnsetAddProp(
            test='a'
        )
        assert inst == {'test': 'a'}

        # without the required test property an exception is thrown
        with self.assertRaises(petstore_api.exceptions.ApiTypeError):
            ObjectWithAllOfWithReqTestPropFromUnsetAddProp(
                name='a'
            )


if __name__ == '__main__':
    unittest.main()