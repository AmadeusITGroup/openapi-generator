package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OuterEnum;
import org.openapitools.server.model.OuterEnumDefaultValue;
import org.openapitools.server.model.OuterEnumInteger;
import org.openapitools.server.model.OuterEnumIntegerDefaultValue;



public class EnumTest   {


    /**
    * Gets or Sets enumString
    */
    public enum EnumString {
        UPPER("UPPER"),
        LOWER("lower"),
        EMPTY("");

        private String value;

        EnumString(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static EnumString fromValue(String text) {
            for (EnumString b : EnumString.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EnumString enumString;

    /**
    * Gets or Sets enumStringRequired
    */
    public enum EnumStringRequired {
        UPPER("UPPER"),
        LOWER("lower"),
        EMPTY("");

        private String value;

        EnumStringRequired(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static EnumStringRequired fromValue(String text) {
            for (EnumStringRequired b : EnumStringRequired.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EnumStringRequired enumStringRequired;

    /**
    * Gets or Sets enumInteger
    */
    public enum EnumInteger {
        NUMBER_1(1),
        NUMBER_MINUS_1(-1);

        private Integer value;

        EnumInteger(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static EnumInteger fromValue(String text) {
            for (EnumInteger b : EnumInteger.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EnumInteger enumInteger;

    /**
    * Gets or Sets enumNumber
    */
    public enum EnumNumber {
        NUMBER_1_DOT_1(1.1),
        NUMBER_MINUS_1_DOT_2(-1.2);

        private Double value;

        EnumNumber(Double value) {
            this.value = value;
        }

        @JsonValue
        public Double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static EnumNumber fromValue(String text) {
            for (EnumNumber b : EnumNumber.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EnumNumber enumNumber;
    private OuterEnum outerEnum;
    private OuterEnumInteger outerEnumInteger;
    private OuterEnumDefaultValue outerEnumDefaultValue = OuterEnumDefaultValue.PLACED;
    private OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue = OuterEnumIntegerDefaultValue.NUMBER_0;

    /**
     * Default constructor.
     */
    public EnumTest() {
    // JSON-B / Jackson
    }

    /**
     * Create EnumTest.
     *
     * @param enumString enumString
     * @param enumStringRequired enumStringRequired
     * @param enumInteger enumInteger
     * @param enumNumber enumNumber
     * @param outerEnum outerEnum
     * @param outerEnumInteger outerEnumInteger
     * @param outerEnumDefaultValue outerEnumDefaultValue
     * @param outerEnumIntegerDefaultValue outerEnumIntegerDefaultValue
     */
    public EnumTest(
        EnumString enumString, 
        EnumStringRequired enumStringRequired, 
        EnumInteger enumInteger, 
        EnumNumber enumNumber, 
        OuterEnum outerEnum, 
        OuterEnumInteger outerEnumInteger, 
        OuterEnumDefaultValue outerEnumDefaultValue, 
        OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue
    ) {
        this.enumString = enumString;
        this.enumStringRequired = enumStringRequired;
        this.enumInteger = enumInteger;
        this.enumNumber = enumNumber;
        this.outerEnum = outerEnum;
        this.outerEnumInteger = outerEnumInteger;
        this.outerEnumDefaultValue = outerEnumDefaultValue;
        this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
    }



    /**
     * Get enumString
     * @return enumString
     */
    public EnumString getEnumString() {
        return enumString;
    }

    public void setEnumString(EnumString enumString) {
        this.enumString = enumString;
    }

    /**
     * Get enumStringRequired
     * @return enumStringRequired
     */
    public EnumStringRequired getEnumStringRequired() {
        return enumStringRequired;
    }

    public void setEnumStringRequired(EnumStringRequired enumStringRequired) {
        this.enumStringRequired = enumStringRequired;
    }

    /**
     * Get enumInteger
     * @return enumInteger
     */
    public EnumInteger getEnumInteger() {
        return enumInteger;
    }

    public void setEnumInteger(EnumInteger enumInteger) {
        this.enumInteger = enumInteger;
    }

    /**
     * Get enumNumber
     * @return enumNumber
     */
    public EnumNumber getEnumNumber() {
        return enumNumber;
    }

    public void setEnumNumber(EnumNumber enumNumber) {
        this.enumNumber = enumNumber;
    }

    /**
     * Get outerEnum
     * @return outerEnum
     */
    public OuterEnum getOuterEnum() {
        return outerEnum;
    }

    public void setOuterEnum(OuterEnum outerEnum) {
        this.outerEnum = outerEnum;
    }

    /**
     * Get outerEnumInteger
     * @return outerEnumInteger
     */
    public OuterEnumInteger getOuterEnumInteger() {
        return outerEnumInteger;
    }

    public void setOuterEnumInteger(OuterEnumInteger outerEnumInteger) {
        this.outerEnumInteger = outerEnumInteger;
    }

    /**
     * Get outerEnumDefaultValue
     * @return outerEnumDefaultValue
     */
    public OuterEnumDefaultValue getOuterEnumDefaultValue() {
        return outerEnumDefaultValue;
    }

    public void setOuterEnumDefaultValue(OuterEnumDefaultValue outerEnumDefaultValue) {
        this.outerEnumDefaultValue = outerEnumDefaultValue;
    }

    /**
     * Get outerEnumIntegerDefaultValue
     * @return outerEnumIntegerDefaultValue
     */
    public OuterEnumIntegerDefaultValue getOuterEnumIntegerDefaultValue() {
        return outerEnumIntegerDefaultValue;
    }

    public void setOuterEnumIntegerDefaultValue(OuterEnumIntegerDefaultValue outerEnumIntegerDefaultValue) {
        this.outerEnumIntegerDefaultValue = outerEnumIntegerDefaultValue;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnumTest {\n");
        
        sb.append("    enumString: ").append(toIndentedString(enumString)).append("\n");
        sb.append("    enumStringRequired: ").append(toIndentedString(enumStringRequired)).append("\n");
        sb.append("    enumInteger: ").append(toIndentedString(enumInteger)).append("\n");
        sb.append("    enumNumber: ").append(toIndentedString(enumNumber)).append("\n");
        sb.append("    outerEnum: ").append(toIndentedString(outerEnum)).append("\n");
        sb.append("    outerEnumInteger: ").append(toIndentedString(outerEnumInteger)).append("\n");
        sb.append("    outerEnumDefaultValue: ").append(toIndentedString(outerEnumDefaultValue)).append("\n");
        sb.append("    outerEnumIntegerDefaultValue: ").append(toIndentedString(outerEnumIntegerDefaultValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

