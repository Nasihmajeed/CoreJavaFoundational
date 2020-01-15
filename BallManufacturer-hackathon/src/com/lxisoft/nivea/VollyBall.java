package com.lxisoft.nivea;
import com.lxisoft.BallInterface.*;
public class VollyBall extends Ball implements Fillable
{
	public String fill()
	{
		String offer = "A air filling pump(worth of 350 rs) is free";
		return offer;
	}
}