package com.ljheee.generics.pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPair {

	public static int add(int...arg){
		int sum = 0;
		for(int i = 0;i < arg.length;i++){
			sum += arg[i];
		}
		return sum;
	}
	public static void main(String[] args) {

		Integer[] ary = { 1, 2, 3, 4, 5, 6, 44, 0 };
		Pair<Integer> p = ArrayAlg.minmax(ary);
		System.out.println("最大值是:" + p.getMax());
		System.out.println("最小值是:" + p.getMin());

		GregorianCalendar[] birthdays = {
				new GregorianCalendar(1906, Calendar.DECEMBER, 9),
				new GregorianCalendar(1815, Calendar.DECEMBER, 10),
				new GregorianCalendar(1903, Calendar.DECEMBER, 3),
				new GregorianCalendar(1910, Calendar.JUNE, 22), };
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = " + mm.getMin().getTime());
		System.out.println("max = " + mm.getMax().getTime());
		
		TestPair.add(1,2);
		TestPair.add(1,2,3,4,5);
	}

}
