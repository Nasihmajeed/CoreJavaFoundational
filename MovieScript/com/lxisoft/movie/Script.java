package com.lxisoft.movie;

public class Script  {

public int sceneNo;


Scene [] scenes = new Scene[10];

Scene scene = new Scene();


public void getSceneNo()  {



  sceneNo = (int) (Math.random()*3 +3 );

  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 0; i < sceneNo; i++)  {
 

    Scene scene = new Scene();

  scenes[i] = scene;
  

}

scene.showScene1();

  }


}



