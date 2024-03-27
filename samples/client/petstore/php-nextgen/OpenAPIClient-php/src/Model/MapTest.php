<?php
/**
 * MapTest
 *
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.4.0-amadeus
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use ArrayAccess;
use JsonSerializable;
use InvalidArgumentException;
use ReturnTypeWillChange;
use OpenAPI\Client\ObjectSerializer;

/**
 * MapTest Class Doc Comment
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class MapTest implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'MapTest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'map_map_of_string' => 'array<string,array<string,string>>',
        'map_of_enum_string' => 'array<string,string>',
        'direct_map' => 'array<string,bool>',
        'indirect_map' => 'array<string,bool>'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'map_map_of_string' => null,
        'map_of_enum_string' => null,
        'direct_map' => null,
        'indirect_map' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'map_map_of_string' => false,
        'map_of_enum_string' => false,
        'direct_map' => false,
        'indirect_map' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var array<string, bool>
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array<string, bool>
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return array<string, bool>
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param array<string, bool> $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var array<string, string>
     */
    protected static array $attributeMap = [
        'map_map_of_string' => 'map_map_of_string',
        'map_of_enum_string' => 'map_of_enum_string',
        'direct_map' => 'direct_map',
        'indirect_map' => 'indirect_map'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'map_map_of_string' => 'setMapMapOfString',
        'map_of_enum_string' => 'setMapOfEnumString',
        'direct_map' => 'setDirectMap',
        'indirect_map' => 'setIndirectMap'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'map_map_of_string' => 'getMapMapOfString',
        'map_of_enum_string' => 'getMapOfEnumString',
        'direct_map' => 'getDirectMap',
        'indirect_map' => 'getIndirectMap'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array<string, string>
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array<string, string>
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array<string, string>
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }

    public const MAP_OF_ENUM_STRING_UPPER = 'UPPER';
    public const MAP_OF_ENUM_STRING_LOWER = 'lower';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getMapOfEnumStringAllowableValues()
    {
        return [
            self::MAP_OF_ENUM_STRING_UPPER,
            self::MAP_OF_ENUM_STRING_LOWER,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('map_map_of_string', $data ?? [], null);
        $this->setIfExists('map_of_enum_string', $data ?? [], null);
        $this->setIfExists('direct_map', $data ?? [], null);
        $this->setIfExists('indirect_map', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, mixed $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return string[] invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets map_map_of_string
     *
     * @return array<string,array<string,string>>|null
     */
    public function getMapMapOfString(): ?array
    {
        return $this->container['map_map_of_string'];
    }

    /**
     * Sets map_map_of_string
     *
     * @param array<string,array<string,string>>|null $map_map_of_string map_map_of_string
     *
     * @return $this
     */
    public function setMapMapOfString(?array $map_map_of_string): static
    {
        if (is_null($map_map_of_string)) {
            throw new InvalidArgumentException('non-nullable map_map_of_string cannot be null');
        }
        $this->container['map_map_of_string'] = $map_map_of_string;

        return $this;
    }

    /**
     * Gets map_of_enum_string
     *
     * @return array<string,string>|null
     */
    public function getMapOfEnumString(): ?array
    {
        return $this->container['map_of_enum_string'];
    }

    /**
     * Sets map_of_enum_string
     *
     * @param array<string,string>|null $map_of_enum_string map_of_enum_string
     *
     * @return $this
     */
    public function setMapOfEnumString(?array $map_of_enum_string): static
    {
        if (is_null($map_of_enum_string)) {
            throw new InvalidArgumentException('non-nullable map_of_enum_string cannot be null');
        }
        $allowedValues = $this->getMapOfEnumStringAllowableValues();
        if (array_diff($map_of_enum_string, $allowedValues)) {
            throw new InvalidArgumentException(
                sprintf(
                    "Invalid value for 'map_of_enum_string', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['map_of_enum_string'] = $map_of_enum_string;

        return $this;
    }

    /**
     * Gets direct_map
     *
     * @return array<string,bool>|null
     */
    public function getDirectMap(): ?array
    {
        return $this->container['direct_map'];
    }

    /**
     * Sets direct_map
     *
     * @param array<string,bool>|null $direct_map direct_map
     *
     * @return $this
     */
    public function setDirectMap(?array $direct_map): static
    {
        if (is_null($direct_map)) {
            throw new InvalidArgumentException('non-nullable direct_map cannot be null');
        }
        $this->container['direct_map'] = $direct_map;

        return $this;
    }

    /**
     * Gets indirect_map
     *
     * @return array<string,bool>|null
     */
    public function getIndirectMap(): ?array
    {
        return $this->container['indirect_map'];
    }

    /**
     * Sets indirect_map
     *
     * @param array<string,bool>|null $indirect_map indirect_map
     *
     * @return $this
     */
    public function setIndirectMap(?array $indirect_map): static
    {
        if (is_null($indirect_map)) {
            throw new InvalidArgumentException('non-nullable indirect_map cannot be null');
        }
        $this->container['indirect_map'] = $indirect_map;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists(mixed $offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[ReturnTypeWillChange]
    public function offsetGet(mixed $offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet(mixed $offset, mixed $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset(mixed $offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString(): string
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


