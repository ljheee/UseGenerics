package com.ljheee.generics.point;
/**
 * 自己定义的  Point类
 * @author ljheee
 *
 * @param <K>  第一个参数的泛型类型
 * @param <V>  第二个参数的泛型类型
 */
public class Point1<K,V> {
	
	private K x;
	private V y;
	/**
	 * @return the x
	 */
	public K getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(K x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public V getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(V y) {
		this.y = y;
	}
	
	
}
