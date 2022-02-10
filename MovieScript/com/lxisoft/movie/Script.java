package com.lxisoft.movie;

public class Script  {

public int sceneNo;


Scene [] scenes = new Scene[sceneNo];

Scene scene = new Scene();


public void getSceneNo()  {


  sceneNo = (int) (Math.random()*3 +3 );

  Scene [] scenes = new Scene[sceneNo];

  scenes[0] = scene;


  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 1; i < sceneNo; i++)  {
 

    Scene scene = new Scene();

  scenes[i] = scene;
  

}

scene.showScene1();

  }


}



