package com.lxisoft.animalgame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Forest {
	String name;
	Animal animals;
	Animal[] animalArr;
	public Gamelevel gamelevel;
	TreeMap<Integer, Animal> animalss = new TreeMap<Integer, Animal>();

	public void meetAnimal()throws NullPointerException {
		Scanner s = new Scanner(System.in);
		int a = 0;
		System.out.println("\nanimal details\n-----------------");
		String nameAnimal[] = { "tiger", "lion", "bear", "rabbit" };
		int[] number;
		number = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("enter number of " + nameAnimal[i]);
			number[i] = s.nextInt();
			a = a + number[i];
		}

		animalArr = new Animal[a];
		setTigerDetails(number);
		setLionDetails(number);
		setBearDetails(number);
		setRabbitDetails(number);
		fight();
	}

	public void fight() {
		animalss.put(1, new Bear());
		animalss.put(4, new Bear());
		int a, count, win = 0, w = 0, i, n = 1, r = 1;
		a = animalArr.length;
		System.out.println(
				"\t\tjungle\n\t\t-------\n\t\tanimals meet and fight begins\n\t\t------------------------------");
		for (i = 0; true; i++) {
			count = 0;
			int x = (int) (Math.random() * a);
			int y = (int) (Math.random() * a);
			for (int j = 0; j < a; j++) {
				if ((animalArr[j] instanceof Carnivores)) {
					if ((animalArr[j].isDead == false)) {
						win = j;
						count++;
					}
				}
			}
			if (count <= 1) {
				System.out.println("WINNER==" + animalArr[win].animalName);
				for (int k = 0; k < a; k++) {
					System.out.println(animalArr[k].animalName + "-->  luck-" + animalArr[k].luck + " -- dead-"
							+ animalArr[k].isDead + "  --  hunger-" + animalArr[k].hunger);
				}
				break;
			}
			if ((animalArr[x] instanceof Carnivores) & (animalArr[x].isDead == false) & (animalArr[y].isDead == false)
					& (x != y)) {
				if (animalArr[y] instanceof Carnivores)
					n = winnerCarnivores(n, x, y);
				else
					setWinner(r, x, y);
			}
		}
	}

	public void setTigerDetails(int number[])throws NullPointerException {
		Scanner s = new Scanner(System.in);
		int t = 1;
		System.out.println("\ntiger details");
		System.out.println("________________");
		Animal aTiger = new Tiger();
		aTiger.run();
		aTiger.eat();
		for (int i = 0; i < number[0]; i++) {
			aTiger = new Tiger();
			System.out.println("enter name of tiger-" + t);
			aTiger.animalName = s.next();
			System.out.println("enter strength level of tiger-" + t);
			aTiger.strength = s.nextInt();
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			aTiger.pos = new Position();
			aTiger.pos.setPositionX(a);
			aTiger.pos.setPositionY(b);
			aTiger.sight = 4;
			aTiger.range = 6;
			aTiger.isDead = false;
			aTiger.hunger = Hunger.LOW;
			animalArr[i] = aTiger;
			aTiger.luck = animalLuck(animalArr[i]);
			t++;
		}
	}

	public void setLionDetails(int number[]) {
		Scanner s = new Scanner(System.in);
		int l = 1;
		System.out.println("\nlion details");
		System.out.println("________________");
		Animal aLion = new Lion(animals);
		aLion.run();
		aLion.eat();
		for (int j = number[0]; j < (number[0] + number[1]); j++) {
			aLion = new Lion(animals);
			System.out.println("enter name of lion-" + l);
			aLion.animalName = s.next();
			System.out.println("enter strength level  of lion-" + l);
			aLion.strength = s.nextInt();
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			aLion.pos = new Position();
			aLion.pos.setPositionX(a);
			aLion.pos.setPositionY(b);
			aLion.sight = 3;
			aLion.range = 5;
			aLion.isDead = false;
			aLion.hunger = Hunger.LOW;
			animalArr[j] = aLion;
			aLion.luck = animalLuck(animalArr[j]);
			l++;
		}
	}

	public void setBearDetails(int number[]) {
		Scanner s = new Scanner(System.in);
		int c = 1;
		System.out.println("\nbear details");
		System.out.println("________________");
		Animal aBear = new Bear();
		aBear.run();
		aBear.eat();
		for (int k = (number[0] + number[1]); k < (number[0] + number[1] + number[2]); k++) {
			aBear = new Bear();
			System.out.println("enter name of bear-" + c);
			aBear.animalName = s.next();
			System.out.println("enter strength level of bear-" + c);
			aBear.strength = s.nextInt();
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			aBear.pos = new Position();
			aBear.pos.setPositionX(a);
			aBear.pos.setPositionY(b);
			aBear.sight = 2;
			aBear.range = 4;
			aBear.isDead = false;
			aBear.hunger = Hunger.LOW;

			animalArr[k] = aBear;
			aBear.luck = animalLuck(animalArr[k]);
			c++;
		}
	}

	public void setRabbitDetails(int number[]) {
		Scanner s = new Scanner(System.in);
		Forest forest=new Forest();
		int r = 1;
		System.out.println("\nrabbit details");
		System.out.println("________________");
		Animal aRabbit = new Rabbit(animals,forest);
		aRabbit.run();
		aRabbit.eat();
		for (int g = (number[0] + number[1] + number[2]); g < (number[0] + number[1] + number[2] + number[3]); g++) {
			aRabbit = new Rabbit(animals,forest);
			System.out.println("enter name of rabbit-" + r);
			aRabbit.animalName = s.next();
			System.out.println("enter strength level of rabbit-" + r);
			aRabbit.strength = s.nextInt();
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			aRabbit.pos = new Position();
			aRabbit.pos.setPositionX(a);
			aRabbit.pos.setPositionY(b);
			aRabbit.sight = 5;
			aRabbit.range = 3;
			aRabbit.isDead = false;
			aRabbit.hunger = Hunger.LOW;

			animalArr[g] = aRabbit;
			aRabbit.luck = animalLuck(animalArr[g]);
			r++;
		}
	}

	public int winnerCarnivores(int n, int x, int y) {
		int a = animalArr.length, range = 0, location = 0;
		Animal temp = null;
		if ((animalArr[y]) instanceof Carnivores) {
			int[] positionX = ((Carnivores) (animalArr[x])).roam();
			int[] positionY = ((Carnivores) (animalArr[y])).roam();
			// grid();
			int z = animalLocation(positionX, positionY);
			if (z <= (animalArr[x].range)) {
				System.out.println("\n\t\tFight no---" + (n++));
				temp = ((Carnivores) (animalArr[x])).fight(animalArr[y]);
				animalArr[y] = animalFightHunger(animalArr[y]);
			}
		}
		return n;
	}

	public void setWinner(int r, int x, int y) {
		int a = animalArr.length;
		if ((animalArr[y]) instanceof Herbivores) {
			try {
				int[] arr = animalInSight(y);
				int e = arr.length;
				System.out.println("-------near by animals-----" + e);
				animalAttack(arr, y, e);
			} catch (AnimalNotMeet anm) {
				System.out.println(animalArr[y].animalName + " has no near by animals");
			}
		}
	}

	public void animalAttack(int[] arr, int y, int e) {
		int escape;
		if (e == 1) {
			escape = ((Herbivores) animalArr[y]).attack(animalArr[arr[0]]);
			if (escape == 0)
				animalArr[arr[0]] = animalAttackHunger(animalArr[arr[0]]);
			else
				animalArr[arr[0]] = animalFightHunger(animalArr[arr[0]]);
		} else if (e == 2) {
			escape = (animalArr[y]).attack(animalArr[arr[0]], animalArr[arr[1]]);
			for (int i = 0; i < 2; i++) {
				if (escape == 0)
					animalArr[arr[i]] = animalAttackHunger(animalArr[arr[i]]);
				else
					animalArr[arr[i]] = animalFightHunger(animalArr[arr[i]]);
			}
		} else if (e >= 3) {
			escape = ((Herbivores) animalArr[y]).attack(animalArr, e);
			for (int i = 0; i < e; i++) {
				if (escape == 0)
					animalArr[arr[i]] = animalAttackHunger(animalArr[arr[i]]);
				else
					animalArr[arr[i]] = animalFightHunger(animalArr[arr[i]]);
			}
		}
		Thread thread1 = new Thread();
		thread1.start();
		//thread1.start();

	}

	public int animalLuck(Animal animals)throws NullPointerException {
		switch (this.gamelevel) {
		case EASY: {
			animals.luck = (int) (Math.random() * 60);
			break;
		}
		case MEDIUM: {
			animals.luck = (int) (Math.random() * 40);
			break;
		}
		case HARD: {
			animals.luck = (int) (Math.random() * 20);
			break;
		}
		}
		System.out.println(animals.animalName + " luck-" + animals.luck);
		return animals.luck;
	}

	public int animalLocation(int positionX[], int positionY[]) {
		int location = (int) (Math.sqrt((positionY[0] - positionX[0]) * (positionY[0] - positionX[0])
				+ (positionY[1] - positionX[1]) * (positionY[1] - positionX[1])));
		return location;
	}

	public int[] animalInSight(int y) throws AnimalNotMeet {
		int distance = 0, count = 0;
		int[] arr = new int[animalArr.length];

		int[] axisH = ((Herbivores) (animalArr[y])).graze();
		for (int j = 0; j < animalArr.length; j++) {

			if (animalArr[j] instanceof Carnivores) {
				int[] axisC = ((animalArr[j])).roam();
				distance = animalLocation(axisC, axisH);
			}
			if (distance < animalArr[y].sight) {
				arr[count] = j;
				count++;
			} else {
				throw new AnimalNotMeet();
			}
		}
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = arr[i];
		}
		return array;
	}

	public Animal animalAttackHunger(Animal animals) {
		System.out.println(animals.animalName + " --hunger=" + animals.hunger);
		switch (animals.hunger) {
		case HIGH: {
			animals.hunger = Hunger.MEDIUM;
			break;
		}
		case MEDIUM: {
			animals.hunger = Hunger.LOW;
			break;
		}
		default:
			System.out.println("low hungry level");
		}
		return animals;
	}

	public Animal animalFightHunger(Animal animals) {
		System.out.println(animals.animalName + "--hunger=" + animals.hunger);
		switch (animals.hunger) {
		case LOW: {
			animals.hunger = Hunger.MEDIUM;
			break;
		}
		case MEDIUM: {
			animals.hunger = Hunger.HIGH;
			break;
		}

		}
		return animals;
	}

	public void grid() {
		Animal bear = new Bear();
		bear.bite();
		Arrays.sort(animalArr);
		TreeSet<Animal> animals = new TreeSet<Animal>();
		animals.add(new Bear());
		String[][] grid = new String[10][10];
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				for (int i = 0; i < animalArr.length; i++) {
					int v = animalArr[i].pos.getPositionX();
					int u = animalArr[i].pos.getPositionY();
					if ((v == row) & (u == col)) {
						grid[u][v] = animalArr[i].animalName;
						// System.out.println(animalArr[i].animalName);
					}
				}
			}
		}
	}

}
