import java.util.Scanner;

public class Teacher
{
    float total,large;
	String tname,topperName;

Student st=new Student();
Student [] s=new Student[3];


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
 


public float topper(Student []s) // passed a array as parameter
{
	
		s[0]=new Student();	
	s[1]=new Student();
	s[2]=new Student();


		large=s[0].total;
		topperName=s[0].sname;
	
		if(s[1].total>large)
		{		if(s[2].total<s[1].total)
			{
				large=s[1].total;
				topperName=s[1].sname;
			System.out.println("Topper of the Class  is "+topperName);
				return large;
	   
			}
		}
		else if(s[2].total>large)
		{
			if(s[1].total<s[2].total)
			{
			large=s[2].total;
			topperName=s[2].sname;
			System.out.println("Topper of the Class is : "+topperName);
			return large;
			}
	
		}
	else
	{
		
		System.out.println("Topper of the Class is : "+topperName);
		return large;
	}
	
	}
}
}



	
	
	
	



