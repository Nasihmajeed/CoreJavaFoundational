package com.lxisoft.moviescript;

  public class Script {

   private Scene [] scenes = new Scene [6];

   public Scene[] getScenes(){

    return scenes;
   }

   public void setScenes(Scene[] scenes) {

    this.scenes = scenes;
   }


     int numberOfScenes;

     public void selectScenes() {

      
      numberOfScenes = (int) (Math.random()*3+3);

      System.out.println(" Number Of Scenes:" + numberOfScenes);

      for(int i = 1; i< numberOfScenes; i++){

        Scene scene = new Scene();

        scenes [i] = scene;

      }
    }

     public void viewScenes() {

      System.out.println(" \t\t\t VIEW SCRIPT");

      System.out.println("\t\t ---------------------");


      for (int i = 1; i <=numberOfScenes; i ++) {

        System.out.println("\n");

        System.out.println("\t\t\t  SCENE: " + i);

        System.out.println("\t\t ---------------------");

        scenes[i].printDialogue();


      }
    }
      }


        