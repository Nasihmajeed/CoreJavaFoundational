import java.util.Scanner;
public class School
{
	//Classroom classes;
   	String name;
	int RegId;
	Classroom[] classRoom ;
    
  public void scan()
{
	int i;
	Scanner read = new Scanner(System.in);
   
    System.out.println(" \n enter the name of school");
    name=read.nextLine();
    System.out.println("\n  enter RegNumber");
    RegId=read.nextInt();
	classRoom= new Classroom[2];
	for(i=0; i<2; i++)
	{
		classRoom[i] = new Classroom();
		classRoom[i].scan(); 
	
	} 
}	
 
 public void print()
 {
	 int i;
	 System.out.println("school "+name+" & RegNumber:"+RegId);
	 for(i=0;i<2;i++)
	 {
		 classRoom[i].print();		 
	 }
	 
	 for(i=0;i<2;i++)
	 {
		 classRoom[i].rank();		 
	 }
		 
 }
 
	public void rank()
	{
		int n,i,j,t=0,k;
		Student students = new Student();
		Student temp= new Student();
		for(i=0;i<2;i++)
		{
			t=t+classRoom[i].students.length;
		}
		for(i=0;i<t;i++)
		{
			for(j=0;j<2;j++)
			{
				n=classRoom[i].students.length;
				for(k=0;k<n;k++)
				{ 
				  if(classRoom[i].students[j].total<classRoom[j].students[k].total)
				  {
					  temp=classRoom[i].students[j];
					  classRoom[i].students[j]=classRoom[j].students[k];
					  classRoom[j].students[k]=temp;
				  }
				}
			}
		}
		int l=0;
		System.out.println("School Rank-List");
		for(i=0;i<2;i++)
			{
				n=classRoom[i].students.length;
				for(j=0;j<n;j++)
				{
					System.out.println((l+1)+" name "+classRoom[i].students[j].name+" score-- "+classRoom[i].students[j].total);
					l++;
				}
			}
   
	} 	

	
}
