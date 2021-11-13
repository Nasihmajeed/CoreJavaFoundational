import java.util.Scanner;

public class Togglecase {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	 System.out.print("Enter a String : ");
	 String A = sc.nextLine();
	 String A1 = "";
	 for (int i = 0; i < A.length(); i++) {
		if(Character.isUpperCase(A.charAt(i))) 
			A1=A1+Character.toLowerCase(A.charAt(i));
		else 
			 A1=A1+Character.toUpperCase(A.charAt(i));
	}
	System.out.println("Toggle String is : "+A1);
	 
  }
	
}
