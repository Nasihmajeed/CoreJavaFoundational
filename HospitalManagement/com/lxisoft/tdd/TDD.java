//Packages

package com.lxisoft.tdd;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.infrastructure.Ward;
import com.lxisoft.infrastructure.Department;
import com.lxisoft.infrastructure.Hospital;
import com.lxisoft.patient.Patient;

//TDD Class

public class TDD
{
public static void main (String [] args)
{

//	New Department & Hospital Creation

Department departmentna=new Department();
Department ndepartment=new Department();
Hospital sHospital = new Hospital();
Hospital nHospital = new Hospital();

//Patient Details 

List<Patient> patients = new ArrayList<Patient>();
Ward ward = new Ward();
Ward nward = new Ward();
ward.setPatients(patients);
nward.setPatients(patients);

for (int i=0; i < 10; i++){
	Patient patient = new Patient();
	patient.setPatientName("Male Patient "+(i+1));
	patient.setPatientAge(21 + (i+1));
	patients.add(patient);
	}
	
// Ward Details

ward.setWardNumber("Ward Number: 0001");
ward.setTotalCapacity("Ward Total Capacity : 2500");

// NewWard Details

nward.setWardNumber("New Ward Number: 0001");
nward.setTotalCapacity("New Ward Total Capacity : 5000");
 
// Pinting

sHospital.setDepartments(departmentna);

nHospital.setDepartments(ndepartment);

sHospital.setHospitalName("HospitalName: Aadvik Hospital");
sHospital.setHospitalPlace("HospitalPlace: Palakkad Kerala");

nHospital.setHospitalName("HospitalName: Aadvik Hospital");
nHospital.setHospitalPlace("HospitalPlace: Mannarkkad Kerala");
 
departmentna.setWards(ward);
departmentna.setDepartmentName("Department1: Aadvik Block");
departmentna.setDepartmentBuilding("Department Building: Aadvik Building");
departmentna.setDepartmentFloornumber("Department Floor Number: Aadvik Building - FirstFloor");		
sHospital.print();

ndepartment.setWards(nward);
ndepartment.setDepartmentName("NewDepartment1: New Aadvik Block");
ndepartment.setDepartmentBuilding("NewDepartment Building: New Aadvik Building");
ndepartment.setDepartmentFloornumber("NewDepartment Floor Number: New Aadvik Building - FirstFloor");		
nHospital.print();

}
}

