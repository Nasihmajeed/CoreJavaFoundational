package com.lxisoft.contactapp.model;
public class Contact implements Comparable<Contact>{
	private  String name;
	 private String  number;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setNumber(String  number){
	this.number=number;
}
public String getNumber(){
	return number;
}
public int compareTo(Contact contact){
	int x=this.contact.name>contact.name;
	return x;
}
}