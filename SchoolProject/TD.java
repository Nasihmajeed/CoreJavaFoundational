public class TD {
	        public static void main(String[] args) {
		School school = new School();
		school.classes = new ClassRoom[3];

		Student[] students = new Student[3];
		students[0] = new Student("Sonu", 1);
		students[1] = new Student("Gokul", 2);
		students[2] = new Student("Praveen", 3);
		Teacher classTeacher = new Teacher("Shabna", "English", "8946345677");
		school.classes[0] = new ClassRoom(40, "PLUS ONE", "C1", students, classTeacher);

		students = new Student[3];
		students[0] = new Student("Rahul", 1);
		students[1] = new Student("Ajay", 2);
		students[2] = new Student("Sreya", 3);
		
		classTeacher = new Teacher("Sahadh", "Financial Accounting", "8964678534");
		school.classes[1] = new ClassRoom(40, "PLUS ONE", "C2", students, classTeacher);

		students = new Student[3];
		students[0] = new Student("Renjith", 1);
		students[1] = new Student("Ramadas", 2);
		students[2] = new Student("Jyothi", 3);
		
		classTeacher = new Teacher("Rafeeq", "Maths", "8975864367");
		school.classes[2] = new ClassRoom(30, "PLUS ONE", "C3", students, classTeacher);

		school.inputDetails();
		school.printDetails();

	}
}