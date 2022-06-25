package com.lxisoft.school;
import com.lxisoft.classroom.ClassRoom;
public class School
{
private String name ;
private String place;    

 public ClassRoom [] class1 = new ClassRoom[3];
    

   public School(String name, String place) {
        this.name = name;
        this.place = place;
}


public String getName() {
 return name;

}

public void setName(String newName) {
 this.name = newName;

}

public String getPlace() {
 return place;

}

public void setPlace(String newPlace) {
 this.place = newPlace;

}


public void printdetails() {

System.out.println("School Name:"+this.name);

System.out.println("School Place :"+this.place);

System.out.println("\n");


for(int x = 1;x < 3;x++) {

class1[x].printClassRoomDetails();

} 

}

}