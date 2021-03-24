import java.util.Scanner;
class Student{
	String StudentName;
	
	public String Input(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER STUDENT NAME :");
		String StudentName= sc.nextLine();
		
		return StudentName;
	}
	
		
	}
