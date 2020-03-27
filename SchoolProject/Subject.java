import java.util.*;
public class Subject
{
	String subName;
	int subMark;
	
	void setSubjectDetails()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Subject Name : ");
		subName = sc.nextLine(); 
		System.out.println("Enter "+ subName  +" Mark : ");
		subMark = sc.nextInt();
		sc.nextLine();
	}
	void printSubject()
	{
		System.out.println(this.subName +"\t"+this.subMark+"\n");

	}

}