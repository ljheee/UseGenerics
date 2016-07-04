package com.ljheee.generics.test;

//·ºÐÍ·½·¨
class Info2 {
	public <T> T fun(T t) {
		return t;
	}
}

public class Demo2 {
	public static void main(String[] args) {
		
		
		 Info2 i1 = new Info2();
		 String str = i1.fun("tom");
				
		 Integer inte = i1.fun(3);
	}

}
