 import java.util.Scanner;
 public class Subject
 {
	public String subName;
	 public int score;
	 
	
	public void scan()
	{
	  Scanner input =new Scanner(System.in);
      System.out.println("enter the subject");
      subName= input.nextLine();
	  
      System.out.println("enter the score");
	  score=input.nextInt();
	}
	public void print()
	{
		System.out.println("\n SUBJECT : "+subName);
		System.out.println("\n Score :"+score);
	}
 }