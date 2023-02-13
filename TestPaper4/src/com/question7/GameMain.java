package com.question7;

public class GameMain {

	public static void main(String[] args) {

		Game g1 = new BasketBall();
		Game g2 = new FootBall();

		g1.setUp();
		g1.rules();
		g1.start();

		System.out.println("-------------------------");

		g2.setUp();
		g2.rules();
		g2.start();

	}

}
