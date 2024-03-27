/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0-amadeus.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ApiResponse.h
 *
 * 
 */

#ifndef ApiResponse_H_
#define ApiResponse_H_



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
/// 
/// </summary>
class  ApiResponse 
{
public:
    ApiResponse() = default;
    explicit ApiResponse(boost::property_tree::ptree const& pt);
    virtual ~ApiResponse() = default;

    ApiResponse(const ApiResponse& other) = default; // copy constructor
    ApiResponse(ApiResponse&& other) noexcept = default; // move constructor

    ApiResponse& operator=(const ApiResponse& other) = default; // copy assignment
    ApiResponse& operator=(ApiResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ApiResponse members

    /// <summary>
    /// 
    /// </summary>
    int32_t getCode() const;
    void setCode(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

protected:
    int32_t m_Code = 0;
    std::string m_Type = "";
    std::string m_Message = "";
};

std::vector<ApiResponse> createApiResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ApiResponse>(const ApiResponse& val) {
    return val.toPropertyTree();
}

template<>
inline ApiResponse fromPt<ApiResponse>(const boost::property_tree::ptree& pt) {
    ApiResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ApiResponse_H_ */
