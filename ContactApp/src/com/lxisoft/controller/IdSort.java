package com.lxisoft.controller;
import com.lxisoft.domain.*;
import java.util.*;

public class IdSort implements Comparator<Contact>
{
    public int compare(Contact c1,Contact c2) 
    { 

    	// for comparison 
    	return c1.getId().compareTo(c1.getId()); 
 	 
    } 
}