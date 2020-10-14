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
this.animal();
this.animalDisplay();
System.out.println("Press\n1.Start\t2.Exit");
Scanner scn=new Scanner(System.in);
int choice=scn.nextInt();
if (choice==1)
{
System.out.println("The game begins");
this.startGame();
}
}
public void animal()
{
animal.add(new Lion());
animal.get(0).setName("African Lion");
animal.get(0).setStrength(90);
animal.get(0).setLife(true);
animal.add(new Tiger());
animal.get(1).setName("Tiger      ");
animal.get(1).setStrength(85);
animal.get(1).setLife(true);
animal.add(new Bear());
animal.get(2).setName("Brown Bear");
animal.get(2).setStrength(75);
animal.get(2).setLife(true);
animal.add(new Rabbit());
animal.get(3).setName("Rabbit-1");
animal.get(3).setStrength(40);
animal.get(3).setLife(true);
animal.add(new Elephant());
animal.get(4).setName("Gorilla    ");
animal.get(4).setStrength(95);
animal.get(4).setLife(true);

animal.add(new Lion());
animal.get(5).setName("Asiatic Lion");
animal.get(5).setStrength(90);
animal.get(5).setLife(true);
animal.add(new Tiger());
animal.get(6).setName("Cheetah    ");
animal.get(6).setStrength(85);
animal.get(6).setLife(true);
animal.add(new Bear());
animal.get(7).setName("Asian Bear");
animal.get(7).setStrength(75);
animal.get(7).setLife(true);
animal.add(new Rabbit());
animal.get(8).setName("Koala         ");
animal.get(8).setStrength(40);
animal.get(8).setLife(true);
animal.add(new Elephant());
animal.get(9).setName("Elephant");
animal.get(9).setStrength(90);
animal.get(9).setLife(true);
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
//int count=0;
int count=this.workingOfLoop();
//for(int i=0;i<animal.size();i++)
while(count>1)
{
count=this.workingOfLoop();
int playerOne=random.nextInt(10);
int playerTwo=random.nextInt(10);
if (playerOne!=playerTwo)
{
//playerOne=random.nextInt(10);
//}
//else if((animal.get(playerOne).getLife()==true)&&(animal.get(playerTwo).getLife()==true))
if(animal.get(playerOne).getLife()==true&&animal.get(playerTwo).getLife()==true);
{
g.Game(playerOne,playerTwo,animal);
      	}
   }
   }
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
 public int workingOfLoop(){
         int count=0;
        for(int i=0;i<animal.size();i++){
           
            if(animal.get(i).getLife()==true){
            count++;
           }
              
        }
        return count;
 
 }
 }
