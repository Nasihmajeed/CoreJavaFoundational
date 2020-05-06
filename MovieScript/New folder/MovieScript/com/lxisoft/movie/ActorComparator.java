package com.lxisoft.movie;

import java.util.Comparator;

public class ActorComparator implements Comparator<Actor>
{

	@Override
	public int compare(Actor m1, Actor m2) {
		
		return a1.getName().compareTo(a2.getName());
	}

}
