public class Hospital
{
	
String hospitalName;
String hospitalPlace;
// Department Details 
Department department1;
Department departmentBu;
Department departmentFlo;

// Patients Details

Patients Patientna;
Patients Patientag;

// Ward Details
Ward wardNum;
Ward totalCap;

public void print()
{
department1.print();
departmentBu.print();
departmentFlo.print();
Patientna.print();
Patientag.print();
wardNum.print();
totalCap.print();
System.out.println(hospitalName);
System.out.println(hospitalPlace);
}
}