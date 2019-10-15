import java.util.Scanner;
public class School
{
 String name;
 String place;
 Classroom[] classes;

public School(String sName,String sPlace)
{
 	name=sName;
 	place=sPlace;
}
public void scan()
  {
  	Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of classes:");
    int n=sc.nextInt();
    classes=new Classroom[n];
    for(int i=0;i<n;i++)
    {
	    System.out.println("Enter standard:");
	    int std=sc.nextInt();
	    classes[i]=new Classroom(std);
	    classes[i].scan();
    }
    
  }


 void getSchoolDetails()
 {
	System.out.println(name);
	System.out.println("Situated in "+place);
	System.out.println("---------------------");
	for(int i=0;i<classes.length;i++)
	{
		classes[i].getClassroomDetails();
		classes[i].rankList();
    }
 } 
 void rankList()
	{   
		int length=0; 
		int clslength=classes.length;
		Student temp;
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
			System.out.println("Rank: " +(i+1)+"\t"+ " Name: "+rank[i].name+"\t"+" Total marks:"+rank[i].total);
			System.out.println();
		}
	}
}



 