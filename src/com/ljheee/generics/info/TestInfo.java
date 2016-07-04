package com.ljheee.generics.info;

public class TestInfo {

	// ͨ���
	public static void fun(Info<?> temp) {
		System.out.println("����:" + temp);
	}

	// ����ͨ�����ֻ�ܽ���Number����Number������
	public static void fun1(Info<? extends Number> temp) {
		System.out.println("������:" + temp);
	}

	// ֻ�ܽ���String��Object
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
