public class TDD
{
public static void main (String [] args)
{

Hospital sHospital = new Hospital();

Ward patientDetails = new Ward();

//Department Details

Department departmentna=new Department();
departmentna.departmentName="Department1: AadvikBlock1";
Department departmentbuild=new Department();
departmentbuild.departmentBuilding="Department Building: AadvikBuilding1";
Department departmentfloor=new Department();
departmentfloor.departmentFloornumber="Department Floor Number: FirstFloor";

//Patient Details

Patient Patient1=new Patient();
Patient1.Patientname="PatientName: Male 1";

Patient Age1=new Patient();
Age1.Patientage="Male 1: 61";

Patient Patient2=new Patient();
Patient2.Patientname="PatientName: Male 2";

Patient Age2=new Patient();
Age2.Patientage="Male 2: 62";

Patient Patient3=new Patient();
Patient3.Patientname="PatientName: Male 3";

Patient Age3=new Patient();
Age3.Patientage="Male 3: 63";

Patient Patient4=new Patient();
Patient4.Patientname="PatientName: Female 1";

Patient Age4=new Patient();
Age4.Patientage="Female 1: 61";

Patient Patient5=new Patient();
Patient5.Patientname="PatientName: Female 2";

Patient Age5=new Patient();
Age5.Patientage="Female 2: 62";

Patient Patient6=new Patient();
Patient6.Patientname="PatientName: Female3";

Patient Age6=new Patient();
Age6.Patientage="Female 3: 63";

// Ward Details

patientDetails.wardNumber="Ward Number: 0005";
patientDetails.totalCapacity="Ward Total Capacity 2500";

// Printing 

// Department details Printing

sHospital.department1=departmentna;
sHospital.departmentBu=departmentbuild;
sHospital.departmentFlo=departmentfloor;

//Patient Details Printing

patientDetails.MalePatient1=Patient1;
patientDetails.MalePatient1Age=Age1;
patientDetails.MalePatient2=Patient2;
patientDetails.MalePatient2Age=Age2;
patientDetails.MalePatient3=Patient3;
patientDetails.MalePatient3Age=Age3;
patientDetails.FemalePatient1=Patient4;
patientDetails.FemalePatient1Age=Age4;
patientDetails.FemalePatient2=Patient5;
patientDetails.FemalePatient2Age=Age5;
patientDetails.FemalePatient3=Patient6;
patientDetails.FemalePatient3Age=Age6;

// Hospital Details

sHospital.hospitalName = "HospitalName: Palakkad Hospital";
sHospital.hospitalPlace = "HospitalPlace: Palakkad Kerala";

sHospital.print();
patientDetails.print();
}
}