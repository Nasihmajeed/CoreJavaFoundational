package com.lxisoft.moviescript;
import java.util.*;

import com.lxisoft.repository.FileRepository;
import com.lxisoft.repository.Repository;


   public class Scriptwriter {


    private List <Dialogue> dialogues = new ArrayList <Dialogue> ();

    public List <Dialogue> getDialogue(){

      return dialogues;
    }

      public void setDialogue(List <Dialogue> dialogue) {

        this.dialogues = dialogue;
      }
      
       public void setupDialogue () {

        Repository repository;

        repository = new FileRepository();

        dialogues=repository.findAll();

       
    }


      public Script writeScript(List <Actor> actors) {

        Script script = new Script();

        script.selectScenes();

        for (int x = 1; x <script.getScenes().length; x ++){

          if(script.getScenes() [x] != null){

            for (int i = 0; i < 10; i++){

              int number = (int) (Math.random()*dialogues.size());

              int actorNumber = (int) (Math.random()*actors.size());

              dialogues.get(number).setDeliveredBy(actors.get(actorNumber));

              script.getScenes() [x].getDialogues().add (dialogues.get(number));
            }}
          }
          return script;
      }}
  