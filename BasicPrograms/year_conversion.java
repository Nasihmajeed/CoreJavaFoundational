package practice;

import java.util.Scanner;

public class YearConversion {

	public static void main(String[] args) {
		System.out.println("Enter Year");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("Select the mode of conversion");
		System.out.println("1. Minutes");
		System.out.println("2. Hours");
		System.out.println("3. Days");
		System.out.println("4. Months");
		System.out.println("5. Seconds");
		int mode = scanner.nextInt();
		switch (mode) {
	    case 1:
	      int minutes = year * 365 * 24 * 60;
	     System.out.println(year + " year is " + minutes + " minutes");
	      break;
	    case 2:
	      int hours = year * 365 * 24;
	      System.out.println(year + " year is " + hours + " hours");
	      break;
	    case 3:
	      int days = year * 365;
	      System.out.println(year + " year is " + days + " days");
	      break;
	    case 4:
	      int months = year * 12;
	      System.out.println(year + " year is " + months + " months");
	      break;
	    case 5:
	      int seconds = year * 365 * 24 * 60 * 60;
	      System.out.println(year + " year is " + seconds + " seconds");
	      break;
	    default:
	    	System.out.println("Invalid Option");
	  }
		
	}

}
