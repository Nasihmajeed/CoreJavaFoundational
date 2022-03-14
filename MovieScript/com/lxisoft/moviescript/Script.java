package com.lxisoft.moviescript;

  public class Script {

    Scene [] scenes = new Scene [10];

    Scene scene = new Scene();

     public void selectScenes() {

      int numberOfscenes;

      numberOfscenes = (int) (Math.random()*3+3);

      System.out.println(" Number Of Scenes:" + numberOfscenes);

      for(int i = 0; i< numberOfscenes; i++){

        scenes [i] = scene;

      }

      System.out.println("\n");

      scene.inputScenesDetails();
      scene.printSceneDetails();
    }
      }
    

        