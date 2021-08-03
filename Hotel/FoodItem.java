package com.lxisoft.menu;

public class FoodItem {
private String foodName;
private int foodPrice;

public FoodItem(String foodName,int foodPrice){
  this.foodName=foodName;
  this.foodPrice=foodPrice;
}

public void setfoodName(String foodName){
  this.foodName=foodName;
}
public void setfoodPrice(int foodPrice){
  this.foodPrice=foodPrice;
}

public String getfoodName(){
  return foodName;
}

public int getfoodPrice(){
  return foodPrice;
}
}