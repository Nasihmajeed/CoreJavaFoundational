import java.util.*;
public class Student
{
	String studName;
	int rollNum;
	int total;
	int numOfSub;
	float percentage;
	String result;
	Subject[] sub;

	
	
	public void setStudentDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Student Name : ");
		studName=in.nextLine();
		System.out.println("Student Roll number : ");
		rollNum=in.nextInt();
		in.nextLine();
		System.out.println("Number of subject = ");	
		numOfSub=in.nextInt();
		in.nextLine();
		sub = new Subject[numOfSub];
		for(int i=0;i<numOfSub;i++)
		{
			sub[i] = new Subject();
			sub[i].setSubjectDetails();
		}
	}
	
	
	
	public void setTotalMark()
	{
		for(int i=0;i<numOfSub;i++)
		{
			this.total=this.total+sub[i].subMark;	
		}
		this.percentage=(float)(this.total/50.00)*100;
		if(this.percentage>=45)
		{
			result="PASS";
		}
		else
		{
			result="FAIL";
		}
	  
	}
	
	void printStudentDetails()
	{
		setTotalMark();
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(this.studName+"\t"+this.rollNum+"\t"+this.total+"\t"+this.percentage+"\t"+this.result+"\n");
		
		
		
		
		
	}
	void printSubjectDetails()
	{
		
		for(int i=0;i<sub.length;i++)
		{
			System.out.println(this.studName+"\t\t" + sub[i].subName +"\t\t"+ sub[i].subMark );
		}
		
	}
}