package com.ljheee.generics.point;

public class TestPoint {

	
	public static void main(String[] args) {
		
		Point<Integer> p1 = new Point<Integer>();
		p1.setX(4);
		
		Point<Double> p2 = new Point<Double>();
		p2.setX(4.3);
		
		Point1<Integer, Double> p3 = new Point1<Integer, Double>();
		p3.setX(6);
		p3.setY(8.2);
		System.out.println(p3.getX()+","+p3.getY());
	}

}
