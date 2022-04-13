import java.util.Scanner;
class number{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

   System.out.println("enter 4 number");
int a = sc.nextInt();
 int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();

  if (a > b && a > c && a > d) {
        System.out.println(a+ "is the largest number");
      } 
else if(b > c&& b > d){
        System.out.println(b+ "is the largest number");
  } else if (c > d) {

    System.out.println(c+ "is the largest number");
  } else {
   System.out.println(d+ "is the largest number");
  }
}
}
