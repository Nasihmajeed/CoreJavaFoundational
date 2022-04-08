package com.lxisoft.repository;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lxisoft.moviescript.Dialogue;

public class  FileRepository implements Repository {

    public List <Dialogue>  findAll(){

        List<Dialogue> dialogue = new ArrayList <Dialogue>();

       try {

        Scanner scanner = new Scanner(new FileReader("resources/Dialogues.csv"));

        while (scanner.hasNext()) {

        dialogue.add(new Dialogue(scanner.nextLine()));
       }
       }

       catch (Exception e) {

        System.out.println("Found Exception");

        e.printStackTrace();
       }
       
        return dialogue;
  
    }
}

    

