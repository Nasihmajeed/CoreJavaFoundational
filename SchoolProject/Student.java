import java.util.Scanner;
import java.util.ArrayList;
class Student{
	

	String studentName;
	public void studentDetails(ArrayList<Student> student){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER STUDENT NAME :");
		this.studentName= sc.nextLine();
		System.out.println("STUDENT NAME :"+studentName);
	
	}
}