public class Department
{
private String departmentName,departmentBuilding,departmentFloornumber;

public void setDepartmentName(String departName){
	this.departmentName = departName;
}

public void setDepartmentBuilding(String departBuilding){
	this.departmentBuilding = departBuilding;
}

public void setDepartmentFloornumber(String departFloornumber){
	this.departmentFloornumber = departFloornumber;	
}

public String getDepartmentName (){
	return this.departmentName;
}

public String getDepartmentBuilding (){
	return this.departmentBuilding;
}	
public String getepartmentFloornumber (){
	return this.departmentFloornumber;
}
Ward ward;

public void print()
{
System.out.println(this.departmentName+"\n"+departmentBuilding+"\n"+departmentFloornumber);

ward.print();
}
}	
