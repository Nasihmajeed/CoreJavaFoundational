package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class Snake {

	private int headPosition;
	private int tailPosition;

	public Snake(int headPosition, int tailPosition) {
		this.headPosition = headPosition;
		this.tailPosition = tailPosition;
	}

	public void bite(Coin coin) {
		coin.setPosition(tailPosition);
	}

	public int getHeadPosition() {
		return headPosition;
	}

	public int getTailPosition() {
		return tailPosition;
	}

}
