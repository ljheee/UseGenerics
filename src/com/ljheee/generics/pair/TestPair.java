package com.ljheee.generics.pair;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPair {

	public static int add(int...arg){  //这种形参--相当于数组
		int sum = 0;
		for(int i = 0;i < arg.length;i++){
			sum += arg[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		//演示--对整形数组的排序
		Integer[] ary = { 1, 2, 3, 4, 5, 6, 44, 0 };
		
		Pair<Integer> p = ArrayAlg.minmax(ary);
		System.out.println("最大值是:" + p.getMax());
		System.out.println("最小值是:" + p.getMin());

		
		//演示--对日期数组的排序
		GregorianCalendar[] birthdays = {  //GregorianCalendar 是 Calendar 的一个具体子类，提供了世界上大多数国家/地区使用的标准日历系统
				new GregorianCalendar(1906, Calendar.DECEMBER, 9),
				new GregorianCalendar(1815, Calendar.DECEMBER, 10),
				new GregorianCalendar(1903, Calendar.DECEMBER, 3),
				new GregorianCalendar(1910, Calendar.JUNE, 22), };
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = " + mm.getMin().getTime());
		System.out.println("max = " + mm.getMax().getTime());
		
		int ee = TestPair.add(1,2);
		System.out.println(ee);
		TestPair.add(1,2,3,4,5);
	}

}
