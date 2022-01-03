package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class BoosterSnake {

	protected Cell headPosition;
	protected Cell tailPosition;

	public BoosterSnake() {
		super();
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