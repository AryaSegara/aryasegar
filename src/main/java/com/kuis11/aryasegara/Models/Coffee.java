package com.kuis11.aryasegara.Models;

public class Coffee {

  private Integer id;
  private String name;
  private long price;
  private String size;
public Coffee(Integer id, String name, long price, String size) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.size = size;
}
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public long getPrice() {
    return price;
}
public void setPrice(long price) {
    this.price = price;
}
public String getSize() {
    return size;
}
public void setSize(String size) {
    this.size = size;
}

  
}
