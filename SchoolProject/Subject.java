import java.util.*;
public class Subject
{
String sbjt;
int mark;
static Scanner input =new Scanner(System.in);
void SubjectCreat()
{
		System.out.println("Subject Name =");
		sbjt=input.next();
		System.out.println("Mark = ");
		mark=input.nextInt();

		
}
   void SubjectDisplay()
	{ 
		
		System.out.println(">"+sbjt+"\t= "+mark);
		
	}
}