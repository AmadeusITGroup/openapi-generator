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
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenApiPetstore);
  }
}(this, function(expect, OpenApiPetstore) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenApiPetstore.ObjectWithDeprecatedFields();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ObjectWithDeprecatedFields', function() {
    it('should create an instance of ObjectWithDeprecatedFields', function() {
      // uncomment below and update the code to test ObjectWithDeprecatedFields
      //var instane = new OpenApiPetstore.ObjectWithDeprecatedFields();
      //expect(instance).to.be.a(OpenApiPetstore.ObjectWithDeprecatedFields);
    });

    it('should have the property uuid (base name: "uuid")', function() {
      // uncomment below and update the code to test the property uuid
      //var instance = new OpenApiPetstore.ObjectWithDeprecatedFields();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenApiPetstore.ObjectWithDeprecatedFields();
      //expect(instance).to.be();
    });

    it('should have the property deprecatedRef (base name: "deprecatedRef")', function() {
      // uncomment below and update the code to test the property deprecatedRef
      //var instance = new OpenApiPetstore.ObjectWithDeprecatedFields();
      //expect(instance).to.be();
    });

    it('should have the property bars (base name: "bars")', function() {
      // uncomment below and update the code to test the property bars
      //var instance = new OpenApiPetstore.ObjectWithDeprecatedFields();
      //expect(instance).to.be();
    });

  });

}));
