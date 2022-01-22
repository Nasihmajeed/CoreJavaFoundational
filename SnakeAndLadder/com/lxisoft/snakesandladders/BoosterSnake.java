package com.lxisoft.snakesandladders;

import java.util.List;

public class BoosterSnake extends Snake {

	public BoosterSnake(Cell headPosition, List<Cell> cells) {
		updateHeadAndTail(headPosition, cells, 50);
	}
}