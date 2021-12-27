public class Actor  {

 private String name;
 private String characterName;
 private String age;
 private String gender;
 private String place;


public String getName()   {
	return name;
}
public void setName(String newName)  {
	this.name = newName;
}


public String getCharacterName()   {
	return characterName;
}
public void setCharacterName(String newCharacterName)  {
	this.characterName = newCharacterName;
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

    System.out.println("\t\tName :" + name);
	System.out.println("\t\tCharacter Name :" + characterName);
    System.out.println("\t\tGender :" + gender);
    System.out.println("\t\tAge :" + age);
	System.out.println("\t\tPlace :" + place);
	
	
	System.out.println("\t\t.................");
	System.out.println("\n");
	
}	
}