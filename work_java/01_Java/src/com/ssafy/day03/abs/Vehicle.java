package com.ssafy.day03.abs;

abstract class Vehicle {
	private int curX, curY;

	public Vehicle(int curX, int curY) {
		this.curX = curX;
		this.curY = curY;
	}

	public void reportPosition() {
		System.out.printf("νμ¬ μμΉ: (%d, %d)%n", curX, curY);
	}

	public abstract void addFuel();
}


