public class ClassRoom
{
 String standard ;
 String division;    
 
Teacher tr;

 Student student1;
 Student student2;
 Student student3;
 Student student4;
  
    

    ClassRoom(String standard, String division) {

        this.standard = standard;

        this.division = division;
}
public void printClassRoomDetails()
{

System.out.println("ClassRoom Standard:"+this.standard);

System.out.println("ClassRoom Division :"+this.division);

System.out.println("\n");


tr.printdetails();


student1.printStudentDetails();

student2.printStudentDetails();

student3.printStudentDetails();

student4.printStudentDetails();

 

}

}