//Packages

package com.lxisoft.patient;

//Patient Class

public class Patient
{
private String patientName;
private int patientAge;

// Setter and Getter

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
//Print

public void print ()
{
System.out.println (this.patientName+"\n"+patientAge);
}
}