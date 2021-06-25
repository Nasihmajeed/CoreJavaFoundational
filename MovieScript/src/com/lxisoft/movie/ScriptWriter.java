package com.lxisoft.movie;
import com.lxisoft.director.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ScriptWriter {
  File f1=new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\script\\script.csv");

  ArrayList<Script>script= new ArrayList<Script>();
  public void writeScript() throws IOException {



        String s;
        String words[]=null;

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);



        while((s=br.readLine())!=null)
        {
           words=s.split(";");


            if (words[0].equals("comedy") || words[0].equals("romantic") || words[0].equals("emotional")){
              script.add(new Script());

              for(int i=script.size()-1;i<script.size();i++){
              script.get(i).setGenre(words[0]);
              script.get(i).setCharacter(words[1]);
              script.get(i).setConversation(words[2]);

            }
          }
}

fr.close();







  Scanner sc= new Scanner(System.in);

  System.out.println("ENTER GENRE ");
  String input1=sc.next();


  System.out.println("**********************************n\n");
  System.out.println("************************************");
  System.out.println("************************************");
  System.out.println("*************SCENE1****************");
  System.out.println("***********************************");
  System.out.println("***********************************");


                  for (int i=0;i<script.size();i++)
                  {

                  //  System.out.println(script.get(i).getCharacter());
                    if(script.get(i).getGenre().equals(input1)){

                     System.out.println(script.get(i).getCharacter()+" "+script.get(i).getConversation());
                    }

    }
    int n=randNum();
    //System.out.println(n);
    for(int i=0;i<n;i++){
      //  System.out.println(n);
     if(!script.get(i).getGenre().equals(input1)){
       //System.out.println(n);
       System.out.println(script.get(i).getCharacter()+"  "+script.get(i).getConversation());
     }
    }
  }



        public int randNum(){
        		int s=script.size();
        		int random=(int)(Math.random()*s);
                        return random;
        	}


}
