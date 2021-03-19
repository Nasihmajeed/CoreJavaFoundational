import java.util.Scanner;
class Marks{
		float maths,science,english,total;
	public float Total(){
		total=maths+science+english;
		
		return total;
	}
		public float English(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER MARKS	IN ENGLISH :");
		float english = sc.nextFloat();
		
		return english;
	}
	public float Maths(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER MARKS	IN MATHS :");
		float maths = sc.nextFloat();
		
		return maths;
	}
	public float Science(){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER MARKS	IN SCIENCE :");
		float science = sc.nextFloat();
		return science;
	}
	

}