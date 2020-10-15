package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Forest
{
ArrayList<Animal> animal=new ArrayList<Animal>();
GameInterface g=new GameInterface();
Random random=new Random();
public void Start()
{
int choice=0;
do
{
this.animal();
System.out.println("Press\n1.Start\t2.Exit");
Scanner scn=new Scanner(System.in);
choice=scn.nextInt();
if (choice==1)
{
this.animalDisplay();
System.out.println("--------------The game begins--------------"+"\n");
this.startGame();

}
}while(choice==1);

}
public void animal()
{
animal.add(new Lion());
animal.get(0).setName("African Lion");
animal.get(0).setStrength(90);
animal.get(0).setLife(true);
animal.get(0).setDistance(60);
animal.add(new Tiger());
animal.get(1).setName("Tiger      ");
animal.get(1).setStrength(85);
animal.get(1).setLife(true);
animal.get(1).setDistance(50);
animal.add(new Bear());
animal.get(2).setName("Brown Bear");
animal.get(2).setStrength(70);
animal.get(2).setLife(true);
animal.get(2).setDistance(45);
animal.add(new Rabbit());
animal.get(3).setName("Rabbit-1");
animal.get(3).setStrength(50);
animal.get(3).setLife(true);
animal.get(3).setDistance(10);
animal.add(new Elephant());
animal.get(4).setName("Gorilla    ");
animal.get(4).setStrength(60);
animal.get(4).setLife(true);
animal.get(4).setDistance(47);

animal.add(new Lion());
animal.get(5).setName("Asiatic Lion");
animal.get(5).setStrength(75);
animal.get(5).setLife(true);
animal.get(5).setDistance(16);
animal.add(new Tiger());
animal.get(6).setName("Cheetah    ");
animal.get(6).setStrength(82);
animal.get(6).setLife(true);
animal.get(6).setDistance(50);
animal.add(new Bear());
animal.get(7).setName("Asian Bear");
animal.get(7).setStrength(64);
animal.get(7).setLife(true);
animal.get(7).setDistance(45);
animal.add(new Rabbit());
animal.get(8).setName("Koala         ");
animal.get(8).setStrength(40);
animal.get(8).setLife(true);
animal.get(8).setDistance(10);
animal.add(new Elephant());
animal.get(9).setName("Elephant");
animal.get(9).setStrength(65);
animal.get(9).setLife(true);
animal.get(9).setDistance(17);
}
public void animalDisplay()
{
int i;
System.out.println("|----The Animals for the game are:------|");
System.out.println("|-Sl.No:-|------Animal Names------------|");
for(i=0;i<10;i++)
{
System.out.println("|"+(i+1)+"\t"+" |"+"\t"+animal.get(i).getName()+"\t"+"\t"+"|");
}
System.out.println("|---------------------------------------|"+"\n");
}
public void startGame()
{
int count=this.loop();
while(count>1)
{
count=this.loop();
int playerOne=random.nextInt(10);
int playerTwo=random.nextInt(10);
if (playerOne!=playerTwo)
{
if(animal.get(playerOne).getLife()==true&&animal.get(playerTwo).getLife()==true);
{
g.Game(playerOne,playerTwo,animal);
      	}
   }
   }
this.diedAnimals();  
this.lastStanding();  
 }
public void lastStanding() 
{
for(int i=0;i<10;i++)
{
if (animal.get(i).getLife()==true)
{
System.out.println("|---------The Winnner---------|");
System.out.println("         "+animal.get(i).getName());
System.out.println("|-----------------------------|");
}
}
}
 public int loop(){
         int count=0;
        for(int i=0;i<animal.size();i++){
           
            if(animal.get(i).getLife()==true){
            count++;
           }
              
        }
        return count;
  }
  public void diedAnimals()
  {
  int i=0;
System.out.println("\n"+"|---The Animals died in the game are:---|");
System.out.println("|-Sl.No:-|--------Animal Names----------|");
  for(i=0;i<10;i++)
  {
  if(animal.get(i).getLife()==false)
  {
System.out.println("|"+(i+1)+"\t"+" |"+"\t"+animal.get(i).getName()+"\t"+"\t"+"|");
  }
  }
  System.out.println("|---------------------------------------|"+"\n");
  }

}
