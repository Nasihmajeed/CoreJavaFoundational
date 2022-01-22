package com.lxisoft.snakesandladders;

import java.util.List;

public class BoosterLadder extends Ladder {

	public BoosterLadder(Cell bottomPosition, List<Cell> cells) {
		updateHeadAndBottom(bottomPosition, cells, 40);
	}
}