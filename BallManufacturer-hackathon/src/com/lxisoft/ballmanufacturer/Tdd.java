package com.lxisoft.ballmanufacturer;

import java.util.List;
import java.util.Scanner;

import com.lxisoft.ballmanufacturer.model.Ball;
import com.lxisoft.ballmanufacturer.utils.CSVReader;

public class Tdd {

	public static void main(String[] args) {
		System.out.println("\n\t\t\t\t\t\t\tNIVIA SPORTS");
		System.out.println("\t\t\t\t\t\t\t============\n\n");
		System.out.println("Get amazing discounts on footballs, cricket balls, tennis balls & volleyballs. Don't miss the opportunity!!\n\n");
		CSVReader csvReader = new CSVReader();
		List<Ball> balls = csvReader.readCSV();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sl.No\tCategory\t\tModel Number\tModel Name\tColor\t\tPrice\t\tOffers");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		int slNo = 1;
		for (Ball ball : balls) {
			System.out.print(slNo++ + "\t");
			ball.printDetails();
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\nEnter the Sl.No to test the ball");
		Scanner scanner = new Scanner(System.in);
		slNo = scanner.nextInt();
		Ball ball = balls.get(slNo - 1);
		ball.testTheBall();
		scanner.close();
	}

}
