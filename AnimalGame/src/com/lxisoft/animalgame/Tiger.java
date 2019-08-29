package com.lxisoft.animalgame;

public class Tiger extends Animal
	{
		int strength=5;
		String name;
		public void eat()
			{
				System.out.println("Tiger eating...");
			}

		public void run()
			{
				System.out.println("tiger running fast...");

			}
		 public void meet()
		 	{
		 		System.out.println("Tiger coming..");

		 	}
		public void fight()
			{
				System.out.println("Tiger wins..");
			}


	}