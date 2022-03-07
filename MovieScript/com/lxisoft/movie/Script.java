package com.lxisoft.movie;

public class Script  {

 int sceneNo;

 Scene[] scenes = new Scene[6]; 

public void getScenes ()  {


  sceneNo = (int) (Math.random()*3 +3 );

 

  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 0; i <sceneNo; i++)  {
 

    Scene scene = new Scene(); 
 
  scenes[i] = scene;
  

}


  }


}



