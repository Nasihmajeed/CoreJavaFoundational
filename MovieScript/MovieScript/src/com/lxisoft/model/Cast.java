package com.lxisoft.model;
import com.lxisoft.model.*;

public class Cast implements Comparable<Cast>
{
  public String name;
  String characterName;
  int age;
public String character;
    
  public void setName(String n)
  {
    this.name = n;
  }
  public String getName()
  {
    return name;
  }
  public void setCharacter(String cn)
  {
		this.characterName = cn;
	}
	public String getCharacter()
  {
		return characterName;
	}
  public void setAge(int a)
  {
    this.age = a;
  }	
    public int getAge()
  {
    return age;
  }
    public int compareTo(Cast c)
  {
    return this.age - c.age;
  }
}
