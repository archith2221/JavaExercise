package com.valtech.training.corejava.day01;

public class Point {
	public int x;
	public int y;
	
	public Point() {}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);

	}

	public double distance(int x, int y) {
		int dx = this.x - x;
		int dy = this.y - y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double distance(Point p) {
		return this.distance(p.x, p.y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println("X =" + p.getX() + " Y=" + p.getY());
		System.out.println(p.distance());
		System.out.println(p.distance(10, 20));
		System.out.println(p.distance(new Point(12, 13)));
	}

}
