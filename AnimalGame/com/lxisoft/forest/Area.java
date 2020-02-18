package com.lxisoft.forest;
import java.util.*;

public class Area
{
public void setAnimalPosition(ArrayList<Animal> animals)
{
	Random random = new Random();
	for(int i=0;i<animals.size();i++)
	{
		int a=random.nextInt(50);
		int b=random.nextInt(50);
		animals.get(i).setxaxis(a);
		animals.get(i).setyaxis(b);
	}
}


}