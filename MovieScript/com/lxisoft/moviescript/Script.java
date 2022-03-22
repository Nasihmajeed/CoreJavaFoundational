package com.lxisoft.moviescript;

  public class Script {

   private Scene [] scenes = new Scene [6];

   public Scene[] getScenes(){

    return scenes;
   }

   public void setScenes(Scene[] scenes) {

    this.scenes = scenes;
   }

     public void selectScenes() {

      int numberOfScenes;

      numberOfScenes = (int) (Math.random()*3+3);

      System.out.println(" Number Of Scenes:" + numberOfScenes);

      for(int i = 0; i< numberOfScenes; i++){

        Scene scene = new Scene();

        scenes [i] = scene;

      }
    }
      }


        