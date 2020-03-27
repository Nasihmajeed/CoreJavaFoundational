public class Student
{
	String studName;
	int rollNum;
	int total;
	int numOfSub=3;
	Subject[] sub = new Subject[numOfSub];
	public Student(String name,int no)
	{
		this.studName=name;
		this.rollNum=no;
	}
	public void setSubject()
	{
		for(int i=0;i<numOfSub;i++)
		{
			sub[i] = new Subject();
		}
		sub[0].subName="Physics";
		sub[0].subMark=15;
		sub[1].subName="Chemistry";
		sub[1].subMark=10;
		sub[2].subName="Malayalam";
		sub[2].subMark=25;
		setTotalMark();
	}
	
	public void setTotalMark()
	{
		for(int i=0;i<numOfSub;i++)
		{
			this.total=this.total+sub[i].subMark;
		}
	  
	}
	
	void printStudentDetails()
	{
		
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Roll Number : "+this.rollNum);	
		System.out.println("Total Mark = "+ this.total);
		
		
	}
}