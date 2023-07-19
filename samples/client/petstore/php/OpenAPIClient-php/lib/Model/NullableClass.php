<?php
/**
 * NullableClass
 *
 * PHP version 7.4
 *
 * @category Class
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
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.6.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * NullableClass Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class NullableClass implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'NullableClass';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'integer_prop' => 'int',
        'number_prop' => 'float',
        'boolean_prop' => 'bool',
        'string_prop' => 'string',
        'date_prop' => '\DateTime',
        'datetime_prop' => '\DateTime',
        'array_nullable_prop' => 'object[]',
        'array_and_items_nullable_prop' => 'object[]',
        'array_items_nullable' => 'object[]',
        'object_nullable_prop' => 'array<string,object>',
        'object_and_items_nullable_prop' => 'array<string,object>',
        'object_items_nullable' => 'array<string,object>'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'integer_prop' => null,
        'number_prop' => null,
        'boolean_prop' => null,
        'string_prop' => null,
        'date_prop' => 'date',
        'datetime_prop' => 'date-time',
        'array_nullable_prop' => null,
        'array_and_items_nullable_prop' => null,
        'array_items_nullable' => null,
        'object_nullable_prop' => null,
        'object_and_items_nullable_prop' => null,
        'object_items_nullable' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'integer_prop' => true,
		'number_prop' => true,
		'boolean_prop' => true,
		'string_prop' => true,
		'date_prop' => true,
		'datetime_prop' => true,
		'array_nullable_prop' => true,
		'array_and_items_nullable_prop' => true,
		'array_items_nullable' => false,
		'object_nullable_prop' => true,
		'object_and_items_nullable_prop' => true,
		'object_items_nullable' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
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
     * @var string[]
     */
    protected static $attributeMap = [
        'integer_prop' => 'integer_prop',
        'number_prop' => 'number_prop',
        'boolean_prop' => 'boolean_prop',
        'string_prop' => 'string_prop',
        'date_prop' => 'date_prop',
        'datetime_prop' => 'datetime_prop',
        'array_nullable_prop' => 'array_nullable_prop',
        'array_and_items_nullable_prop' => 'array_and_items_nullable_prop',
        'array_items_nullable' => 'array_items_nullable',
        'object_nullable_prop' => 'object_nullable_prop',
        'object_and_items_nullable_prop' => 'object_and_items_nullable_prop',
        'object_items_nullable' => 'object_items_nullable'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'integer_prop' => 'setIntegerProp',
        'number_prop' => 'setNumberProp',
        'boolean_prop' => 'setBooleanProp',
        'string_prop' => 'setStringProp',
        'date_prop' => 'setDateProp',
        'datetime_prop' => 'setDatetimeProp',
        'array_nullable_prop' => 'setArrayNullableProp',
        'array_and_items_nullable_prop' => 'setArrayAndItemsNullableProp',
        'array_items_nullable' => 'setArrayItemsNullable',
        'object_nullable_prop' => 'setObjectNullableProp',
        'object_and_items_nullable_prop' => 'setObjectAndItemsNullableProp',
        'object_items_nullable' => 'setObjectItemsNullable'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'integer_prop' => 'getIntegerProp',
        'number_prop' => 'getNumberProp',
        'boolean_prop' => 'getBooleanProp',
        'string_prop' => 'getStringProp',
        'date_prop' => 'getDateProp',
        'datetime_prop' => 'getDatetimeProp',
        'array_nullable_prop' => 'getArrayNullableProp',
        'array_and_items_nullable_prop' => 'getArrayAndItemsNullableProp',
        'array_items_nullable' => 'getArrayItemsNullable',
        'object_nullable_prop' => 'getObjectNullableProp',
        'object_and_items_nullable_prop' => 'getObjectAndItemsNullableProp',
        'object_items_nullable' => 'getObjectItemsNullable'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('integer_prop', $data ?? [], null);
        $this->setIfExists('number_prop', $data ?? [], null);
        $this->setIfExists('boolean_prop', $data ?? [], null);
        $this->setIfExists('string_prop', $data ?? [], null);
        $this->setIfExists('date_prop', $data ?? [], null);
        $this->setIfExists('datetime_prop', $data ?? [], null);
        $this->setIfExists('array_nullable_prop', $data ?? [], null);
        $this->setIfExists('array_and_items_nullable_prop', $data ?? [], null);
        $this->setIfExists('array_items_nullable', $data ?? [], null);
        $this->setIfExists('object_nullable_prop', $data ?? [], null);
        $this->setIfExists('object_and_items_nullable_prop', $data ?? [], null);
        $this->setIfExists('object_items_nullable', $data ?? [], null);
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
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
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
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets integer_prop
     *
     * @return int|null
     */
    public function getIntegerProp()
    {
        return $this->container['integer_prop'];
    }

    /**
     * Sets integer_prop
     *
     * @param int|null $integer_prop integer_prop
     *
     * @return self
     */
    public function setIntegerProp($integer_prop)
    {
        if (is_null($integer_prop)) {
            array_push($this->openAPINullablesSetToNull, 'integer_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('integer_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['integer_prop'] = $integer_prop;

        return $this;
    }

    /**
     * Gets number_prop
     *
     * @return float|null
     */
    public function getNumberProp()
    {
        return $this->container['number_prop'];
    }

    /**
     * Sets number_prop
     *
     * @param float|null $number_prop number_prop
     *
     * @return self
     */
    public function setNumberProp($number_prop)
    {
        if (is_null($number_prop)) {
            array_push($this->openAPINullablesSetToNull, 'number_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('number_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['number_prop'] = $number_prop;

        return $this;
    }

    /**
     * Gets boolean_prop
     *
     * @return bool|null
     */
    public function getBooleanProp()
    {
        return $this->container['boolean_prop'];
    }

    /**
     * Sets boolean_prop
     *
     * @param bool|null $boolean_prop boolean_prop
     *
     * @return self
     */
    public function setBooleanProp($boolean_prop)
    {
        if (is_null($boolean_prop)) {
            array_push($this->openAPINullablesSetToNull, 'boolean_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('boolean_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['boolean_prop'] = $boolean_prop;

        return $this;
    }

    /**
     * Gets string_prop
     *
     * @return string|null
     */
    public function getStringProp()
    {
        return $this->container['string_prop'];
    }

    /**
     * Sets string_prop
     *
     * @param string|null $string_prop string_prop
     *
     * @return self
     */
    public function setStringProp($string_prop)
    {
        if (is_null($string_prop)) {
            array_push($this->openAPINullablesSetToNull, 'string_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('string_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['string_prop'] = $string_prop;

        return $this;
    }

    /**
     * Gets date_prop
     *
     * @return \DateTime|null
     */
    public function getDateProp()
    {
        return $this->container['date_prop'];
    }

    /**
     * Sets date_prop
     *
     * @param \DateTime|null $date_prop date_prop
     *
     * @return self
     */
    public function setDateProp($date_prop)
    {
        if (is_null($date_prop)) {
            array_push($this->openAPINullablesSetToNull, 'date_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('date_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['date_prop'] = $date_prop;

        return $this;
    }

    /**
     * Gets datetime_prop
     *
     * @return \DateTime|null
     */
    public function getDatetimeProp()
    {
        return $this->container['datetime_prop'];
    }

    /**
     * Sets datetime_prop
     *
     * @param \DateTime|null $datetime_prop datetime_prop
     *
     * @return self
     */
    public function setDatetimeProp($datetime_prop)
    {
        if (is_null($datetime_prop)) {
            array_push($this->openAPINullablesSetToNull, 'datetime_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('datetime_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['datetime_prop'] = $datetime_prop;

        return $this;
    }

    /**
     * Gets array_nullable_prop
     *
     * @return object[]|null
     */
    public function getArrayNullableProp()
    {
        return $this->container['array_nullable_prop'];
    }

    /**
     * Sets array_nullable_prop
     *
     * @param object[]|null $array_nullable_prop array_nullable_prop
     *
     * @return self
     */
    public function setArrayNullableProp($array_nullable_prop)
    {
        if (is_null($array_nullable_prop)) {
            array_push($this->openAPINullablesSetToNull, 'array_nullable_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('array_nullable_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['array_nullable_prop'] = $array_nullable_prop;

        return $this;
    }

    /**
     * Gets array_and_items_nullable_prop
     *
     * @return object[]|null
     */
    public function getArrayAndItemsNullableProp()
    {
        return $this->container['array_and_items_nullable_prop'];
    }

    /**
     * Sets array_and_items_nullable_prop
     *
     * @param object[]|null $array_and_items_nullable_prop array_and_items_nullable_prop
     *
     * @return self
     */
    public function setArrayAndItemsNullableProp($array_and_items_nullable_prop)
    {
        if (is_null($array_and_items_nullable_prop)) {
            array_push($this->openAPINullablesSetToNull, 'array_and_items_nullable_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('array_and_items_nullable_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['array_and_items_nullable_prop'] = $array_and_items_nullable_prop;

        return $this;
    }

    /**
     * Gets array_items_nullable
     *
     * @return object[]|null
     */
    public function getArrayItemsNullable()
    {
        return $this->container['array_items_nullable'];
    }

    /**
     * Sets array_items_nullable
     *
     * @param object[]|null $array_items_nullable array_items_nullable
     *
     * @return self
     */
    public function setArrayItemsNullable($array_items_nullable)
    {
        if (is_null($array_items_nullable)) {
            throw new \InvalidArgumentException('non-nullable array_items_nullable cannot be null');
        }
        $this->container['array_items_nullable'] = $array_items_nullable;

        return $this;
    }

    /**
     * Gets object_nullable_prop
     *
     * @return array<string,object>|null
     */
    public function getObjectNullableProp()
    {
        return $this->container['object_nullable_prop'];
    }

    /**
     * Sets object_nullable_prop
     *
     * @param array<string,object>|null $object_nullable_prop object_nullable_prop
     *
     * @return self
     */
    public function setObjectNullableProp($object_nullable_prop)
    {
        if (is_null($object_nullable_prop)) {
            array_push($this->openAPINullablesSetToNull, 'object_nullable_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('object_nullable_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['object_nullable_prop'] = $object_nullable_prop;

        return $this;
    }

    /**
     * Gets object_and_items_nullable_prop
     *
     * @return array<string,object>|null
     */
    public function getObjectAndItemsNullableProp()
    {
        return $this->container['object_and_items_nullable_prop'];
    }

    /**
     * Sets object_and_items_nullable_prop
     *
     * @param array<string,object>|null $object_and_items_nullable_prop object_and_items_nullable_prop
     *
     * @return self
     */
    public function setObjectAndItemsNullableProp($object_and_items_nullable_prop)
    {
        if (is_null($object_and_items_nullable_prop)) {
            array_push($this->openAPINullablesSetToNull, 'object_and_items_nullable_prop');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('object_and_items_nullable_prop', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['object_and_items_nullable_prop'] = $object_and_items_nullable_prop;

        return $this;
    }

    /**
     * Gets object_items_nullable
     *
     * @return array<string,object>|null
     */
    public function getObjectItemsNullable()
    {
        return $this->container['object_items_nullable'];
    }

    /**
     * Sets object_items_nullable
     *
     * @param array<string,object>|null $object_items_nullable object_items_nullable
     *
     * @return self
     */
    public function setObjectItemsNullable($object_items_nullable)
    {
        if (is_null($object_items_nullable)) {
            throw new \InvalidArgumentException('non-nullable object_items_nullable cannot be null');
        }
        $this->container['object_items_nullable'] = $object_items_nullable;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
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
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
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
    public function offsetSet($offset, $value): void
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
    public function offsetUnset($offset): void
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
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
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
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


