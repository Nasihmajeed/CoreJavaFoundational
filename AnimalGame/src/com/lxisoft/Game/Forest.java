package com.lxisoft.Game;
import com.lxisoft.Animal.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Forest
{
ArrayList<Animal> animal=new ArrayList<Animal>();
GameInterface g=new GameInterface();

public void Start()
{
System.out.println("Press\n1.Start\t2.Exit");
Scanner scn=new Scanner(System.in);
int choice=scn.nextInt();
if (choice==1)
{
this.animal();
this.animalDisplay();
System.out.Println("The game begins");
this.startGame();
}
}
public void animal()
{
animal.add(new Lion());
animal.get(0).setName("Lion-1");
animal.get(0).setStrength(90);
animal.get(0).setLife(true);
animal.add(new Tiger());
animal.get(1).setName("Tiger-1");
animal.get(1).setStrength(90);
animal.get(1).setLife(true);
animal.add(new Bear());
animal.get(2).setName("Bear-1");
animal.get(2).setStrength(90);
animal.get(2).setLife(true);
animal.add(new Rabbit());
animal.get(3).setName("Rabbit-1");
animal.get(3).setStrength(90);
animal.get(3).setLife(true);
animal.add(new Elephant());
animal.get(4).setName("Elephant-1");
animal.get(4).setStrength(90);
animal.get(4).setLife(true);

animal.add(new Lion());
animal.get(5).setName("Lion-2");
animal.get(5).setStrength(90);
animal.get(5).setLife(true);
animal.add(new Tiger());
animal.get(6).setName("Tiger-2");
animal.get(6).setStrength(90);
animal.get(6).setLife(true);
animal.add(new Bear());
animal.get(7).setName("Bear-2");
animal.get(7).setStrength(90);
animal.get(7).setLife(true);
animal.add(new Rabbit());
animal.get(8).setName("Rabbit-2");
animal.get(8).setStrength(90);
animal.get(8).setLife(true);
animal.add(new Elephant());
animal.get(9).setName("Elephant-2");
animal.get(9).setStrength(90);
animal.get(9).setLife(true);
}
public void animalDisplay()
{
int i;
System.out.println("The Animals for the game are:");
for(i=0;i<animal.size();i++)
{
System.out.println(animal.get(i).getName());
}
}
public void startGame()
{
playerOne=random.nextInt(10);
playerTwo=random.nextInt(10);

if (playerOne==playerTwo)
{
playerOne=random.nextInt(10);
}
else if((animal.get(playerOne).getLife()==true)&&(animal.get(playerTwo).getLife()==true))
{   
g.Game(playerOne,playerTwo,animal);
      	}
   }  
 }
      















