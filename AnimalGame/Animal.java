import java.util.*;
class Animal
{
	int animal_strength;
	String name;
	
    void fight()
    {    
    ArrayList <Animal> animallist= new ArrayList <Animal> ();
    Tiger tiger =new Tiger();
    tiger.getData();
    animallist.add(tiger);
    Lion lion =new Lion();
    lion.getData();
    animallist.add(lion);
    Deer deer =new Deer();
    deer.getData();
    animallist.add(deer);
    Snake snake =new Snake();
    snake.getData();
    animallist.add(snake);
  
    Collections.shuffle(animallist);
    for(int i=0;i<animallist.size();i++){
 System.out.println("Name:"+animallist.get(i).name+"\tStrength:"+animallist.get(i).animal_strength);}

  while(animallist.size()!=1)
  {
  	
       for (int i=0;i<animallist.size();i=i+2)
       {
      	
       	if(animallist.get(i).animal_strength>animallist.get(i+1).animal_strength)
         {
         	System.out.print("\n"+animallist.get(i).name+" Vs "+animallist.get(i+1).name+" :   Winner:"+animallist.get(i).name+"\n");
         	animallist.get(i+1).name=null;
         	animallist.get(i+1).animal_strength=0;
          
          }
        else
         {
     	 System.out.print("\n"+animallist.get(i).name+" Vs "+animallist.get(i+1).name+" :  Winner:"+animallist.get(i+1).name+"\n");
         //animallist.remove(i);
          animallist.get(i).name=null;
          animallist.get(i).animal_strength=0;
          }
        }
        for(int i=0;i<animallist.size();i++){
       if(animallist.get(i).animal_strength==0)
       animallist.remove(i);
       }
    }

      System.out.print("\n Final Winner:"+animallist.get(0).name);
     }
     

 }