package com.lxisoft.movie;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository  implements Repository  {
 

 public  List<Dialogue> findAll() {


  List< Dialogue>dialogues= new ArrayList<Dialogue>();

  
try {
  
 Scanner scanner = new Scanner(new FileReader("../resources.dialogues.csv"));

while(scanner.next() != null)  {

dialogues.add(new Dialogue (scanner.nextLine()));

}



} catch (Exception e) {

System.out.println("Exception");


 e.printStackTrace();
}


  return dialogues;
 }


}
