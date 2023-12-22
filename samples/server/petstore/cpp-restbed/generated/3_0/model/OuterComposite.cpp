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



#include "OuterComposite.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
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

OuterComposite::OuterComposite(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OuterComposite::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OuterComposite::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OuterComposite::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("my_number", m_My_number);
	pt.put("my_string", m_My_string);
	pt.put("my_boolean", m_My_boolean);
	return pt;
}

void OuterComposite::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_My_number = pt.get("my_number", 0.0);
	m_My_string = pt.get("my_string", "");
	m_My_boolean = pt.get("my_boolean", false);
}

double OuterComposite::getMyNumber() const
{
    return m_My_number;
}

void OuterComposite::setMyNumber(double value)
{
    m_My_number = value;
}


std::string OuterComposite::getMyString() const
{
    return m_My_string;
}

void OuterComposite::setMyString(std::string value)
{
    m_My_string = value;
}


bool OuterComposite::isMyBoolean() const
{
    return m_My_boolean;
}

void OuterComposite::setMyBoolean(bool value)
{
    m_My_boolean = value;
}



std::vector<OuterComposite> createOuterCompositeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OuterComposite>();
    for (const auto& child: pt) {
        vec.emplace_back(OuterComposite(child.second));
    }

    return vec;
}

}
}
}
}

