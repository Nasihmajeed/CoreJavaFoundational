public class TDD
{
public static void main (String [] args)
{

Department departmentna=new Department();

Patient patient1 =new Patient();
Patient patient2 =new Patient();
Patient patient3 =new Patient();
Patient patient4 =new Patient();
Patient patient5 =new Patient();
Patient patient6 =new Patient();

Hospital sHospital = new Hospital();

Ward ward = new Ward();


//Department Details
departmentna.ward=ward;
departmentna.departmentName="Department1: AadvikBlock1";
departmentna.departmentBuilding="Department Building: AadvikBuilding1";
departmentna.departmentFloornumber="Department Floor Number: FirstFloor";

//Patient Details

ward.patient1=patient1;
patient1.PatientName="Male1";
patient1.PatientAge="25";

ward.patient2=patient2;
patient2.PatientName="Male2";
patient2.PatientAge="35";

ward.patient3=patient3;
patient3.PatientName="Male3";
patient3.PatientAge="45";

ward.patient4=patient4;
patient4.PatientName="FeMale1";
patient4.PatientAge="25";

ward.patient5=patient5;
patient5.PatientName="FeMale2";
patient5.PatientAge="35";

ward.patient6=patient6;
patient6.PatientName="FeMale1";
patient6.PatientAge="45"; 

// Ward Details

ward.wardNumber="Ward Number: 0005";
ward.totalCapacity="Ward Total Capacity : 2500";

// Printing 

// Department details Printing

sHospital.department1=departmentna;

// Hospital Details

sHospital.hospitalName = "HospitalName: Palakkad Hospital";
sHospital.hospitalPlace = "HospitalPlace: Palakkad Kerala";

sHospital.print();

}
}