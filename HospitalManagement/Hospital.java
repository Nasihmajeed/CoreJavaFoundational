public class Hospital
{
	
private String hospitalName,hospitalPlace;

public void setHospitalName(String hospitName){
	this.hospitalName = hospitName;
}

public void setHospitalPlace(String hospitPlace){
	this.hospitalPlace = hospitPlace;
}

public String getHospitalName (){
	return this.hospitalName;
}

public String getHospitalPlace (){
	return this.hospitalPlace;
}	

// Department Details 
Department department1;
 
public void print()
{
System.out.println(this.hospitalName+"\n"+this.hospitalPlace);
department1.print();
}
}