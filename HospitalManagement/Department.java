public class Department
{
String departmentName,departmentBuilding,departmentFloornumber;

Ward ward;

public void print()
{
System.out.println(this.departmentName+departmentBuilding+departmentFloornumber);
ward.print();
}
}