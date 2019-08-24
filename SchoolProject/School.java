public class School
{
 String name;
 String place;
 Classroom classes;

 public School(String sName,String sPlace)
 {
 	name=sName;
 	place=sPlace;
 }

 void getSchoolDetails()
 {
	classes=new Classroom(8);
	System.out.println(name);
	System.out.println("Situated in "+place);
	System.out.println("---------------------");
	classes.getClassroomDetails();
 } 
}



 