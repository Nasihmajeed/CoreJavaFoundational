import java.util.Scanner;
class min{
public static void main(String[] args) {
  Scanner sc  = new Scanner(System.in);

  System.out.println("time: ");

  int min = sc.nextInt();;
  int h, m, s;

  h = (min / 60);

  m = (min % 60);

  s = (m / 60);

 System.out.println(h+ ":" + m + ":" +s);
}
}