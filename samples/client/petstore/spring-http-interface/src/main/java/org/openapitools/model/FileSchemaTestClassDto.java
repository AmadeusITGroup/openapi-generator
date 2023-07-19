package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FileDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FileSchemaTestClassDto
 */

@JsonTypeName("FileSchemaTestClass")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FileSchemaTestClassDto {

  private FileDto file;

  
  private List<FileDto> files;

  public FileSchemaTestClassDto file(FileDto file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/FileSchemaTestClass.java
  @Valid 
  @Schema(name = "file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public File getFile() {
========
  
  @JsonProperty("file")
  public FileDto getFile() {
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/FileSchemaTestClassDto.java
    return file;
  }

  public void setFile(FileDto file) {
    this.file = file;
  }

  public FileSchemaTestClassDto files(List<FileDto> files) {
    this.files = files;
    return this;
  }

  public FileSchemaTestClassDto addFilesItem(FileDto filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
  */
<<<<<<<< HEAD:samples/openapi3/server/petstore/springboot-useoptional/src/main/java/org/openapitools/model/FileSchemaTestClass.java
  @Valid 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<File> getFiles() {
========
  
  @JsonProperty("files")
  public List<FileDto> getFiles() {
>>>>>>>> 7f8b853f502d9039c9a0aac2614ce92871e895ed:samples/client/petstore/spring-http-interface/src/main/java/org/openapitools/model/FileSchemaTestClassDto.java
    return files;
  }

  public void setFiles(List<FileDto> files) {
    this.files = files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSchemaTestClassDto fileSchemaTestClass = (FileSchemaTestClassDto) o;
    return Objects.equals(this.file, fileSchemaTestClass.file) &&
        Objects.equals(this.files, fileSchemaTestClass.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSchemaTestClassDto {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

