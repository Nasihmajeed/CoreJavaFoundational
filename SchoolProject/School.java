import java.util.Scanner;
public class School
{
	//Classroom classes;
   	String name;
	int RegId;
	Classroom[] classRoom ;
    
  public void scan()
{
	int i;
	Scanner read = new Scanner(System.in);
   
    System.out.println(" \n enter the name of school");
    name=read.nextLine();
    System.out.println("\n  enter RegNumber");
    RegId=read.nextInt();
	classRoom= new Classroom[2];
	for(i=0; i<2; i++)
	{
		classRoom[i] = new Classroom();
		classRoom[i].scan();
	}
    
	
 }
 public void print()
 {
	 int i;
	 System.out.println("school "+name+" & RegNumber:"+RegId);
	 for(i=0;i<2;i++)
	 {
		 classRoom[i].print(); 
	 }
		 
 }
	
}
