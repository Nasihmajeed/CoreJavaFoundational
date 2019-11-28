package com.lxisoft.Repository;
public interface Repository
{
public ArrayList <Contact> getFromFile();
public void add(Contact c);
public void delete(int id);
public void edit(int id,String newname);
public ArrayList <Contact>  sortName();
}