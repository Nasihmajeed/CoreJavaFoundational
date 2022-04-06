package com.lxisoft.repository;
import com.lxisoft.movie.Dialogue;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository  implements Repository  {
 

 public  List<Dialogue> findAll() {


  List< Dialogue>dialogues= new ArrayList<Dialogue>();

  
try {

Scanner scr = new Scanner (new FileReader("../resources/dialogues.csv"));

while(scr.hasNext()) {

dialogues.add(new Dialogue(scr.nextLine()));

  }

} catch (Exception e)  {

System.out.println("Exception");

e.printStackTrace();

}

  return dialogues;
 }


}
