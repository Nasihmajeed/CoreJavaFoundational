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
Hospital sHospital = new Hospital();

//Patient Details

List<Patient> patients = new ArrayList<Patient>();
Ward ward = new Ward();
ward.setPatients(patients);

for (int i=0; i < 10; i++){
	Patient patient = new Patient();
	patient.setPatientName("Male Patient "+(i+1));
	patient.setPatientAge(21 + (i+1));
	patients.add(patient);
	}

// Ward Details

ward.setWardNumber("Ward Number: 0005");
ward.setTotalCapacity("Ward Total Capacity : 2500");
 
// Pinting

sHospital.setDepartments(departmentna);

sHospital.setHospitalName("HospitalName: Palakkad Hospital");
sHospital.setHospitalPlace("HospitalPlace: Palakkad Kerala");
 
departmentna.setWards(ward);
departmentna.setDepartmentName("Department1: AadvikBlock1");
departmentna.setDepartmentBuilding("Department Building: AadvikBuilding1");
departmentna.setDepartmentFloornumber("Department Floor Number: FirstFloor");		
sHospital.print();

}
}

