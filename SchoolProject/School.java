import java.util.*;
public class School
{
	Scanner scanner=new Scanner(System.in);
	String name;
	int code,num;
	Classroom classRoom=new Classroom();
	public void setDetails()
	{
		System.out.println("Enter the school name : ");
		name=scanner.next();
		System.out.println("Enter the school code : ");
		code=scanner.nextInt();
		getDetails();
		setBatch();
		classRoom.setDetails(num);
		/*classRoom.setDetails();*/

	}
	public void getDetails()
	{
		System.out.println("School name is "+name);
		System.out.println("School code is "+code);
		/*classRoom.getDetails();*/
		/*classRoom.sort();*/
	}
	void setBatch()
	{
		System.out.println("Enter the batch: ");
		classRoom.name=scanner.next();
		System.out.println("Enter the no.of students");
		classRoom.num=scanner.nextInt();
        num = classRoom.num;
	}

}