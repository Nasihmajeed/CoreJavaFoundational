import java.util.Scanner;
public class School
{
 String name;
 String place;
 Classroom[] classes;
 
 
   void setSchoolDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of school:");
		name =sc.nextLine();
		System.out.println("Enter place:");
		place =sc.nextLine();
		System.out.println("\n ");
		System.out.println("classroomdetails");
		System.out.println("\n");
		System.out.println("enter no of classes");
		int n=sc.nextInt();

		classes=new Classroom[n];
		for(int i=0;i<n;i++)
		{ 
			System.out.println("\nenter "+(i+1)+" th classroom details");
			classes[i]=new Classroom();
			classes[i].setClassroomDetails();
		}
    }

    void getSchoolDetails()
	{
		System.out.println("\n");
		int n=classes.length;
		System.out.println(name);
		System.out.println("Situated in "+place);
		System.out.println("---------------------");
	    for(int i=0;i<n;i++)
		{
	       classes[i].getClassroomDetails();
	      
	        classes[i].rankList();
        }
	}
	   		

    void rankList()
	{   
		int length=0; 
		int clslength=classes.length;
		Student temp=new Student();
		for(int i=0;i<clslength;i++)
		{
			int n=classes[i].student.length;
			for(int j=0;j<n;j++)
			{
				length++;
			}
		}		
        Student[] rank=new Student[length];
        int len=0;
		for(int i=0;i<clslength;i++)
		{
			int n=classes[i].student.length;
			for(int j=0;j<n;j++)
			{
		   	rank[len]=classes[i].student[j];
		   	len++;
		    }
	    }
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<length; j++)
			{
				if(rank[i].total>rank[j].total)
					{
						temp=rank[i];
						rank[i]=rank[j];
						rank[j]=temp;
					}
			}
		}
		System.out.println("schoolwise ranklist");
		System.out.println("--------------------");	
		for(int i=0; i<length; i++)
		{
			System.out.println(" name: "+rank[i].name+"\t"+" rank:"+rank[i].total);
			System.out.println();
		}
	}
}
