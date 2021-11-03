import java.io.*;
import java.util.Scanner;
public class fibanocci{
       public static void main(String[] args){
              int n,f=0,f1=0,f2=1;
              Scanner in = new Scanner(System.in);
              try{
                     System.out.println("enter the limit : ");
                     n = in.nextInt();
                     System.out.println("fibanocci series upto :" +n);
                     System.out.println(f1);
                     System.out.println(f2);
                     do {
                            f = f1 + f2;
                            f1 = f2;
                            f2 = f;
                            if(f > n)
                            break;
                            System.out.println(f);
                     } while (f < n);
              }
              catch(Exception e){

              }
       }
}