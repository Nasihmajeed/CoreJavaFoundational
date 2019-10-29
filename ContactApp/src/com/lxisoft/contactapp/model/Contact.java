package com.lxisoft.contactapp.model;
public class Contact{
	private  String name;
	 private long  number;
/*public Contact(String name,long  number){
	name=this.name;
	number=this.number;
}*/
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setNumber(long  number){
	this.number=number;
}
public long getNumber(){
	return number;
}
}