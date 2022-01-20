package com.lxisoft.snakesandladders;

import java.util.List;

public class BoosterSnake extends Snake {

	public BoosterSnake(Cell headPosition, List<Cell> cells) {
		this.headPosition = headPosition;
		int tailPosition = headPosition.getCellNumber() - 50;
		this.tailPosition = cells.get(tailPosition - 1);
	}
}