public class Teacher {
	String name,subject;
	public void inputDetails() {
		name = input.nextLine();
		subject = input.nextLine();
	}

	public void printDetails() {
        	System.out.println("Name of the teacher is " + this.name);
		System.out.println("Subject of the teacher is " + this.subject);
	}
}