package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Display{
	int counter= 100;
	int iteration=-1; 

	public void boardPrinting(){
		System.out.println(" ");
		 while (counter > 0)
        {
                if (counter%10 == 0 && counter != 100)
                {
                if(iteration==-1)
                {
                    counter-=9;
                    iteration=1;
                }
                else
                {
                    System.out.print(counter+"\t");
                    counter-=10;
                    iteration=-1; 
                }
                if(counter!=0)
                System.out.print("\n" + counter + "\t"); 
            }
            else
            System.out.print(counter + "\t"); 
            counter+=iteration; 
        }



	}

    public void display(){
        System.out.println("\n\t Ladders \t\t Snakes\n");
        System.out.println("\t 3 - 44  \t\t 70 - 8 ");
        System.out.println("\t 6 - 24  \t\t 22 - 2 ");
        System.out.println("\t 15 - 38  \t\t 55 - 19 ");
        System.out.println("\t 24 - 95  \t\t 90 - 5 ");
        System.out.println("\t 60 - 91  \t\t 66 - 33 ");
    }


}