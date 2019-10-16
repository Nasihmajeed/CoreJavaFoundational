import java.util.Scanner; 
public class Student
{
 public String name;
 public int id;
 Subject[] subject ;
  public int total;
 public void scan()
 {
	 subject = new Subject [3];
   Scanner read = new Scanner(System.in);
   System.out.println("\n enter the student name");
   name=read.nextLine();
   System.out.println("\n enter the student id");
   id=read.nextInt();
   
   for(int i=0; i<3; i++)       
   {
	   subject[i] = new Subject();                                                
	   subject[i].scan();
   }  
}
public void total()                  
{   
    
     
	 int j,temp; 
     
    total=0;
	for(int i=0; i<3; i++)
	{
		total=total+subject[i].score;
	}
	
    // System.out.println(" \n total score achieved : " +total); 
	 
}
 public void print()
 {
	 System.out.println("\n name of student is  "+name+" \n student Id :"+id);
	  for(int i=0; i<3; i++)
   {
	   subject[i].print();
   }
	
 }
}