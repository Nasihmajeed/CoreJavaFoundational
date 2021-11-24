public class TDD {

	public static void main(String[] args) {
		School school = new School();
		school.classRooms = new ClassRoom[3];

		Student[] students = new Student[3];
		students[0] = new Student("sanil", 1,"15");
		students[1] = new Student("sarangi", 2 ,"15");
		students[2] = new Student("nishad", 3 , "15");
		Teacher classTeacher = new Teacher("Shabana", "Maths", "9089786775");
		school.classRooms[0] = new ClassRoom(60, "10 TH", "A", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("mubashir", 1,"15");
		students[1] = new Student("gokul", 2,"15");
		students[2] = new Student("appukuttan", 3,"15");
		students[3] = new Student("mahesh", 4,"15");
		classTeacher = new Teacher("Sujith", "Malayalam", "9104567382");
		school.classRooms[1] = new ClassRoom(25, "10 TH", "B", students, classTeacher);

		students = new Student[4];
		students[0] = new Student("sai krishna", 1,"15");
		students[1] = new Student("sreejith", 2,"15");
		students[2] = new Student("Sneha", 3,"15");
		students[3] = new Student("sourav", 4,"15");
		classTeacher = new Teacher("Maya", "ComputerScience", "9272823646");
		school.classRooms[2] = new ClassRoom(30, "10 TH", "C", students, classTeacher);

		school.inputDetails();
		school.printDetails();

	}
}