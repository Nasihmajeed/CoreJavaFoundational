package com.lxisoft;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
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
		System.out.println("1. മലയാളം");
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
			prop.load(new InputStreamReader(input, StandardCharsets.UTF_8));

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
			game.setBoard(board);
			game.setPlayer1(player1);
			game.setPlayer2(player2);
			game.setDie(die);
			game.setProperties(prop);
			System.out.println(prop.getProperty("game.welcome-message"));
			System.out.println(prop.getProperty("game.description"));
			System.out.println(prop.getProperty("game.setup"));
			System.out.println(prop.getProperty("game.rules"));
			System.out.println(prop.getProperty("game.equipments"));
			System.out.println(prop.getProperty("game.snakeRole"));
			System.out.println(prop.getProperty("game.ladderRole"));
			System.out.println(prop.getProperty("game.board"));
			System.out.println(prop.getProperty("board.cells"));
			System.out.println(prop.getProperty("board.snakes"));
			System.out.println(prop.getProperty("board.ladders"));
			System.out.println(prop.getProperty("game.players"));
			System.out.println("* " + player1.getName() + "( " + coin1.getColor() + ")");
			System.out.println("* " + player2.getName() + "( " + coin2.getColor() + ")\n");
			System.out.println(prop.getProperty("game.die"));
			System.out.println(prop.getProperty("die.faces") + die.getFaces());
			System.out.println(prop.getProperty("game.start.value"));
			System.out.println(prop.getProperty("game.start-message"));

			game.play();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
