package com.lxisoft.hotel;
//import com.lxisoft.hotel.Employee;
public class Order {
//Employee employee = new Employee()
///public void demo(){
//showOrderToCustomer();
private  int selectedFoodItemPrice;
private  int selectedQuantityOfFoodItem;
private  String selectedFoodName;


public Order( int selectedFoodItemPrice,int selectedQuantityOfFoodItem, String selectedFoodName){
this.selectedQuantityOfFoodItem=selectedQuantityOfFoodItem;
 this.selectedFoodItemPrice=selectedFoodItemPrice;
 this.selectedFoodName=selectedFoodName;
}

public void setSelectedFoodItemPrice(int selectedFoodItemPrice){
  this.selectedFoodItemPrice=selectedFoodItemPrice;
}
public void setSelectedQuantityOfFoodItem(int selectedQuantityOfFoodItem){
  this.selectedQuantityOfFoodItem=selectedQuantityOfFoodItem;
}
public void setSelectedFoodName(String selectedFoodName){
  this.selectedFoodName=selectedFoodName;
}

public int getSelectedFoodItemPrice(){
  return selectedFoodItemPrice;
}

public int getSelectedQuantityOfFoodItem(){
  return selectedQuantityOfFoodItem;
}
public String getSelectedFoodName(){
  return selectedFoodName;
}
}