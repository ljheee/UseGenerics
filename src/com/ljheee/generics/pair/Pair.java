package com.ljheee.generics.pair;
/**
 * �����ࣺ�������ֵ����Сֵ
 * @author ljheee
 *
 */
public class Pair<T>{
	
	private T max;
	private T min;
	
	/**
	 * @return the max
	 */
	public T getMax() {
		return max;
	}
	/**
	 * @param max the max to set
	 */
	public void setMax(T max) {
		this.max = max;
	}
	/**
	 * @return the min
	 */
	public T getMin() {
		return min;
	}
	/**
	 * @param min the min to set
	 */
	public void setMin(T min) {
		this.min = min;
	}
	
	/**
	 * ���췽��������һ�������������Сֵ
	 * @param max
	 * @param min
	 */
	public Pair(T max,T min){
		this.max = max;
		this.min = min;
	}
}
