package com.lxisoft.snakesandladders;

import com.lxisoft.game.Coin;

public class Ladder {

	private Cell topPosition;
	private Cell bottomPosition;

	public Ladder(Cell topPosition, Cell bottomPosition) {
		this.topPosition = topPosition;
		this.bottomPosition = bottomPosition;
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
