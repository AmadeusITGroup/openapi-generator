/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;
using Org.OpenAPITools.Client;
using System.Reflection;
using Newtonsoft.Json;
using NUnit.Framework;

namespace Org.OpenAPITools.Test.Model
{
    /// <summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
    ///  Class for testing DateOnlyClass
========
    ///  Class for testing FooGetDefaultResponse
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-unityWebRequest/src/Org.OpenAPITools.Test/Model/FooGetDefaultResponseTests.cs
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
    public class DateOnlyClassTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for DateOnlyClass
        //private DateOnlyClass instance;

        public DateOnlyClassTests()
        {
            // TODO uncomment below to create an instance of DateOnlyClass
            //instance = new DateOnlyClass();
========
    public class FooGetDefaultResponseTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for FooGetDefaultResponse
        //private FooGetDefaultResponse instance;

        public FooGetDefaultResponseTests()
        {
            // TODO uncomment below to create an instance of FooGetDefaultResponse
            //instance = new FooGetDefaultResponse();
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-unityWebRequest/src/Org.OpenAPITools.Test/Model/FooGetDefaultResponseTests.cs
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
        /// Test an instance of DateOnlyClass
        /// </summary>
        [Fact]
        public void DateOnlyClassInstanceTest()
        {
            // TODO uncomment below to test "IsType" DateOnlyClass
            //Assert.IsType<DateOnlyClass>(instance);
========
        /// Test an instance of FooGetDefaultResponse
        /// </summary>
        [Test]
        public void FooGetDefaultResponseInstanceTest()
        {
            // TODO uncomment below to test "IsType" FooGetDefaultResponse
            //Assert.IsType<FooGetDefaultResponse>(instance);
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-unityWebRequest/src/Org.OpenAPITools.Test/Model/FooGetDefaultResponseTests.cs
        }


        /// <summary>
        /// Test the property 'DateOnlyProperty'
        /// </summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
        [Fact]
        public void DateOnlyPropertyTest()
========
        [Test]
        public void StringTest()
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-unityWebRequest/src/Org.OpenAPITools.Test/Model/FooGetDefaultResponseTests.cs
        {
            // TODO unit test for the property 'DateOnlyProperty'
        }
    }
}
