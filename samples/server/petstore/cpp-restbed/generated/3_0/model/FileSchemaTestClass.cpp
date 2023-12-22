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



#include "FileSchemaTestClass.h"

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

FileSchemaTestClass::FileSchemaTestClass(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FileSchemaTestClass::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FileSchemaTestClass::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FileSchemaTestClass::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("file", m_file.toPropertyTree());
	// generate tree for Files
    tmp_node.clear();
	if (!m_Files.empty()) {
        tmp_node = toPt(m_Files);
		pt.add_child("files", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void FileSchemaTestClass::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("file")) {
        m_file = fromPt<File>(pt.get_child("file"));
	}
	// push all items of Files into member
	if (pt.get_child_optional("files")) {
        m_Files = fromPt<std::vector<File>>(pt.get_child("files"));
	}
}

File FileSchemaTestClass::getFile() const
{
    return m_file;
}

void FileSchemaTestClass::setFile(File value)
{
    m_file = value;
}


std::vector<File> FileSchemaTestClass::getFiles() const
{
    return m_Files;
}

void FileSchemaTestClass::setFiles(std::vector<File> value)
{
    m_Files = value;
}



std::vector<FileSchemaTestClass> createFileSchemaTestClassVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FileSchemaTestClass>();
    for (const auto& child: pt) {
        vec.emplace_back(FileSchemaTestClass(child.second));
    }

    return vec;
}

}
}
}
}

