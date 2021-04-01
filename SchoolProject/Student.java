import java.util.*;
public class Student
{
	String student_Name;
	
     float physics,chemistry,maths,total;
	 
	 Scanner sc=new Scanner(System.in);

public void setName()       //to print student name
{
	System.out.println("Enter the name of the Student");
	student_Name=sc.nextLine();
}

public String getName()
{
	return student_Name;
}

public void setMarks()   //to set marks for each subject
{
System.out.println("Enter the marks obtained in Physics : ");
physics=sc.nextFloat();

System.out.println("Enter the marks obtained in Chemistry : ");
chemistry=sc.nextFloat();

System.out.println("Enter the marks obtained in Maths : ");
maths=sc.nextFloat();
}


public void displayStudentMarks(Student s)   //to display marksin 3 subjects
{
System.out.println("...........Marks of "+s.getName()+" in all Subjects.............");	
System.out.println("Marks obtained by the student in Physics is : "+physics);	
System.out.println("Marks obtained by the student in Chemistry is : "+chemistry);
System.out.println("Marks obtained by the student in Maths is : "+maths);
}


public float totalMarks()   //method to find total marks of each student
{
	total=physics+chemistry+maths;
	System.out.println("Total marks obtained by the student is : "+total);
	return total;
}

}