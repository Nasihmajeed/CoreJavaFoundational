package com.lxisoft.hospital;
public class Medicine
{
	private String medicineName;
	private int medicineQuantity;

	public void setMedicineName(String str)
	{	
		this.medicineName = str;
	}
	public String getMedicineName()
	{
		return medicineName;
	}
	public void setMedicineQuantity(int qty)
	{
		this.medicineQuantity = qty;
	}
	public void setMedicineQuantity()
	{
		return medicineQuantity;
	}
}