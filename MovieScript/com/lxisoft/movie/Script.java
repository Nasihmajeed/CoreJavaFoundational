package com.lxisoft.movie;

public class Script  {

 int sceneNo;



public void getSceneNo()  {


  sceneNo = (int) (Math.random()*3 +3 );

  Scene [] scenes = new Scene[sceneNo]; 




  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 1; i < sceneNo; i++)  {
 

    Scene scene = new Scene();

  scenes[i] = scene;
  

  scene.showDialogue();

}


  }


}



