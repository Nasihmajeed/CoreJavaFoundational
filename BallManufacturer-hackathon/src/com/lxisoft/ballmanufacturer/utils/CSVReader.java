package com.lxisoft.ballmanufacturer.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.lxisoft.ballmanufacturer.model.AirFilledBall;
import com.lxisoft.ballmanufacturer.model.Ball;
import com.lxisoft.ballmanufacturer.model.BouncingBall;

public class CSVReader {

	public List<Ball> readCSV() {
		String line = "";
		List<Ball> balls = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("resources/Balls.csv"))) {
			while ((line = br.readLine()) != null) {
				String[] ball = line.split(",", 5);
				if ("Cricket Ball".equals(ball[0]) || "Tennis Ball".equals(ball[0])) {
					BouncingBall bouncingBall = new BouncingBall(ball[0], ball[1], ball[2], ball[3], Integer.parseInt(ball[4]));
					balls.add(bouncingBall);
				} else if ("Football".equals(ball[0]) || "Volleyball".equals(ball[0])) {
					AirFilledBall airFilledBall = new AirFilledBall(ball[0], ball[1], ball[2], ball[3], Integer.parseInt(ball[4]));
					balls.add(airFilledBall);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return balls;
	}
}
