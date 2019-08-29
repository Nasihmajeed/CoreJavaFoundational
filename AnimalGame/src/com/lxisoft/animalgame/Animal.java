package com.lxisoft.animalgame;

import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
public class Animal
{

	void meet() //randomly meeting
		{

			System.out.println("Animal meeeting");
			Tiger t = new Tiger();
			t.name="tiger";
			Rabbit r=new Rabbit();
			r.name="Rabbit";
			System.out.println(t.name + " and " + r.name +" are meeting");
				if(t.strength>r.strength)
				{

					t.fight();
					t.strength--;
					System.out.println(t.strength);
				}
				else
				{
						r.fight();
						r.strength--;
						System.out.println(r.strength);
				}
			
		}

}