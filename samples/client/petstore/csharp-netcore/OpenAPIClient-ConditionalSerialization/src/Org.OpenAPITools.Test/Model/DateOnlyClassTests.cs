/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;
using Org.OpenAPITools.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Test.Model
{
    /// <summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/NullableGuidClassTests.cs
    ///  Class for testing NullableGuidClass
========
    ///  Class for testing DateOnlyClass
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/NullableGuidClassTests.cs
    public class NullableGuidClassTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for NullableGuidClass
        //private NullableGuidClass instance;

        public NullableGuidClassTests()
        {
            // TODO uncomment below to create an instance of NullableGuidClass
            //instance = new NullableGuidClass();
========
    public class DateOnlyClassTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for DateOnlyClass
        //private DateOnlyClass instance;

        public DateOnlyClassTests()
        {
            // TODO uncomment below to create an instance of DateOnlyClass
            //instance = new DateOnlyClass();
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/NullableGuidClassTests.cs
        /// Test an instance of NullableGuidClass
        /// </summary>
        [Fact]
        public void NullableGuidClassInstanceTest()
        {
            // TODO uncomment below to test "IsType" NullableGuidClass
            //Assert.IsType<NullableGuidClass>(instance);
========
        /// Test an instance of DateOnlyClass
        /// </summary>
        [Fact]
        public void DateOnlyClassInstanceTest()
        {
            // TODO uncomment below to test "IsType" DateOnlyClass
            //Assert.IsType<DateOnlyClass>(instance);
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
        }


        /// <summary>
<<<<<<<< HEAD:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/NullableGuidClassTests.cs
        /// Test the property 'Uuid'
        /// </summary>
        [Fact]
        public void UuidTest()
        {
            // TODO unit test for the property 'Uuid'
========
        /// Test the property 'DateOnlyProperty'
        /// </summary>
        [Fact]
        public void DateOnlyPropertyTest()
        {
            // TODO unit test for the property 'DateOnlyProperty'
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/csharp-netcore/OpenAPIClient-ConditionalSerialization/src/Org.OpenAPITools.Test/Model/DateOnlyClassTests.cs
        }

    }

}
