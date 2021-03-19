import java.util.Scanner;
class Teacher{
	String TeacherName;
	public String teacherName(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER TEACHER'S NAME :");
		String TeacherName= sc.nextLine();
		
		return TeacherName;
}
}