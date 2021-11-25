

public class School {
	private String name;
	private String address;
	private long phoneNo;
	private ClassRoom classRooms[];

	public void inputDetails() {
		name = "LXI SCHOOL";
		address = "GANDHI SEVA BHAVAN,PATHIRIPALA,PALAKKAD,678507";
		phoneNo = 9876543210l;
	}

	public void printDetails() {
		System.out.println("School Name: " + name + "\nSchool Address: " + address + "\nPhone Number: " + phoneNo + "\n");
		for (int i = 0; i < classRooms.length; i++) {
			classRooms[i].printDetails();
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

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public ClassRoom[] getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(ClassRoom[] classRooms) {
		this.classRooms = classRooms;
	}
}
