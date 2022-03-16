package com.lxisoft.moviescript;

public class Scene {

    Dialogue [] dialogues = new Dialogue [100];

    public void printDialogue(){

        for (int i=0; i < dialogues.length; i++){

            if (dialogues[i] !=null) {

        System.out.println(dialogues[i].getDialogueText());

        }}
    }
    }
    