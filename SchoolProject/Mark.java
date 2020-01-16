import java.util.*;
public class Mark
{
Scanner sc = new Scanner(System.in);
float m1,m2,m3,totalMark=0;
float average;

	void mark()
	{
		System.out.println("Mark 1 :");
		m1 = sc.nextInt();
		System.out.println("Mark 2 :");
		m2 = sc.nextInt();
		System.out.println("Mark 3 :");
		m3 = sc.nextInt();
		totalMark = m1+m2+m3;
		average = (totalMark/300)*100;
		

	}

	void printMark()
	{
		System.out.println("Total mark ="+this.totalMark);
		System.out.println("Average ="+this.average);
	}	
}