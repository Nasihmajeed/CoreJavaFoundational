//Packages

package com.lxisoft.infrastructure;

//Department Class

public class Department
{
	
private Ward ward;
private String departmentName,departmentBuilding,departmentFloornumber;

//Setter and Getter

public void setDepartmentName(String departName){
	this.departmentName = departName;
}

public void setDepartmentBuilding(String departBuilding){
	this.departmentBuilding = departBuilding;
}

public void setDepartmentFloornumber(String departFloornumber){
	this.departmentFloornumber = departFloornumber;	
}

public void setWards(Ward war){
	this.ward = war;	
}

public String getDepartmentName (){
	return this.departmentName;
}

public String getDepartmentBuilding (){
	return this.departmentBuilding;
}	
public Ward getWards(){
	return this.ward;
}

//Printing Details

public void print()
{
System.out.println(this.departmentName+"\n"+departmentBuilding+"\n"+departmentFloornumber);

ward.print();
}
}	
