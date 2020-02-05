package com.lxisoft.user;
public class Patient
{
	private String patientName;
	private String patientAdress;
	private String patientDisease;


	public void setPatientName(String name)
	{
		this.patientName = name;
	}
	public void setPatientAdress(String adress)
	{
		this.patientAdress = adress;
	}
	public void setPatientDisease(String disease)
	{
		this.patientDisease = disease;
	}
	public String getPatientName()
	{
		return patientName;
	}
	public String getPatientAdress()
	{
		return patientAdress;
	}
	public String getPatientDisease()
	{
		return patientDisease;
	}

}