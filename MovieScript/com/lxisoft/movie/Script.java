package com.lxisoft.movie;

public class Script  {

   private Scene[] scenes = new Scene[7];

public Scene[] getScenes() {

return scenes;

}

public void setScenes(Scene[] scenes) {

this.scenes = scenes;

}
int sceneNo;
public void createScenes ()  {

 

  sceneNo = (int) (Math.random()*3 +3 );
  System.out.println("Number of Movie Scenes :" + sceneNo);
  
  
  for(int i = 1; i <=sceneNo; i++)  {
 
    Scene scene = new Scene(); 
 
  scenes[i] = scene;
  

}


  }

public void showScenes()  {

System.out.println( " SHOWING SCRIPT");

for(int i = 1; i <= sceneNo; i ++ ) {


  System.out.println("\n");
  System.out.println("\t\t\tSCENE: " + i);
  System.out.println("\t\t______________________");
  System.out.println("\n");

scenes[i].showDialogue();

}



}
}



