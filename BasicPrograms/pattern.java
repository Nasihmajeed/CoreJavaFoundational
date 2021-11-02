public class patterns {

	public static void main(String[] args) {
		printPattern1();
		System.out.println("---------------------------------------");
		printPattern2();
		System.out.println("---------------------------------------");
		printPattern3();
		System.out.println("---------------------------------------");
		printPattern4();
		System.out.println("---------------------------------------");
		printPattern5();
		System.out.println("---------------------------------------");
		printPattern6();
		System.out.println("---------------------------------------");
		printPattern7();
		System.out.println("---------------------------------------");
		printPattern8();
		System.out.println("---------------------------------------");
		}

		static void printPattern1() {
		  for (int i = 0; i < 5; i++) {
		    for (int j = 0; j <= i; j++) {
		      System.out.print("* ");
		    }
		    System.out.println();
		  }
		}

		static void printPattern2() {
		  for (int i = 5; i > 0; i--) {
		    for (int j = 0; j < i; j++) {
		    	System.out.print("* ");
		    }
		    System.out.println();
		  }
		}

		static void printPattern3() {
		  int rows = 6;
		  for (int i = 0; i < rows; i++) {
		    for (int j = (rows - i); j > 1; j--) {
		    	System.out.print(" ");
		    }
		    for (int j = 0; j <= i; j++) {
		    	System.out.print("* ");
		    }
		    System.out.println();
		  }
		}

		static void printPattern4() {
		  for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		    	System.out.print(j);
		    }
		    System.out.println();
		  }
		}

		static void printPattern5() {
		  int number = 0;
		  for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		    	System.out.print(++number);
		    }
		    System.out.println();
		  }
		}

		static void printPattern6() {
		  for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		    	System.out.print(j);
		    }
		    System.out.println();
		  }
		}

		static void printPattern7() {
		  for (int i = 5; i >= 1; i--) {
		    for (int j = 1; j <= i; j++) {
		    	System.out.print(j);
		    }
		    System.out.println();
		  }
		}

		static void printPattern8() {
		  for (int i = 1; i <= 5; i++) {
		    for (int j = i; j <= 5; j++) {
		    	System.out.print(j);
		    }
		    System.out.println();
		  }
		}

	}