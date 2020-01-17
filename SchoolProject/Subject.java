import java.util.*;
public class Subject
{
String sbjt;
int m1;
float per;
Scanner input =new Scanner(System.in);
void SubjectCreat()
{
		System.out.println("Subject Name =");
		sbjt=input.next();
		System.out.println("Mark = ");
		m1=input.nextInt();

		
}
   void SubjectDisplay()
	{ 
		System.out.println(sbjt+" = "+m1);
		sbjt=input.next();
		
	}
}