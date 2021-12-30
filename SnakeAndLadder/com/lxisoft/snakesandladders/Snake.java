package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class Snake {

	private Cell headPosition;
	private Cell tailPosition;

	public Snake(Cell headPosition, Cell tailPosition) {
		this.headPosition = headPosition;
		this.tailPosition = tailPosition;
	}

	public void bite(Coin coin) {
		coin.setPosition(tailPosition);
	}

	public Cell getHeadPosition() {
		return headPosition;
	}

	public Cell getTailPosition() {
		return tailPosition;
	}

}
