 import java.util.Scanner;

public class Toggle  {

public static void main (String [] args)  {

Scanner sc = new Scanner(System.in);

System.out.print("TOGGLE CASE");
System.out.println("Enter The Word:");
String word  = sc.nextLine ();

for(int i = 0; i<word.length; i++)  {

if(word(i).toUpperCase()==word(i))  {
System.out.println(word(i).toLowerCase());  
}

else  {
System.out.println(word(i).toUpperCase());
}
}
}
}