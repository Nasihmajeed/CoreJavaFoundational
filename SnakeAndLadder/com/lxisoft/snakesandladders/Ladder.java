package com.lxisoft.snakesandladders;

import java.util.List;

import com.lxisoft.game.Coin;

public class Ladder {

	protected Cell topPosition;
	protected Cell bottomPosition;

	public Ladder() {
	}

	public Ladder(Cell bottomPosition, List<Cell> cells) {
		this.bottomPosition = bottomPosition;
		int topPosition = bottomPosition.getCellNumber() + 20;
		this.topPosition = cells.get(topPosition - 1);
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
