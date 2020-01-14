public class School
{
String name;
ClassRoom cl1,cl2;

void classCreat()
{
	ClassRoom cr1 =new ClassRoom();
	cr1.noStudent=45;
	cr1.teacher="Diviya";
	cl1=cr1;
	cl1.CreateStudent();
	ClassRoom cr2 =new ClassRoom();
	cr2.noStudent=55;
	cr2.teacher="kavaya";
	cl2=cr2;
	cl2.CreateStudent();
}

void printDetail()
{
	System.out.println("Name OF School"); 
	System.out.println(this.name);
	System.out.println("class 1\n");	
	cl1.printDetails();
	System.out.println("class 2\n");
	cl2.printDetails();
}
}