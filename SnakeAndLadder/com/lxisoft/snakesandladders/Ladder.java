package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class Ladder {

	private int topPosition;
	private int bottomPosition;

	public Ladder(int topPosition, int bottomPosition) {
		this.topPosition = topPosition;
		this.bottomPosition = bottomPosition;
	}

	public void lift(Coin coin) {
		coin.setPosition(topPosition);
	}

	public int getTopPosition() {
		return topPosition;
	}

	public int getBottomPosition() {
		return bottomPosition;
	}

}
