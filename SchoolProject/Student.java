public class Student {
	private String name;
	private int rollNo;
	private String address;

	public Student(String name, int rollNo, String address) {
		this.name = name;
		this.rollNo = rollNo;
		this.address=address;
	}

	public void printDetails() {
		System.out.println("Student Name: " + name + "\nRoll Number: " + rollNo + "\nAddress: " + address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}