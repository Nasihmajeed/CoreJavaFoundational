public class TDD  {
 	public static void main(String[] args) {

		System.out.println("Welcome To The Movie");
		System.out.println("-----------------------------------------------------");

		Movie movie=new Movie();
		movie.inputDetails();
		movie.printDetails();

		System.out.println("****************************************************");
		
     	Hero hero = new Hero();
        hero.inputDetails();
		hero.printDetails();
		
		System.out.println("****************************************************");
		
		Heroine heroine = new Heroine();
		heroine.inputDetails();
		heroine.printDetails();

		System.out.println("****************************************************");

		Comedian comedian = new Comedian();
		comedian.inputDetails();
		comedian.printDetails();



} 
} 

	
	
	