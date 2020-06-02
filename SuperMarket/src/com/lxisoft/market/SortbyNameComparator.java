package com.lxisoft.market;
import com.lxisoft.market.*;
import java.util.Objects;
import java.util.*; 
import java.lang.*; 
import java.io.*;
class SortbyNameComparator implements Comparator<Employee> 
{ 
    public int compare(Employee a, Employee b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 
