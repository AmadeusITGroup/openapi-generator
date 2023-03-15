// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines OuterEnumIntegerDefaultValue
    /// </summary>
    public enum OuterEnumIntegerDefaultValue
    {
        /// <summary>
        /// Enum NUMBER_0 for value: 0
        /// </summary>
        NUMBER_0 = 0,

        /// <summary>
        /// Enum NUMBER_1 for value: 1
        /// </summary>
        NUMBER_1 = 1,

        /// <summary>
        /// Enum NUMBER_2 for value: 2
        /// </summary>
        NUMBER_2 = 2

    }

    public class OuterEnumIntegerDefaultValueConverter : JsonConverter<OuterEnumIntegerDefaultValue>
    {
        public static OuterEnumIntegerDefaultValue FromString(string value)
        {
            if (value == (0).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_0;

            if (value == (1).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_1;

            if (value == (2).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_2;

            throw new NotImplementedException($"Could not convert value to type OuterEnumIntegerDefaultValue: '{value}'");
        }

        public static OuterEnumIntegerDefaultValue? FromStringOrDefault(string value)
        {
            if (value == (0).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_0;

            if (value == (1).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_1;

            if (value == (2).ToString())
                return OuterEnumIntegerDefaultValue.NUMBER_2;

            return null;
        }

        public static int ToJsonValue(OuterEnumIntegerDefaultValue value)
        {
            return (int) value;
        }

        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumIntegerDefaultValue Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            OuterEnumIntegerDefaultValue? result = OuterEnumIntegerDefaultValueConverter.FromString(rawValue);
            
            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the OuterEnumIntegerDefaultValue to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumIntegerDefaultValue"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumIntegerDefaultValue.ToString());
        }
    }

    public class OuterEnumIntegerDefaultValueNullableConverter : JsonConverter<OuterEnumIntegerDefaultValue?>
    {
        /// <summary>
        /// Returns a OuterEnumIntegerDefaultValue from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override OuterEnumIntegerDefaultValue? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            if (rawValue == null)
                return null;

            OuterEnumIntegerDefaultValue? result = OuterEnumIntegerDefaultValueConverter.FromString(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="outerEnumIntegerDefaultValue"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, OuterEnumIntegerDefaultValue? outerEnumIntegerDefaultValue, JsonSerializerOptions options)
        {
            writer.WriteStringValue(outerEnumIntegerDefaultValue?.ToString() ?? "null");
        }
    }

}
