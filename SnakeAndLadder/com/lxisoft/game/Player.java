package com.lxisoft.game;

public class Player {

	private String name;
	private int position;

	public void move(int moves) {
		position = position + moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
