package com.lxisoft.moviescript;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

          Scanner scanner = new Scanner(new FileReader("resources/Dialogues.csv"));


          while(scanner.hasNext()){

            dialogue.add(new Dialogue(scanner.nextLine()));
          }

        }

        catch (FileNotFoundException e) {

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
  