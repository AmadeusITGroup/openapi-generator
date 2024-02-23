package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;



public class MapTest   {

    private Map<String, Map<String, String>> mapMapOfString = new HashMap<>();

    /**
    * Gets or Sets inner
    */
    public enum Inner {
        UPPER("UPPER"),
        LOWER("lower");

        private String value;

        Inner(String value) {
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
        public static Inner fromValue(String text) {
            for (Inner b : Inner.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private Map<String, Inner> mapOfEnumString = new HashMap<>();
    private Map<String, Boolean> directMap = new HashMap<>();
    private Map<String, Boolean> indirectMap = new HashMap<>();

    /**
     * Default constructor.
     */
    public MapTest() {
    // JSON-B / Jackson
    }

    /**
     * Create MapTest.
     *
     * @param mapMapOfString mapMapOfString
     * @param mapOfEnumString mapOfEnumString
     * @param directMap directMap
     * @param indirectMap indirectMap
     */
    public MapTest(
        Map<String, Map<String, String>> mapMapOfString, 
        Map<String, Inner> mapOfEnumString, 
        Map<String, Boolean> directMap, 
        Map<String, Boolean> indirectMap
    ) {
        this.mapMapOfString = mapMapOfString;
        this.mapOfEnumString = mapOfEnumString;
        this.directMap = directMap;
        this.indirectMap = indirectMap;
    }



    /**
     * Get mapMapOfString
     * @return mapMapOfString
     */
    public Map<String, Map<String, String>> getMapMapOfString() {
        return mapMapOfString;
    }

    public void setMapMapOfString(Map<String, Map<String, String>> mapMapOfString) {
        this.mapMapOfString = mapMapOfString;
    }

    /**
     * Get mapOfEnumString
     * @return mapOfEnumString
     */
    public Map<String, Inner> getMapOfEnumString() {
        return mapOfEnumString;
    }

    public void setMapOfEnumString(Map<String, Inner> mapOfEnumString) {
        this.mapOfEnumString = mapOfEnumString;
    }

    /**
     * Get directMap
     * @return directMap
     */
    public Map<String, Boolean> getDirectMap() {
        return directMap;
    }

    public void setDirectMap(Map<String, Boolean> directMap) {
        this.directMap = directMap;
    }

    /**
     * Get indirectMap
     * @return indirectMap
     */
    public Map<String, Boolean> getIndirectMap() {
        return indirectMap;
    }

    public void setIndirectMap(Map<String, Boolean> indirectMap) {
        this.indirectMap = indirectMap;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MapTest {\n");
        
        sb.append("    mapMapOfString: ").append(toIndentedString(mapMapOfString)).append("\n");
        sb.append("    mapOfEnumString: ").append(toIndentedString(mapOfEnumString)).append("\n");
        sb.append("    directMap: ").append(toIndentedString(directMap)).append("\n");
        sb.append("    indirectMap: ").append(toIndentedString(indirectMap)).append("\n");
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

