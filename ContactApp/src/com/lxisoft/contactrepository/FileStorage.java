package com.lxisoft.contactrepository;
import java.util.ArrayList;
import com.lxisoft.model.*;

public interface FileStorage
{
	String directory="C:\\Users\\kpmuh\\Desktop\\java\\github\\CoreJavaFoundational\\ContactApp\\src\\com\\lxisoft\\contactrepository\\Contactlist.csv";
	public ArrayList<Contact> check();
	public ArrayList<Contact> initialFileRead();
	public void fileRead();
	public void syncFile(Contact contact,int j);
}

/*save(con)
ret findall
finbyname(str name)
delet(String name)
*/
// public void save(Contact contact);
// public ArrayList<Contact> findAll();
// public void findByName(String name);
// public void delete(String name);

