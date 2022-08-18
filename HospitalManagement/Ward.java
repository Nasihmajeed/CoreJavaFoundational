public class Ward
{

// Ward Details	
private String wardNumber, totalCapacity;

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

// Patient Details

private Patient[] patients;

public void setPatients(Patient[] patien){
	this.patients = patien;
}

public Patient[] getPatients (){
	return this.patients;
}

// Priting Details

public void print  ()
{
	
for (int i=0; i < this.patients.length; i++){
 		System.out.println(this.patients[i].getPatientName());
		System.out.println(this.patients[i].getPatientAge()); 
		System.out.println(this.patients); 
		
 }
System.out.println (this.wardNumber);
System.out.println(this.totalCapacity);

}
}