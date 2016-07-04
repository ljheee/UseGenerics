package com.ljheee.generics.pair;

/**
 * 算法类--提供泛型  数组排序方法。
 * @author ljheee
 *
 */
public class ArrayAlg {

	/**
	 * 泛型方法，求数组的最大值和最小值
	 * @param a		一个数组T[] a
	 * @return 返回一个Pair<T>对象，包含最大、最小值
	 */
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		
		if (a == null || a.length == 0) {
			return null;
		}
		
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		
		return new Pair<T>(max, min);
	}

}
