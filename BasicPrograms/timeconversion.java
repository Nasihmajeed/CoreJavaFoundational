package practice;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println("Enter Time in minutes: ");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		  System.out.println("Select the mode of conversion");
		  System.out.println("1. Hours");
		  System.out.println("2. Minutes");
		  System.out.println("3. Seconds");

		  Scanner s = new Scanner(System.in);
		  int mode = s.nextInt();
		  switch (mode) {
		    case 1:
		      double hours = time / 60;
		      System.out.println(time + " minutes is " + hours + " hours");
		      break;
		    case 2:
		    	System.out.println(time + " minutes");
		      break;
		    case 3:
		      int seconds = time * 60;
		      System.out.println(time + " minutes is "+ seconds + " seconds");
		      break;
		    default:
		    	System.out.println("Invalid Option");
		  }
		}


	}

