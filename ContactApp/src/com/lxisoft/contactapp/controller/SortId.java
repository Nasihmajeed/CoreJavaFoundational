package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class SortId implements Comparator<Contact>{


	public int compare(Contact c1,Contact c2){
		return c1.getId()-(c2.getId());
	}
}