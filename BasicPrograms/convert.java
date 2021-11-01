import java.util.Scanner;
class convert{
public static void main(String[] args) {
  int seconds, miniutes, hours, day, month;
  Scanner sc = new Scanner(System.in);
    int year;
  System.out.println("enter year");
  year = sc.nextInt();
  System.out.println("select the mode");
  System.out.println("1.Seconds");
  System.out.println("2.Miniutes");
  System.out.println("3.Hours");
  System.out.println("4.Days");
  System.out.println("5.Months");
int mode = sc.nextInt();
  switch (mode) {
    case 1:
      {
        seconds = year * 31536000;
        System.out.println("consists" +seconds);
      }
      break;

    case 2:
      {
        miniutes = year * 525600;
        System.out.println("year have"+miniutes);
      }
      break;

    case 3:
      {
        hours = year * 8760;
        System.out.println("year have"+hours);
      }
      break;

    case 4:
      {
        day = year * 365;
        System.out.println("year have"+day);
      }
      break;

    case 5:
      {
        month = year * 12;
        System.out.println("year have" +month);
      }
      break;

    default:
      {
        System.out.println("Invalid choice");
      }
      break;
  }
}
}

