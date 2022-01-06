package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class BoosterLadder {

	protected Cell topPosition;
	protected Cell bottomPosition;

	public BoosterLadder() {
	}

	public void lift(Coin coin) {
		coin.setPosition(topPosition);
	}

	public Cell getTopPosition() {
		return topPosition;
	}

	public Cell getBottomPosition() {
		return bottomPosition;
	}

}