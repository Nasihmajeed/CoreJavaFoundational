public class Department
{
String departmentName,departmentBuilding,departmentFloornumber;

Ward ward;

public void print()
{
System.out.println(departmentName+"\n"+departmentBuilding+"\n"+departmentFloornumber);
ward.print();
}
}	