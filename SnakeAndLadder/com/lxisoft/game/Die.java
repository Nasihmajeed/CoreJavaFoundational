package com.lxisoft.game;

public class Die {

	private int faces;

	public Die(int faces) {
		this.faces = faces;
	}

	public int roll() {
		return (int) (Math.random() * faces) + 1;
	}

	public int getFaces() {
		return faces;
	}

}
