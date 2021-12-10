public class JeeQuestion implements TrueFalseQuestion,MultipleChoiceQuestion {
	public void trueOrFalse(){
	boolean answer1,answer2,answer3,answer4;

	System.out.println("\t\t    JEE Question Paper");
	System.out.println("\t\t -----------------------");
	System.out.println("Q1. The Great Wall of China is visible from space.");
	answer1 = false;
	System.out.println("Question Q1 is " +answer1);

    System.out.println("Q2. The Atlantic Ocean is the warmest in the world.");
	answer2 = false;
	System.out.println("Question Q2 is " +answer2);

	System.out.println("Q3. When the Eiffel Tower was unveiled, the Parisian art community hated it.");
	answer3 = true;
	System.out.println("Question Q3 is " +answer3);

	System.out.println("Q4. There are more ancient pyramids in Sudan than in Egypt.");
	answer4 = true;
	System.out.println("Question Q4 is " +answer4);
}
public void mltiChoiceQuestons(){
	String[] opt = new String[4];
	String[] qn = new String[4];
	for(int i = 1; i <= qn.length; i++){
		System.out.println("Question" +i);
		for(int j = 1; j <= opt.length; j++){
			System.out.println("Option" +j);
		}
	}
}
}