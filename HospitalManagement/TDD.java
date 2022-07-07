public class TDD
{
public static void main (String [] args)
{

Hospital sHospital = new Hospital();

// Hospital Details

sHospital.hospitalName = "HospitalName: Palakkad Hospital";
sHospital.hospitalPlace = "HospitalPlace: Palakkad Kerala";
	
//Department Details

Department departmentna=new Department();
departmentna.departmentName="Department1: AadvikBlock1";
Department departmentbuild=new Department();
departmentbuild.departmentBuilding="Department Building: AadvikBuilding1";
Department departmentfloor=new Department();
departmentfloor.departmentFloornumber="Department Floor Number: FirstFloor";

//Patients Details

Patients patientsNam=new Patients();
patientsNam.Patientname="Patients Name: Human";
Patients patientsag=new Patients();
patientsag.Patientage= "Patients Age: 25";

// Ward Details

Ward WardN=new Ward();
WardN.wardNumber="Ward Number: 0001";
Ward totalCapacty=new Ward();
totalCapacty.totalCapacity= "Ward Total Capacity 2500";

// Printing Section

sHospital.department1=departmentna;
sHospital.departmentBu=departmentbuild;
sHospital.departmentFlo=departmentfloor;

sHospital.Patientna=patientsNam;
sHospital.Patientag=patientsag;

sHospital.wardNum=WardN;
sHospital.totalCap=totalCapacty;

sHospital.print();

}
}