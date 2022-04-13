import java.util.Scanner;

public class Oddeven  {

public static void main(String[] args) {

  var i = 0;

  int number [] = {11,25,33,46,52,68,74,81,90,99};

  for (i = 1; i <= number.length; i++) {
    if (number[i] % 2 == 0) {
      System.out.println("even number is" + number[i]);
    } else {
      System.out.println("odd number is"  + number[i]);
    }
  }
} 
}
