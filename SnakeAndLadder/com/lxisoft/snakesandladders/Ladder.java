package com.lxisoft.snakesandladders;

import java.util.List;

import com.lxisoft.game.Coin;

public class Ladder {

	protected Cell topPosition;
	protected Cell bottomPosition;

	public Ladder() {
	}

	public Ladder(Cell bottomPosition, List<Cell> cells) {
		updateHeadAndBottom(bottomPosition, cells, 20);
	}

	protected void updateHeadAndBottom(Cell bottomPosition, List<Cell> cells, int ladderLength) {
		this.bottomPosition = bottomPosition;
		int topPosition = bottomPosition.getCellNumber() + ladderLength;
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
