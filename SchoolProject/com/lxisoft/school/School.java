package com.lxisoft.school;
public class School {
    private String name;
	private String address;
	private String phoneNo;
	private Classrom classrom[];

	public void inputDetails() {
		name = "MUNDUR HIGHER SECONDARY SCHOOL";
		address = "KOOTTUPATHA,MUNDUR,PALAKKAD,Pin:678592";
		phoneNo ="6282390042";
	}

	public void printDetails() {
		System.out.println("School Name: " + name + "\nSchool Address: " + address + "\nPhone Number: " + phoneNo + "\n");
		for (int i = 0; i < classrom.length; i++) {
			classrom[i].printDetails();
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Classrom[] getClassrom() {
		return classrom;
	}

	public void setClassrom(Classrom[] classrom) {
		this.classrom = classrom;
	}
}
