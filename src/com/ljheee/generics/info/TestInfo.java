package com.ljheee.generics.info;

public class TestInfo {

	// 通配符
	public static void fun(Info<?> temp) {
		System.out.println("内容:" + temp);
	}

	// 受限通配符，只能接受Number或者Number的子类
	public static void fun1(Info<? extends Number> temp) {
		System.out.println("内容是:" + temp);
	}

	// 只能接受String和Object
	public static void fun2(Info<? super String> temp) {
		System.out.println(temp);
	}

	public static void main(String[] args) {
		
		Info<String> i = new Info<String>();
		i.setVar("it");
		fun2(i);

		Info<Integer> i1 = new Info<Integer>();
		i1.setVar(3);
		fun1(i1);
		// fun1(i);
		// fun(i);
		// fun(i1);
	}

}
