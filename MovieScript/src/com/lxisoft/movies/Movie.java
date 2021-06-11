package com.lxisoft.movie;
import com.lxisoft.actors.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Movie{
  public void FileWordSearch() throws IOException{

        File f1=new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\files\\comedyScene.txt"); //Creation of File Descriptor for input file
        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;


           // Input word to be searched
        //int count=0;   //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
           words=s.split(";");

          // System.out.println(size); //Split the word using space
          //  System.out.println(words[i]);
            if (words[1].equals("comedy") || words[1].equals("romantic") || words[1].equals("emotional")){
              script.add(new Script());
            //  System.out.println(script.size());
              for(int i=script.size()-1;i<script.size();i++){
              script.get(i).setGenre(words[1]);
              script.get(i).setCharacter(words[2]);
              script.get(i).setConversation(words[3]);
              //System.out.println(script.get(i).getGenre());
              //System.out.println(script.get(i).getConversation());
            }
          }



            }


fr.close();
        }



}
