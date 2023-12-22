/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.4-amadeus.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Name.h
 *
 * Model for testing model name same as property name
 */

#ifndef Name_H_
#define Name_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Model for testing model name same as property name
/// </summary>
class  Name 
{
public:
    Name() = default;
    explicit Name(boost::property_tree::ptree const& pt);
    virtual ~Name() = default;

    Name(const Name& other) = default; // copy constructor
    Name(Name&& other) noexcept = default; // move constructor

    Name& operator=(const Name& other) = default; // copy assignment
    Name& operator=(Name&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Name members

    /// <summary>
    /// 
    /// </summary>
    int32_t getName() const;
    void setName(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getSnakeCase() const;
    void setSnakeCase(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getProperty() const;
    void setProperty(std::string value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getR123Number() const;
    void setR123Number(int32_t value);

protected:
    int32_t m_Name = 0;
    int32_t m_Snake_case = 0;
    std::string m_Property = "";
    int32_t m_r_123Number = 0;
};

std::vector<Name> createNameVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Name>(const Name& val) {
    return val.toPropertyTree();
}

template<>
inline Name fromPt<Name>(const boost::property_tree::ptree& pt) {
    Name ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Name_H_ */
