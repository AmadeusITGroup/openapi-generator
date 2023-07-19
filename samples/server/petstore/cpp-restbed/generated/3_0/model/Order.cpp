/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Order.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Order::Order(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Order::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Order::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Order::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("petId", m_PetId);
	pt.put("quantity", m_Quantity);
	pt.put("shipDate", m_ShipDate);
	pt.put("status", m_Status);
	pt.put("complete", m_Complete);
	return pt;
}

void Order::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_PetId = pt.get("petId", 0L);
	m_Quantity = pt.get("quantity", 0);
	m_ShipDate = pt.get("shipDate", "");
	setStatus(pt.get("status", ""));
	m_Complete = pt.get("complete", false);
}

int64_t Order::getId() const
{
    return m_Id;
}

void Order::setId(int64_t value)
{
    m_Id = value;
}


int64_t Order::getPetId() const
{
    return m_PetId;
}

void Order::setPetId(int64_t value)
{
    m_PetId = value;
}


int32_t Order::getQuantity() const
{
    return m_Quantity;
}

void Order::setQuantity(int32_t value)
{
    m_Quantity = value;
}


std::string Order::getShipDate() const
{
    return m_ShipDate;
}

void Order::setShipDate(std::string value)
{
    m_ShipDate = value;
}


std::string Order::getStatus() const
{
    return m_Status;
}

void Order::setStatus(std::string value)
{
    static const std::array<std::string, 3> allowedValues = {
        "placed", "approved", "delivered"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Status = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


bool Order::isComplete() const
{
    return m_Complete;
}

void Order::setComplete(bool value)
{
    m_Complete = value;
}



std::vector<Order> createOrderVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Order>();
    for (const auto& child: pt) {
        vec.emplace_back(Order(child.second));
    }

    return vec;
}

}
}
}
}

