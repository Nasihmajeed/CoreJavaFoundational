package com.lxisoft;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import com.lxisoft.game.Coin;
import com.lxisoft.game.Die;
import com.lxisoft.game.Game;
import com.lxisoft.game.Player;
import com.lxisoft.snakesandladders.Board;

public class Tdd {

	public static void main(String[] args) {
		System.out.println("Select the language");
		System.out.println("1. Malayalam");
		System.out.println("2. English");
		Scanner scanner = new Scanner(System.in);
		int language = scanner.nextInt();
		String langExt = "";
		switch (language) {
		case 1:
			langExt = "-ml";
			break;

		case 2:
			langExt = "-en";
			break;
		}

		String path = System.getProperty("user.dir") + "\\resources\\game" + langExt + ".properties";
		try (InputStream input = new FileInputStream(path)) {

			Properties prop = new Properties();
			prop.load(input);

			Die die = new Die(6);
			Player player1 = new Player();
			player1.setName(prop.getProperty("player1.name"));
			Coin coin1 = new Coin();
			coin1.setColor(prop.getProperty("coin1.color"));
			player1.setCoin(coin1);
			Player player2 = new Player();
			player2.setName(prop.getProperty("player2.name"));
			Coin coin2 = new Coin();
			coin2.setColor(prop.getProperty("coin2.color"));
			player2.setCoin(coin2);
			Board board = new Board();
			Game game = new Game();
			game.setDescription(prop.getProperty("game.description"));
			game.setSetup(prop.getProperty("game.setup"));
			game.setRules(prop.getProperty("game.rules"));
			game.setEquipments(prop.getProperty("game.equipments"));
			game.setSnakeRole(prop.getProperty("game.snakeRole"));
			game.setLadderRole(prop.getProperty("game.ladderRole"));
			game.setBoard(board);
			game.setPlayer1(player1);
			game.setPlayer2(player2);
			game.setDie(die);
			System.out.println("\t\t\t\t\t\t\tWELCOME TO SNAKES AND LADDERS");
			System.out.println("\t\t\t\t\t\t\t=============================\n\n\n");
			System.out.println(game.getDescription());
			System.out.println(game.getSetup());
			System.out.println(game.getRules());
			System.out.println(game.getEquipments());
			System.out.println(game.getSnakeRole());
			System.out.println(game.getLadderRole());
			System.out.println("Board");
			System.out.println("-------");
			System.out.println("* Number of cells: " + prop.getProperty("board.cells"));
			System.out.println("* Number of snakes: " + prop.getProperty("board.snakes"));
			System.out.println("* Number of ladders: " + prop.getProperty("board.ladders") + "\n");
			System.out.println("Players");
			System.out.println("-------");
			System.out.println("* " + player1.getName() + " with " + coin1.getColor());
			System.out.println("* " + player2.getName() + " with " + coin2.getColor() + "\n");
			System.out.println("Die");
			System.out.println("-----");
			System.out.println("* Number of faces: " + die.getFaces());
			System.out.println("* Value to start the game: 1\n\n\n");
			System.out.println("\t\t\t\t\t**************Let's start the game**************\n\n\n");

			game.play();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
