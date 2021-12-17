public class Actor  {

 private String name;
 private String age;
 private String gender;
 private String place;


public String getName()   {
	return name;
}
public void setName(String newName)  {
	this.name = newName;
}


public String getGender()   {
	return gender;
}
public void setGender(String newGender)  {
	this.gender = newGender;
}


public String getAge()   {
	return age;
}
public void setAge(String newAge)  {
	this.age = newAge;
}


public String getPlace()   {
	return place;
}
public void setPlace(String newPlace)  {
	this.place = newPlace;
}
public void printDetails()  {

    System.out.println("Name :" + name);
    System.out.println("Gender :" + gender);
    System.out.println("Age :" + age);
	System.out.println("Place :" + place);
	
	System.out.println(".................");
	System.out.println("\n");
	
}	
}