package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;

public class NumberSort implements Comparator<Contact>
{
   @Override
    public int compare(Contact c1,Contact c2) 
    { 

    // for comparison 
    return c1.getNumber().compareTo(c1.getNumber()); 
 	 
    } 
}