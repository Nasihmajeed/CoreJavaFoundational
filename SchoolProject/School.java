public class School
{
String name;
ClassRoom cl1,cl2;

void classCreat()
{
	ClassRoom cr1 =new ClassRoom();
	cr1.noStudent=45;
	cl1=cr1;
	cl1.CreateStudent();
	cl1.CreateTeacher();
	System.out.println("\n 2ndclass \n");
	ClassRoom cr2 =new ClassRoom();
	cr2.noStudent=55;
	cl2=cr2;
	cl2.CreateStudent();
	cl2.CreateTeacher();
}

void printDetail()
{
	System.out.println("Name OF School"+this.name); 
	System.out.println("\nclass 1\n");	
	cl1.printDetails();
	System.out.println("\nclass 2\n");
	cl2.printDetails();
}
}