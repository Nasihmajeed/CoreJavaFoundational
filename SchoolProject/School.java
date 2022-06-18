public class School
{
 String name ;
 String place;    

  ClassRoom class1;
  ClassRoom class2;
    

    School(String name, String place) {
        this.name = name;
        this.place = place;
}
public void printdetails()
{
System.out.println("School Name:"+this.name);
System.out.println("School Place :"+this.place);

System.out.println("\n");


class1.printClassRoomDetails();
class2.printClassRoomDetails();
 

}

}