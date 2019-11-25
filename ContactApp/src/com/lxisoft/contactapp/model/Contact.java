package com.lxisoft.contactapp.model;
/**
*contact model class
*/
public class Contact implements Comparable<Contact>{
	private  String name;
    private String  number;
/**
*setter for name
*@param String contact name
*/
public void setName(String name){
	this.name=name;
}
/**
*getter for name
*@return String contact name
*/
public String getName(){
	return name;
}
/**
*setter for number
*@param String contact number
*/
public void setNumber(String  number){
	this.number=number;
}
/**
*getter for number
*@return String contact name
*/
public String getNumber(){
	return number;
}
/**
*method for sorting
*@param Contact a single contact 
*@return String contact name
*/
public int compareTo(Contact contact){
	int x=this.name.compareTo(contact.name);
	return x;
}
}