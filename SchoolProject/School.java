import java.util.Scanner;
import java.util.ArrayList;
class School{
	int standard;
	public void schoolDetails(){
		System.out.println("******************************************");
		System.out.println("SEVA SADAN CENTRAL SCHOOL");
		System.out.println("PATHIRIPALA PALAKKAD");
		System.out.println("******************************************");
	Scanner sc= new Scanner(System.in);
	Scanner sn= new Scanner(System.in);
	ArrayList<String> student=new ArrayList<String>();
	
	System.out.print("ENTER THE STANDARD ");
	this.standard=sc.nextInt();
	System.out.print("ENTER STUDENT'S NAME");
	for (int i=0;i<3;i++){
		String x= sn.nextLine();
		student.add(x);
	}
	for (int i=0;i<3;i++){
		System.out.println(student.get(i));
	}
}
}