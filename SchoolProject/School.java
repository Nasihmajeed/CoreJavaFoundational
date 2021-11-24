public class School {
	String name;
	String address;
	String phoneNo;
	ClassRoom classRooms[];

	public void inputDetails() {
		name = "MHSS SCHOOL";
		address = "KANJIRAPUZHA,KANJIRAPUZHA,PALAKKAD,678507";
		phoneNo = "9878685848";
	}

	public void printDetails() {
		System.out.println("School Name: " + name + "\nSchool Address: " + address + "\nPhone Number: " + phoneNo + "\n");
		for (int i = 0; i < classRooms.length; i++) {
			classRooms[i].printDetails();
		}
	}
}