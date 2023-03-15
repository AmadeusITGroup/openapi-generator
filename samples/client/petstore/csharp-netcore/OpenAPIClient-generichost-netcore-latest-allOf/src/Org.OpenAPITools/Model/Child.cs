// <auto-generated>
/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

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
    /// A representation of a child
    /// </summary>
    public partial class Child : Person, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Child" /> class.
        /// </summary>
        /// <param name="childAllOf"></param>
        /// <param name="boosterSeat">boosterSeat</param>
        /// <param name="firstName">firstName</param>
        /// <param name="lastName">lastName</param>
        /// <param name="type">type</param>
        [JsonConstructor]
        public Child(ChildAllOf childAllOf, bool boosterSeat, string firstName, string lastName, string type) : base(firstName, lastName, type)
        {
#pragma warning disable CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning disable CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            if (boosterSeat == null)
                throw new ArgumentNullException("boosterSeat is a required property for Child and cannot be null.");

#pragma warning restore CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning restore CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            ChildAllOf = childAllOf;
            BoosterSeat = boosterSeat;
        }

        /// <summary>
        /// Gets or Sets ChildAllOf
        /// </summary>
        public ChildAllOf ChildAllOf { get; set; }

        /// <summary>
        /// Gets or Sets BoosterSeat
        /// </summary>
        [JsonPropertyName("boosterSeat")]
        public bool BoosterSeat { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Child {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  BoosterSeat: ").Append(BoosterSeat).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
    }

    /// <summary>
    /// A Json converter for type Child
    /// </summary>
    public class ChildJsonConverter : JsonConverter<Child>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Child Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Utf8JsonReader childAllOfReader = utf8JsonReader;
            bool childAllOfDeserialized = Client.ClientUtils.TryDeserialize<ChildAllOf>(ref utf8JsonReader, jsonSerializerOptions, out ChildAllOf? childAllOf);

            bool boosterSeat = default;
            string firstName = default;
            string lastName = default;
            string type = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        case "boosterSeat":
                            boosterSeat = utf8JsonReader.GetBoolean();
                            break;
                        case "firstName":
                            firstName = utf8JsonReader.GetString();
                            break;
                        case "lastName":
                            lastName = utf8JsonReader.GetString();
                            break;
                        case "$_type":
                            type = utf8JsonReader.GetString();
                            break;
                        default:
                            break;
                    }
                }
            }

            return new Child(childAllOf, boosterSeat, firstName, lastName, type);
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="child"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Child child, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            writer.WriteBoolean("boosterSeat", child.BoosterSeat);
            writer.WriteString("firstName", child.FirstName);
            writer.WriteString("lastName", child.LastName);
            writer.WriteString("$_type", child.Type);

            writer.WriteEndObject();
        }
    }
}
