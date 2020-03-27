import java.util.*;
public class Subject
{
	String subName;
	int subMark;
	
	void setSubjectDetails()
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter Subject Name : ");
		subName = in.nextLine(); 
		System.out.println("Enter "+ subName  +" Mark : ");
		subMark = in.nextInt();
		in.nextLine();
	}
	void printSubject()
	{
		System.out.println(this.subName +"\t\t"+this.subMark+"\n");

	}

}