package com.lxisoft.test;

import java.*;
import java.io.*;
import java.util.Scanner;

import com.lxisoft.*;
import com.lxisoft.game.Animal;
import com.lxisoft.game.Forest;
import com.lxisoft.localization.Localization;
import com.lxisoft.factors.*;
public class TDD {
        static int option;
       public static void main(String[] args){
             System.out.println("choose your language : ");
             System.out.println("\n 1.English \n 2.Malayalam");
             Scanner sc = new Scanner(System.in);
             Localization loc = new Localization(); 
            setOption(sc.nextInt());
             Forest f = new Forest();
             switch(option){    
              case 1:    
              //loc.initialize(0); //code to be executed; 
              f.welcomeToForest();
              break;  //optional  
              case 2:    
              //loc.initialize(1);
              f.welcomeToForest();  //code to be executed;    
               break;  //optional  
                  
                  
              default:     
                System.out.println("Wrong one is choosed ! please Try again "); 

 
              } 
             
              
       }
       public static void setOption(int option)		               //distance
       {
              TDD.option=option;
       }
       
       public int getOption()
       {
              return option;
       }
}