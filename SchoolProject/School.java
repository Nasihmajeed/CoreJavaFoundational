public class School  {
	
	String name;
	String address;
	String phoneNo;
	ClassRoom classes[];

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
}