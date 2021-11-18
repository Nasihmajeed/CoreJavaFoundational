public class Teacher {
	String name,subject;
	Scanner input = new Scanner(System.in);
	public void inputDetails() {
		System.out.println("Teacher = ");
		name = input.nextLine();
		subject = input.nextLine();
	}

	public void printDetails() {
        	System.out.println("Name of the teacher is " + this.name);
		System.out.println("Subject of the teacher is " + this.subject);
	}
}