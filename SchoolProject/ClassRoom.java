import java.util.Scanner;
public class ClassRoom
{
    Scanner s=new Scanner(System.in);
     int std[] = new int[5];
      int i;
        for(i=0; i<5; i++) 
        { 
           System.out.print("Entername of the student"+(i+1)+":");
           std[i] = s.nextLine();
}
s.close();
 System.out.print(" The student name is: "+i);