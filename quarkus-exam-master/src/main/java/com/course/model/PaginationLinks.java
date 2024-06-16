package com.course.model;





public class PaginationLinks   {
  
  
 /**
   * The current page of data.  
  **/
  private String self = null;
  
  
 /**
   * The current page of data.  
  **/
  private String current = null;
  
  
 /**
   * The first page of data.  
  **/
  private String first = null;
  
  
 /**
   * The prev page of data.  
  **/
  private String prev = null;
  
  
 /**
   * The next page of data.  
  **/
  private String next = null;
  
  
 /**
   * The last page of data.  
  **/
  private String last = null;
 /**
   * The current page of data.
   * 
  **/
  
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public PaginationLinks self(String self) {
    this.self = self;
    return this;
  }

 /**
   * The current page of data.
   * 
  **/
  
  public String getCurrent() {
    return current;
  }

  public void setCurrent(String current) {
    this.current = current;
  }

  public PaginationLinks current(String current) {
    this.current = current;
    return this;
  }

 /**
   * The first page of data.
   * 
  **/
  
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public PaginationLinks first(String first) {
    this.first = first;
    return this;
  }

 /**
   * The prev page of data.
   * 
  **/
  
  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public PaginationLinks prev(String prev) {
    this.prev = prev;
    return this;
  }

 /**
   * The next page of data.
   * 
  **/
  
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PaginationLinks next(String next) {
    this.next = next;
    return this;
  }

 /**
   * The last page of data.
   * 
  **/
  
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public PaginationLinks last(String last) {
    this.last = last;
    return this;
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
