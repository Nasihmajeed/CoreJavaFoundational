import java.util.Scanner;
class User{
	Food f=new Food();
	
	Scanner sc=new Scanner(System.in);
	String userName;
	public void userDetails(){
		System.out.println("ENTER USER NAME ");
		userName=sc.nextLine();
		f.menuList();
	}
}