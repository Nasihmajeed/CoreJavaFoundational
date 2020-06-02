import java.util.Scanner;
public class School
{
	String schoolName;
	String place;
	Classroom[]  classes;
	public School(String sName,String sPlace)
	{
		schoolName=sName;
		place=sPlace;
	}
	public void setDetails()
	{				
		Scanner sc=new Scanner(System.in);			
		System.out.println("number of classes");
		int classNo=sc.nextInt();
		classes=new Classroom[classNo];	
		for(int i=0;i<classNo;i++)
		{
			
			System.out.println("enter standard");	    
		    String standard=sc.next();
		    classes[i]=new Classroom(standard);	
			classes[i].setDetails();
		}
	}	
	public void printDetails()
	{
		System.out.println("name of the school is" +schoolName);
		System.out.println("situated in "+place);
		int classNo=classes.length;
		for(int i=0;i<classNo;i++)
		{
			classes[i].printDetails();
		}
			
    }
}	