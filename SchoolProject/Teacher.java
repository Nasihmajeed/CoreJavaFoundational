import java.util.Scanner;

public class Teacher
{
    float total;
	String tname;

Student st=new Student();

public void teacherDetails()
{
	System.out.println("Enter the name of the Teacher ");
	Scanner sc=new Scanner(System.in);
	tname=sc.nextLine();
	
}

public void teacherName()
{
	System.out.println("Name of the Teacher is : "+tname);
	
}


public void passOrFail(Student st)
{
	if(st.physics>35)
	{
		System.out.println("Student "+st.sname+" passed in physics with marks: "+st.physics);
	}
	else
	{
		System.out.println("Student "+st.sname+" failed in physics with marks: "+st.physics);
	}
	
if(st.maths>35)
	{
		System.out.println("Student "+st.sname+" passed in maths with marks: "+st.maths);
	}
	else
	{
		System.out.println("Student "+st.sname+" failed in maths with marks: "+st.maths);
		
	}	
	if(st.chemistry>35)
	{
		System.out.println("Student "+st.sname+" passed in chemistry with marks: "+st.chemistry);
	}
	else
	{
		System.out.println("Student "+st.sname+"  failed in chemistry with marks: "+st.chemistry);
	}	
}
 
Standard std=new Standard();
float large,top;
public void topper(Student []st)
{
	large=st[0].total;
	
	
	if(s[1].total>large)
	{	if(s[2].total<s[1].total)
		{
			large=s[1].total;
		System.out.println("Topper of the Class is : "+st[1].sname+" with "+large+" marks");
	
		}
	
	}
	else if(st[2].total>large)
	{
		if(st[1].total<st[2].total)
		{
			large=s[2].total;
		System.out.println("Topper of the Class is : "+st[2].sname+" with"+large+" marks");
		}
	}
	else
	{
		System.out.println("Topper of the Class is : "+st[0].sname+"with :"+large+" marks");
	
	}
}

}