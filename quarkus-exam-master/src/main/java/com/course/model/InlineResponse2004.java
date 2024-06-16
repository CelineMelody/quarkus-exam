package com.course.model;




import java.util.ArrayList;
import java.util.List;

public class InlineResponse2004   {
  
  
  private List<CharacterModel> data = new ArrayList<CharacterModel>();
  
  
  private Meta meta = null;
  
  
  private PaginationLinks links = null;
 /**
   * Get data
   * 
  **/
  
  public List<CharacterModel> getData() {
    return data;
  }

  public void setData(List<CharacterModel> data) {
    this.data = data;
  }

  public InlineResponse2004 data(List<CharacterModel> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2004 addDataItem(CharacterModel dataItem) {
    this.data.add(dataItem);
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

  public InlineResponse2004 meta(Meta meta) {
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

  public InlineResponse2004 links(PaginationLinks links) {
    this.links = links;
    return this;
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
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
