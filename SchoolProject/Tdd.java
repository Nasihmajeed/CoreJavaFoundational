public class Tdd
	{
		public static void main(String []args)
		{
			School s=new School();
			s.setSchoolDetails();
			s.getSchoolDetails();

			System.out.println("Rank List");
	        s.rankList();
		}
}