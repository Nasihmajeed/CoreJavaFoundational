package com.lxisoft.hospital;
import java.util.*;
public class Medicine
{
	private String medicineName;
	private int medicineQuantity;
	private int medicineRate;

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
	public int getMedicineQuantity()
	{
		return medicineQuantity;
	}
	public void setMedicineRate(int rate)
	{
		this.medicineRate = rate;
	}
	public int getMedicineRate()
	{
		return medicineRate;
	}
	
	public ArrayList<Medicine> addMedicine(Medicine medicine,ArrayList<Medicine> medicineList)
	{
		medicineList.add(new Medicine());
		medicineList.get(0).setMedicineName("Paracetamol");
		medicineList.get(0).setMedicineQuantity(1000);
		medicineList.get(0).setMedicineRate(250);
		medicineList.add(new Medicine());
		medicineList.get(1).setMedicineName("Amoxillin");
		medicineList.get(1).setMedicineQuantity(100);
		medicineList.get(0).setMedicineRate(200);
		medicineList.add(new Medicine());
		medicineList.get(2).setMedicineName("adderall");
		medicineList.get(2).setMedicineQuantity(2000);
		medicineList.get(2).setMedicineRate(50);
		medicineList.add(new Medicine());
		medicineList.get(3).setMedicineName("Ativan");
		medicineList.get(3).setMedicineQuantity(100);
		medicineList.get(3).setMedicineRate(350);
		medicineList.add(new Medicine());
		medicineList.get(4).setMedicineName("Acetominophen");
		medicineList.get(4).setMedicineQuantity(1500);
		medicineList.get(4).setMedicineRate(450);
		return medicineList;
	}

	public void viewMedicine(Medicine medicine,ArrayList<Medicine> medicineList)
	{
			addMedicine(medicine,medicineList);
			System.out.println("\tID    MEDICINE    QUANTITY   COST(per/gram)");
			System.out.println("\t--------------------------------------------");
			for(int i=0;i<medicineList.size();i++)  
			{
				System.out.print("\t"+i);
				System.out.print("\t"+medicineList.get(i).getMedicineName()+"\t");
				System.out.print(medicineList.get(i).getMedicineQuantity()+"\t");
				System.out.print("  "+medicineList.get(i).getMedicineRate()+"\t");
				System.out.println(" ");
			}
	}		
}
