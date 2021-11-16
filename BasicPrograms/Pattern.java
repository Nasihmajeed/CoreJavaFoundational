import java.util.Scanner;
public class Pattern {

public static void main(String [] args) {

  int a, b, c, d, e, f;
  for (a = 0; a <= 5; a++) {
    System.out.print("\n");
    for (b = 1; b <= a; b++) {
      System.out.print("\t*");
    }
  }
  for (c = 0; c <= 5; c++) {
    System.out.print("\n");
    for (d = 1; d <= c; d++) {
System.out.print("\t");
      System.out.print(c);
    }
  }
  for (e = 0; e <= 5; e++) {
    System.out.print('\n');
    for (f = 1; f <= e; f++) {
System.out.print("\t");
      System.out.print(f);
    }
  }
}
}