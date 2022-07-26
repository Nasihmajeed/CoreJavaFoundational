public class TDD
{
public static void main (String [] args)
{

Department departmentna=new Department();

//Ward PatientDetail=new Ward();

Patient patient =new Patient();
Patient patient1 =new Patient();

Hospital sHospital = new Hospital();

Ward ward = new Ward();


//Department Details
departmentna.ward=ward;
departmentna.departmentName="Department1: AadvikBlock1";
departmentna.departmentBuilding="Department Building: AadvikBuilding1";
departmentna.departmentFloornumber="Department Floor Number: FirstFloor";

//Patient Details

ward.patient=patient;
patient.PatientName="Male1";
patient.PatientAge="25";

ward.patient1=patient1;
patient1.PatientName="Male2";
patient1.PatientAge="35";

/* ward.patient=patient;
patient.PatientName="Male3";
patient.PatientAge="45";

ward.patient=patient;
patient.PatientName="FeMale1";
patient.PatientAge="25";

ward.patient=patient;
patient.PatientName="FeMale2";
patient.PatientAge="35";

ward.patient=patient;
patient.PatientName="FeMale1";
patient.PatientAge="45"; */

// Ward Details

ward.wardNumber="Ward Number: 0005";
ward.totalCapacity="Ward Total Capacity 2500";

// Printing 

// Department details Printing

sHospital.department1=departmentna;

//Patient Details Printing

//ward.patient=patient;
//ward.patient=patient1;

// Hospital Details

sHospital.hospitalName = "HospitalName: Palakkad Hospital";
sHospital.hospitalPlace = "HospitalPlace: Palakkad Kerala";

sHospital.print();
//patient.print();
//ward.print();
}
}