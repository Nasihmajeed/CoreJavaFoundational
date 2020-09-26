import java.util.Scanner;
public class Classroom
{
	String topper,teacher1,teacher2;
	int n,percentage,total,i,division;
    public void studentdetails1()
    {
    	Scanner scanner = new Scanner(System.in);
    	Students[] st1 = new Students[3];
    	Students[] st2 = new Students[3];
    	for(i=0;i<=3;i++)
    	{
    		st1[i]=new Students();
    		st2[i]=new Students();
    	    System.out.println(" \n           ENTER THE STUDENT DETAILS          ");



    	    System.out.println(" Enter the Name of 1st Class teachers Student : ");
    	    String name1 =scanner.next();
    	    System.out.println(" Enter the Students Reg no : ");
    	    int regno1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 1st Subject of the Student : ");
    	    st1[i].sub1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 2nd Subject of the Student : ");
    	    st1[i].sub2 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 3rd Subject of the Student : ");
    	    st1[i].sub3 =scanner.nextInt();
    	    st1[i].setName1(name1);
            st1[i].setRegisternumber1(regno1);
            st1[i].getName1();
            st1[i].getRegisternumber1();
            st1[i].Subjectsmarktotalpercentagetopper1();
            st1[i].ClassTeacherofthetopper(teacher1); 


            System.out.println(" Enter the Name of the 2nd Class teachers  Student : ");
    	    String name2 =scanner.next();
    	    System.out.println(" Enter the Students Reg no : ");
    	    int regno2 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 1st Subject of the Student : ");
    	    st2[i].sub1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 2nd Subject of the Student : ");
    	    st2[i].sub2 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 3rd Subject of the Student : ");
    	    st2[i].sub3 =scanner.nextInt(); 
            st2[i].setName2(name2);
            st2[i].setRegisternumber2(regno2);
            st2[i].getName2();
            st2[i].getRegisternumber2();
            st2[i].Subjectsmarktotalpercentagetopper2();
            st2[i].Topperoftheschool();
            st2[i].ClassTeacherofthetopper(teacher2);
    	}
    }
}
	
