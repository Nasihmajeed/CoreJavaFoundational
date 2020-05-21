package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.Objects;
import java.util.*; 
import java.lang.*; 
import java.io.*;
public class Employee{
      
    int empNo; 
    String name, post; 
  
     
    public Employee(int empNo, String name, String post) 
    { 
        this.empNo = empNo; 
        this.name = name; 
        this.post = post; 
    } 
  
    
    public String toString() 
    { 
        return this.empNo + " " + this.name + 
                           " " + this.post; 
    } 
} 
  
