package com.lxisoft.movie;

public class Script  {


public void creatScenes ()  {

  int sceneNo;

  sceneNo = (int) (Math.random()*3 +3 );

  Scene[] scenes = new Scene[sceneNo]; 

  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 0; i <sceneNo; i++)  {
 

    Scene scene = new Scene(); 
 
  scenes[i] = scene;
  

}


  }


}



