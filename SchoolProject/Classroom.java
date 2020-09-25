import java.util.Scanner;
public class Classroom
{
	String topper,teacher;
	int n=3,percentage,total,i=0,division;
    public void studentdetails()
    {
    	Scanner scanner = new Scanner(System.in);
    	Students[] st = new Students[3];
    	Subjects[] sb = new Subjects[3];
    	for(i=0;i<=3;i++)
    	{
    	    System.out.println("           Enter the student details:          ");


    	    System.out.println(" Enter the Name of the Student : ");
    	    String name =scanner.next();
    	    System.out.println(" Enter the Students Reg no : ");
    	    int regno =scanner.nextInt();
    	    System.out.println(" Enter the mark of 1st Subject of the Student : ");
    	    sb[i].sub1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 2nd Subject of the Student : ");
    	    sb[i].sub2 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 3rd Subject of the Student : ");
    	    sb[i].sub3 =scanner.nextInt();
            st[i].setName(name);
            st[i].setRegisternumber(regno);
            st[i].getName();
            st[i].getRegisternumber();
            sb[i].Subjectsmark();
            sb[i].Total();
            sb[i].Percentage();
            sb[i].Topper();
            sb[i].ClassTeacherofthetopper(teacher);
    	}
    	
    }

}
	
