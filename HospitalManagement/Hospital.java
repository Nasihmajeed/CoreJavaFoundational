public class Hospital
{
	
String hospitalName,hospitalPlace;

// Department Details 

Department department1;
Department departmentBu;
Department departmentFlo;

public void print()
{
department1.print();
departmentBu.print();
departmentFlo.print();
System.out.println(this.hospitalName + hospitalPlace);
}
}