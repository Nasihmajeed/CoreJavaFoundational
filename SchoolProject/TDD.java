class Tdd
{
public static void main(String args[])
	{
	 School s1=new School();
		s1.name ="ABCD";
		ClassRoom cr1 =new ClassRoom();
		cr1.noStudent=45;
		cr1.teacher="Diviya";
		s1.cl1=cr1;
		ClassRoom cr2 =new ClassRoom();
		cr2.noStudent=55;
		cr2.teacher="kavaya";
		s1.cl2=cr2;
		System.out.println(s1.name);  
		System.out.println(s1.cl1.noStudent);
		System.out.println(s1.cl1.teacher);
		System.out.println(s1.cl2.noStudent);
		System.out.println(s1.cl2.teacher);
	}
}
