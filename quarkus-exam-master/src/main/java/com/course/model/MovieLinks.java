package com.course.model;





public class MovieLinks   {
  
  
  private String self = null;
 /**
   * Get self
   * 
  **/
  
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public MovieLinks self(String self) {
    this.self = self;
    return this;
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
