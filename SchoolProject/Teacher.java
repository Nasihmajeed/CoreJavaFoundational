import java.util.Scanner;

public class Teacher
{
    float total,large;
	String tname;

Student st=new Student();
School sl=new School();

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
 

public float topper(Student []st)
{
	large=st[0].total;
	
	
	if(st[1].total>large)
	{	if(st[2].total<st[1].total)
		{
			large=st[1].total;
		System.out.println("Topper of the Class  is "+st[1].sname+" with "+large+" marks");
	   
		}
	return large;
	}
	else if(st[2].total>large)
	{
		if(st[1].total<st[2].total)
		{
			large=st[2].total;
		System.out.println("Topper of the Class is : "+st[2].sname+" with"+large+" marks");
		}
		return large;
	}
	else
	{
		System.out.println("Topper of the Class is : "+st[0].sname+"with :"+large+" marks");
	}
	return large;
}


public float schoolTopper(Standard std[])
{
	sl.init();
	large=std[0].topMarks;
	if(std[1].topMarks<large)
	{
		if(std[2].topMarks<large)
		{
			System.out.println("Topper of the School is : "+std[0].st[0].sname);
		}
		return std[0].topMarks;
	}
	else if(std[1].topMarks>large)
	{
		if(std[2].topMarks<std[1].topMarks)
		{
			System.out.println("Topper of the School is : "+std[1].st[0].sname);
		}
		return std[1].topMarks;
	}
	else
	{
		System.out.println("Topper of the School is : "+std[2].st[0].sname);
	}
	return std[2].topMarks;
}

}



	
	
	
	



