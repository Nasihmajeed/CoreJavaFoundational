package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;

public class IdSort implements Comparator<Contact>
{
   @Override
    public int compare(Contact c1,Contact c2) 
    { 

    // for comparison 
    return c1.getId().compareTo(c1.getId()); 
 	 
    } 
}