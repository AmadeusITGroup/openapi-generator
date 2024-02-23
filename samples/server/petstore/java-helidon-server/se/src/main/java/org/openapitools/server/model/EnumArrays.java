package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;



public class EnumArrays   {


    /**
    * Gets or Sets justSymbol
    */
    public enum JustSymbol {
        GREATER_THAN_OR_EQUAL_TO(">="),
        DOLLAR("$");

        private String value;

        JustSymbol(String value) {
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
        public static JustSymbol fromValue(String text) {
            for (JustSymbol b : JustSymbol.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private JustSymbol justSymbol;

    /**
    * Gets or Sets arrayEnum
    */
    public enum ArrayEnum {
        FISH("fish"),
        CRAB("crab");

        private String value;

        ArrayEnum(String value) {
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
        public static ArrayEnum fromValue(String text) {
            for (ArrayEnum b : ArrayEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private List<ArrayEnum> arrayEnum;

    /**
     * Default constructor.
     */
    public EnumArrays() {
    // JSON-B / Jackson
    }

    /**
     * Create EnumArrays.
     *
     * @param justSymbol justSymbol
     * @param arrayEnum arrayEnum
     */
    public EnumArrays(
        JustSymbol justSymbol, 
        List<ArrayEnum> arrayEnum
    ) {
        this.justSymbol = justSymbol;
        this.arrayEnum = arrayEnum;
    }



    /**
     * Get justSymbol
     * @return justSymbol
     */
    public JustSymbol getJustSymbol() {
        return justSymbol;
    }

    public void setJustSymbol(JustSymbol justSymbol) {
        this.justSymbol = justSymbol;
    }

    /**
     * Get arrayEnum
     * @return arrayEnum
     */
    public List<ArrayEnum> getArrayEnum() {
        return arrayEnum;
    }

    public void setArrayEnum(List<ArrayEnum> arrayEnum) {
        this.arrayEnum = arrayEnum;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnumArrays {\n");
        
        sb.append("    justSymbol: ").append(toIndentedString(justSymbol)).append("\n");
        sb.append("    arrayEnum: ").append(toIndentedString(arrayEnum)).append("\n");
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

