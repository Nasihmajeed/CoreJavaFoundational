package com.lxisoft.about;
import java.io.*;
import java.util.*;
public class Plot
{

public void getPlot()
{
try {
      File myObj = new File("D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\about\\Plot.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

}