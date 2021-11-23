public class TD {

	public static void main(String[] args) {
		School s = new School();
		for (int i = 0; i < 3; i++) {
			ClassRoom c = new ClassRoom();
			s.c[i] = c;
		Teacher t = new Teacher();
		c.teacher[i] = t;
		}
		s.inputDetails();
		s.printDetails();
		

	}

}