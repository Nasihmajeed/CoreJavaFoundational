package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.Objects;
import java.util.*; 
import java.lang.*; 
import java.io.*;  
public class Address
{
	String address;
	String place;
	int pinCode ;
	public Address(String address,String place,int pinCode){
		this.address = address; 
        this.place = place;
        this.pinCode = pinCode; 
	}
}