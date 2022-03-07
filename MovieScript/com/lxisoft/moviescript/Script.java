package com.lxisoft.moviescript;

  public class Script {

    int noOfscenes;

    Scene [] scenes = new Scene [6];

    public void getScenes() {

      noOfscenes = (int) (Math.random()*3+3);

      System.out.println(" Number Of Scenes:" + noOfscenes);

      for(int i = 0; i< noOfscenes; i++){

        Scene scene = new Scene();

        scenes [i] = scene;
      }
    }
      }
    

        