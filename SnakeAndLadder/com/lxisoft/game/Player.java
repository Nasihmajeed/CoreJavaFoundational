package com.lxisoft.game;

import java.util.List;

import com.lxisoft.snakesandladders.Cell;

public class Player {

	private String name;
	private Coin coin;

	public void moveCoin(int moves, List<Cell> cells) {
		Cell cell;
		if (coin.getPosition() != null) {
			int position = coin.getPosition().getCellNumber() + moves;
			cell = cells.get(position - 1);

		} else {
			cell = cells.get(0);

		}
		coin.setPosition(cell);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

}
