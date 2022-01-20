package com.lxisoft.snakesandladders;

import java.util.List;

public class BoosterLadder extends Ladder {

	public BoosterLadder(Cell bottomPosition, List<Cell> cells) {
		this.bottomPosition = bottomPosition;
		int topPosition = bottomPosition.getCellNumber() + 40;
		this.topPosition = cells.get(topPosition - 1);
	}
}