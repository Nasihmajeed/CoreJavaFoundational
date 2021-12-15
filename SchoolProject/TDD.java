
import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {
	



School sc = new School ("AHSS Kothakurussi","p.o Panamanna,Palakkad,Kerala,Pin-679501","123456789");


for(int i = 1; i < 4; i++)  {
ClassRoom cl = new ClassRoom ("Standard" + i, "Division" + i,"Seats3");
sc.cr[i] = cl;



Teacher tr = new Teacher("Teacher" + i,"Subject" + i, "PhoneNo." + i);
cl.setTc  (tr);

for(int j = 1; j < 4; j++)  {
	
Students ss = new Students("Student"+j,"Age"+j,"RollNo"+j,"Mark"+j);
tr.st[j] =ss;

}
}


sc.printDetails();

}


}