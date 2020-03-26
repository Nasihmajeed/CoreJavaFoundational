public class Student
{
	String studName;
	int rollNum, mark1, mark2, mark3;
	int total;
	public Student(String name, int roll,int m1, int m2, int m3)
	{
		this.studName=name;
		this.rollNum=roll;
		this.mark1=m1;
		this.mark2=m2;
		this.mark3=m3;
	}
	public void totalMark()
	{
		this.total=this.mark1+this.mark2+this.mark3;
	}
	  
}