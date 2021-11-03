import java.util.Scanner;
public  class esal {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  int DA, PF, HRA = 500;
 
  System.out.println("Enter The Name");
  String name = sc.nextLine();
  System.out.println("Enter The Designation");
  String designation = sc.nextLine();
  System.out.println("Enter Bassic Salarry");
  int basic_pay = sc.nextInt();
 
  // ignore: omit_local_variable_types
  

  if (basic_pay < 10000) {
    DA = (basic_pay * 60) / 100;
    PF = (basic_pay * 15) / 100;
  // int NET_SAL = basic_pay + DA + HRA - PF;
    } else {
    DA = (basic_pay * 75) / 100;
    PF = (basic_pay * 20) / 100;
   
  }
  int NET_SAL = ((basic_pay + DA + HRA) - PF);
System.out.println("Name of Employee :" +name);
System.out.println("Possition is : " +designation);
System.out.println("Basic_Salarry : "+basic_pay);
System.out.println("HRA :" +HRA);
System.out.println("PF :" +PF);
System.out.println("DA :" +DA);
System.out.println("NET_SALARRY :" +NET_SAL);
}
}