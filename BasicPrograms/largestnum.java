package practice;

import java.util.Scanner;

public class LargestOfFour {

	public static void main(String[] args) {
		System.out.println("Enter four numbers");
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		if (n1 > n2 && n1 > n3 && n1> n4) {
			System.out.println(n1 + " is the largest number.");
				}
		else if (n2 > n3 && n2 > n4) {
			System.out.println(n2 + " is the largest number.");
		}
		else if (n3 > n4) {
			System.out.println(n3 + " is the largest number.");
		}
		else {
			System.out.println(n4 + " is the largest number");
		}
	}
}


