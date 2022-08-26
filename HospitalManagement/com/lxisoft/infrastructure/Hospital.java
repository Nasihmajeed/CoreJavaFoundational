//Packages

package com.lxisoft.infrastructure;
import com.lxisoft.infrastructure.Department;

public class Hospital
{
	
// Department Details 

private Department department1;
	
private String hospitalName,hospitalPlace;

public void setHospitalName(String hospitName){
	this.hospitalName = hospitName;
}

public void setHospitalPlace(String hospitPlace){
	this.hospitalPlace = hospitPlace;
}

public void setDepartments(Department department2){
	this.department1 = department2;
}

public String getHospitalName (){
	return this.hospitalName;
}

public String getHospitalPlace (){
	return this.hospitalPlace;
}	

public Department getDepartments (){
	return this.department1;
}	

//Printing Details

public void print()
{
System.out.println(this.hospitalName+"\n"+this.hospitalPlace);
department1.print();
}
}