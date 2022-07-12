public class Ward
{

// Ward Details	
String wardNumber, totalCapacity;

// Patient Details
Patient MalePatient1;
Patient MalePatient1Age;
Patient MalePatient2;
Patient MalePatient2Age;
Patient MalePatient3;
Patient MalePatient3Age;
Patient FemalePatient1;
Patient FemalePatient1Age;
Patient FemalePatient2;
Patient FemalePatient2Age;
Patient FemalePatient3;
Patient FemalePatient3Age;

// Priting Details

public void print  ()
{
MalePatient1.print();
MalePatient1Age.print();
MalePatient2.print();
MalePatient2Age.print();
MalePatient3.print();
MalePatient3Age.print();
FemalePatient1.print();
FemalePatient1Age.print();
FemalePatient2.print();
FemalePatient2Age.print();
FemalePatient3.print();
FemalePatient3Age.print();
System.out.println (this.wardNumber);
System.out.println(this.totalCapacity);
}
}