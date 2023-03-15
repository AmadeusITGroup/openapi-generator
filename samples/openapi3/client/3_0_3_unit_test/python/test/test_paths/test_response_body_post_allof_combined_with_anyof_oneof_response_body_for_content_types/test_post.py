# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.response_body_post_allof_combined_with_anyof_oneof_response_body_for_content_types import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestResponseBodyPostAllofCombinedWithAnyofOneofResponseBodyForContentTypes(ApiTestMixin, unittest.TestCase):
    """
    ResponseBodyPostAllofCombinedWithAnyofOneofResponseBodyForContentTypes unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200

    def test_allof_true_anyof_false_oneof_false_fails(self):
        # allOf: true, anyOf: false, oneOf: false
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                2
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_false_anyof_false_oneof_true_fails(self):
        # allOf: false, anyOf: false, oneOf: true
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                5
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_false_anyof_true_oneof_true_fails(self):
        # allOf: false, anyOf: true, oneOf: true
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                15
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_true_anyof_true_oneof_false_fails(self):
        # allOf: true, anyOf: true, oneOf: false
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                6
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_true_anyof_true_oneof_true_passes(self):
        # allOf: true, anyOf: true, oneOf: true
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                30
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, post.SchemaFor200ResponseBodyApplicationJson)
            deserialized_response_body = post.SchemaFor200ResponseBodyApplicationJson.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
            )
            assert api_response.body == deserialized_response_body

    def test_allof_true_anyof_false_oneof_true_fails(self):
        # allOf: true, anyOf: false, oneOf: true
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                10
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_false_anyof_true_oneof_false_fails(self):
        # allOf: false, anyOf: true, oneOf: false
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                3
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

    def test_allof_false_anyof_false_oneof_false_fails(self):
        # allOf: false, anyOf: false, oneOf: false
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                1
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self._configuration.host + '/responseBody/postAllofCombinedWithAnyofOneofResponseBodyForContentTypes',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )




if __name__ == '__main__':
    unittest.main()
