public class School  {
	
	private String name;
	private String address;
	private String phoneNo;
	private ClassRoom classes[];

	public void inputDetails() {
		name = "MUNDUR HIGHER SECONDARY SCHOOL";
		address = "KOOTTUPATHA,MUNDUR,PALAKKAD,Pin:678590";
		phoneNo ="9806754785";
	}

	public void printDetails() {
		System.out.println("School Name: " + name + "\nSchool Address: " + address + "\nPhone Number: " + phoneNo + "\n");
		for (int i = 0; i < classes.length; i++) {
			classes[i].printDetails();
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

	public ClassRoom[] getClasses() {
		return classes;
	}

	public void setClasses(ClassRoom[] classes) {
		this.classes = classes;
	}
}