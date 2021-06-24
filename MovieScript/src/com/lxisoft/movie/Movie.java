package com.lxisoft.movie;
import com.lxisoft.actors.*;
import com.lxisoft.director.*;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Movie{
  Director director=new Director();
  ScriptWriter writer=new ScriptWriter();
  public void startMovie(){

    director.casting();
    writer.writeScript();
  }

  public void printPlot(){
    System.out.println("|**************************************************^^*************************************************************************************************************|");
    System.out.println("|Unnikrishnan  owns an old bus, received as compensation for his father                                                                   |");
    System.out.println("|The plot takes a big turn when a girl named Basanthi enters the bus as a nomad,                                                             |");
    System.out.println("|but she is actually  Gayathri, the daughter of an influential and politically powerful minister R. K. Santhanam in Puducherry.           |");
    System.out.println("|The police traced her and takes her back to Santhanam's custody. Santhanam is making arrangements for her marriage with someone else.    |");
    System.out.println("|Meanwhile, Unni realizes that he could not live without Gayathri. He and Sundareshan secretly enter her house.                         |");
    System.out.println("|Unni and his friends plans to take Gayathri, but Santhanam find them inside the almirah. After a fight, everything ends well.           |");
    System.out.println("|***************************************************************************************************************************************************|");
  }
  public void printDialogue(){
    System.out.println("\n\n***************************************************************************************************");
    System.out.println("*******************SCENE1*********************************************");
    System.out.println("*********************************************************************");
    System.out.println("Sundhareshan enters the  scene humming a song, finds Basanthi siiting infront of the bus\n\n");

  }

  public void printCast(){
    System.out.println("|**************************************|");
    System.out.println("|Dileep as Unnikrishnan               |");
    System.out.println("|Harisree Ashokan as Sundhareshan     |");
    System.out.println("|Nithya Das as Basanthi,Gayathri        |");
    System.out.println("|Cochin Haneefa as Veerappan Kurupp     |");
    System.out.println("|**************************************|");
  }

  }
