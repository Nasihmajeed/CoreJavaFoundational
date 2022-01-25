package com.lxisoft.movie;

public class Script  {

public int sceneNo;


Scene [] scenes = new Scene[sceneNo];




public Scene getSceneNo()  {




  sceneNo = (int) (Math.random()*3 +3 );

  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 1; i <= sceneNo; i++)  {
    
    Scene scene = new Scene();


  scenes[i] = scene;
  

  }


 
  return scene;
}




}  





