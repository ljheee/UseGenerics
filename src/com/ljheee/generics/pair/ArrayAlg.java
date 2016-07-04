package com.ljheee.generics.pair;

/**
 * �㷨��--�ṩ����  �������򷽷���
 * @author ljheee
 *
 */
public class ArrayAlg {

	/**
	 * ���ͷ���������������ֵ����Сֵ
	 * @param a		һ������T[] a
	 * @return ����һ��Pair<T>���󣬰��������Сֵ
	 */
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		
		if (a == null || a.length == 0) {
			return null;
		}
		
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			
			if (min.compareTo(a[i]) > 0) {//��min>a[i]
				min = a[i];
			}
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		
		return new Pair<T>(max, min);
	}

}
