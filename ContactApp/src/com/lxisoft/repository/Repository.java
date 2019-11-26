package com.lxisoft.repository;
import com.lxisoft.model.*;
import java.util.ArrayList;
import com.lxisoft.domain.*;

public interface Repository
{
	public void save(Contact contact);
	public ArrayList<Contact> findAll();
	//public ArrayList<Contact> edit(EditModel editModel,String[] tempEdit);
	public ArrayList<Contact> delete(Contact contact);
}
