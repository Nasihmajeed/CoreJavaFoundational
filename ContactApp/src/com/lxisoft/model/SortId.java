package com.lxisoft.model;
import com.lxisoft.view.*;
import com.lxisoft.controller.*;
import java.util.Scanner;
import com.lxisoft.test.*;

public class SortId implements Comparable <Contact>
{
 public int Compare ( Contact c,Contact c1)
   {
		int x = c.getId()-(c1.getId());
	return x ;
   }
}    