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
       
       public static void main(String[] args){
             System.out.println("choose your language : ");
             System.out.println("\n 1.English \n 2.Malayalam");
             Scanner sc = new Scanner(System.in);
             Localization loc = new Localization();
             int option = sc.nextInt();
             Forest f = new Forest();
             switch(option){    
              case 1:    
               //code to be executed; 
               break;  //optional  
              case 2:    
              loc.initialize();
              f.welcomeToForest();  //code to be executed;    
               break;  //optional  
                  
                  
              default:     
                System.out.println("Wrong one is choosed ! please Try again "); 
              } 
             
              
       }
}