package com.lxisoft.moviescript;

public class Scene {

    String scene1Details, scene2Details, scene3Details, scene4Details, scene5Details;

    public void inputscenesDetails() {

        this.scene1Details = "Romantic Scene";

        this.scene2Details = "Comic Scene";

        this.scene3Details = "Action Scene";

        this.scene4Details = "Comic Scene";

        this.scene5Details = "Romantic Scene";
    }
        public void printsceneDetails() {

            System.out.println("\t\t     SCENE DETAILS ");

            System.out.println("\t\t+-----------------------+" + "\n");

            System.out.println(" SCENE 1 : " + scene1Details + "\n");

            System.out.println(" SCENE 2 : " + scene2Details + "\n" );

            System.out.println(" SCENE 3 : " + scene3Details + "\n");

            System.out.println(" SCENE 3 : " + scene4Details + "\n");

            System.out.println(" SCENE 3 : " + scene5Details + "\n");
            
        }

        
    }
    

