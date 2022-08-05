public class TDD
{
public static void main (String [] args)
{

//	New Department & Hospital Creation
Department departmentna=new Department();

Hospital sHospital = new Hospital();

//Patient Details

Ward ward = new Ward();
int number =5;
ward.patients = new Patient[5];

for (int i=0; i < ward.patients.length; i++){
	Patient patient = new Patient();
	patient.setPatientName("Male Patient "+(i+1));
	patient.setPatientAge(21 + (i+1));
	ward.patients[i]=patient;
	}

 // Ward Details

ward.setWardNumber("Ward Number: 0005");
ward.setTotalCapacity("Ward Total Capacity : 2500");
 
 // Department Details Printing

 // Hospital Details Printing

sHospital.department1=departmentna;

sHospital.setHospitalName("HospitalName: Palakkad Hospital");
sHospital.setHospitalPlace("HospitalPlace: Palakkad Kerala");
 
 //Department Details Printing
 
departmentna.ward=ward;
departmentna.setDepartmentName("Department1: AadvikBlock1");
departmentna.setDepartmentBuilding("Department Building: AadvikBuilding1");
departmentna.setDepartmentFloornumber("Department Floor Number: FirstFloor");		
sHospital.print();

}
}

