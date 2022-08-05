public class Patient
{
//String PatientName,PatientAge;
private String patientName;
private int patientAge;

public void setPatientName(String patName){
	this.patientName = patName;
}

public void setPatientAge(int patAge){
	this.patientAge = patAge;
}

public String getPatientName (){
	return this.patientName;
}

public int getPatientAge (){
	return this.patientAge;
}	

public void print ()
{
System.out.println (this.patientName+"\n"+patientAge);
}
}