// Packages 

package com.lxisoft.infrastructure;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.patient.Patient;

// Ward Class 

public class Ward
{

private List<Patient> patients = new ArrayList<>();
private String wardNumber, totalCapacity;

// Setter and Getter

public void setWardNumber(String warNumber){
	this.wardNumber = warNumber;
}

public void setTotalCapacity(String totCapacity){
	this.totalCapacity = totCapacity;
}

public String getWardNumber (){
	return this.wardNumber;
}

public String getTotalCapacity (){
	return this.totalCapacity;
}	

public void setPatients(List<Patient> patien){
	this.patients = patien;
}

public List<Patient> getPatients (){
	return patients;
}

// Priting Details

public void print ()
{
	
for (int i=0; i < patients.size(); i++){
	patients.get(i).print();	
 }
System.out.println (this.wardNumber);
System.out.println(this.totalCapacity);

}
}