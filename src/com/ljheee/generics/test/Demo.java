package com.ljheee.generics.test;


interface Info1<T>{
	public T getVar();
}


class ImplInfo1<T> implements Info1<T>{
	
	private T var;

	public ImplInfo1(T var){
		this.setVar(var);
	}
	
	/**
	 * @param var the var to set
	 */
	public void setVar(T var) {
		this.var = var;
	}


	@Override
	public T getVar() {
		return this.var;
	}
}

public class Demo {

	public static void main(String[] args) {
		Info1<String> info = new ImplInfo1<String>("tom");
		System.out.println(info.getVar());
	}

}
