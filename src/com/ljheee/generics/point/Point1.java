package com.ljheee.generics.point;
/**
 * �Լ������  Point��
 * @author ljheee
 *
 * @param <K>  ��һ�������ķ�������
 * @param <V>  �ڶ��������ķ�������
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
