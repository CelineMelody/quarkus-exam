package com.course.model;




public class InlineResponse2005   {
  
  
  private CharacterModel data = null;
  
  
  private Meta meta = null;
  
  
  private PaginationLinks links = null;
 /**
   * Get data
   * 
  **/
  
  public CharacterModel getData() {
    return data;
  }

  public void setData(CharacterModel data) {
    this.data = data;
  }

  public InlineResponse2005 data(CharacterModel data) {
    this.data = data;
    return this;
  }

 /**
   * Get meta
   * 
  **/
  
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public InlineResponse2005 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get links
   * 
  **/
  
  public PaginationLinks getLinks() {
    return links;
  }

  public void setLinks(PaginationLinks links) {
    this.links = links;
  }

  public InlineResponse2005 links(PaginationLinks links) {
    this.links = links;
    return this;
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
