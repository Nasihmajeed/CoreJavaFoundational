package com.lxisoft.snakesandladders;

import com.lxisoft.game.Player;

public class Snake {

	private int headPosition;
	private int tailPosition;

	public Snake(int headPosition, int tailPosition) {
		this.headPosition = headPosition;
		this.tailPosition = tailPosition;
	}

	public void bite(Player player) {
		player.setPosition(tailPosition);
	}

	public int getHeadPosition() {
		return headPosition;
	}

	public int getTailPosition() {
		return tailPosition;
	}

}
