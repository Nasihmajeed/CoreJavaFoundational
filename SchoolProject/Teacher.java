

public class Teacher {
	private String name;
	private String subject;
	private long phoneNo;

	public Teacher(String name, String subject, long phoneNo) {
		this.name = name;
		this.subject = subject;
		this.phoneNo = phoneNo;
	}

	public void printDetails() {
		System.out.println("Teacher Name: " + name + "\nSubject: " + subject + "\nPhone Number: " + phoneNo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}