public class Teacher {
	String name;
	String subject;
	String phoneNo;

	public Teacher(String name, String subject, String phoneNo) {
		this.name = name;
		this.subject = subject;
		this.phoneNo = phoneNo;
	}

	public void printDetails() {
		System.out.println("Teacher Name: " + name + "\nSubject: " + subject + "\nPhone Number: " + phoneNo);
	}

}