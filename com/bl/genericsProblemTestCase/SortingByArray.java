package com.bl.genericsProblemTestCase;

public class SortingByArray<A extends Comparable<A>> {
	A []multiple;

	public SortingByArray(A [] multiple) {
		this.multiple = multiple;
	}

	public A maximum() {
		return SortingByArray.maximum(multiple);
	}

	public static <A extends Comparable<A>> A maximum(A []multiple) {
		for (int i = 0; i < multiple.length; i++) {
			for (int p = i; p < multiple.length; p++) {
				if (multiple[i].compareTo(multiple[p]) < 0) {
					A x = multiple[i];
					multiple[i] = multiple[p];
					multiple[p] = x;
				}
			}
		}
		return multiple[0];
	}

	public static void main(String[] args) {
		Float[] multiFloat = { 68.43f, 54.67f, 34.65f, 79.434f, 56.437f };
		System.out.println("The Maximum value is :" + " " + new SortingByArray<Float>(multiFloat).maximum());

	}

}
