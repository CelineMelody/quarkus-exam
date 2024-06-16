package com.course.model;




/**
  * Meta information about the response.
 **/

public class Meta   {
  
  
  private String copyright = null;
  
  
  private String generatedAt = null;
 /**
   * Get copyright
   * 
  **/
  
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public Meta copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

 /**
   * Get generatedAt
   * 
  **/
  
  public String getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(String generatedAt) {
    this.generatedAt = generatedAt;
  }

  public Meta generatedAt(String generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
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
