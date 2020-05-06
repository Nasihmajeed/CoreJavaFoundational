package com.lxisoft.movie;

import java.util.*;

import com.lxisoft.movie.*;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object obj1,Object obj2)
	{
		Dialouge dialouge1 = (Dialouge)obj1;
		Dialouge dialouge2 = (Dialouge)obj2;
		
		//return dialouge1.getId().compareTo(dialouge2.getId());
		if(Integer.parseInt(dialouge1.getId()) == Integer.parseInt(dialouge2.getId()))
		{
			return 0;
		}
		else if(Integer.parseInt(dialouge1.getId()) > Integer.parseInt(dialouge2.getId()))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
