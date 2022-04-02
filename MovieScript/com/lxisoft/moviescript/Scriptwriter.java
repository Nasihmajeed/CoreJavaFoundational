package com.lxisoft.moviescript;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.*;


   public class Scriptwriter {


    private List <Dialogue> dialogue = new ArrayList <Dialogue> ();

    public List <Dialogue> getDialogue(){

      return dialogue;
    }

      public void setDialogue(List <Dialogue> dialogue) {

        this.dialogue = dialogue;
      }
      
       public void setupDialogue () {

        try {

          Class.forName("com.mysql.cj.jdbc.Driver");

          Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root");

          Statement stmt = sql.createStatement();

          ResultSet rst = stmt.executeQuery("select * from dialogues;");

          while (rst.next()){
            
          dialogue.add(new Dialogue(rst.getString(1)));
      }
    }
      catch (Exception e) {

        System.out.println("Exceptin Found");

        e.printStackTrace();
      }
    }


      public Script writeScript(List <Actor> actors) {

        Script script = new Script();

        script.selectScenes();

        for (int x = 1; x <script.getScenes().length; x ++){

          if(script.getScenes() [x] != null){

            for (int i = 0; i < 10; i++){

              int number = (int) (Math.random()*dialogue.size());

              int actorNumber = (int) (Math.random()*actors.size());

              dialogue.get(number).setDeliveredBy(actors.get(actorNumber));

              script.getScenes() [x].getDialogues().add (dialogue.get(number));
            }}
          }
          return script;
      }}
  