package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
Animal animal;
Rabbit rabbit;
Elephant elephant;

public void printDetails()
{
animal=new Animal();
rabbit=new Rabbit();
elephant=new Elephant();
animal.eat();
animal.run();
rabbit.eat();
rabbit.run();
elephant.eat();
elephant.run();
}
}