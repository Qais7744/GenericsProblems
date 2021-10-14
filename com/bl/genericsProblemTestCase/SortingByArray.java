package com.bl.genericsProblemTestCase;

public class SortingByArray<A extends Comparable<A>> {
	A[] multiple;

	public SortingByArray(A[] multiple) {
		this.multiple = multiple;
	}

	public A maximum() {
		return SortingByArray.maximum(multiple);
	}

	public static <A extends Comparable<A>> A maximum(A[] multiple) {
		for (int i = 0; i < multiple.length; i++) {
			for (int p = i; p < multiple.length; p++) {
				if (multiple[i].compareTo(multiple[p]) < 0) {
					A x = multiple[i];
					multiple[i] = multiple[p];
					multiple[p] = x;
				}
			}
		}
		SortingByArray.printMax(multiple[0]);
		return multiple[0];
	}

	private static <A> void printMax(A maximum) {
		System.out.println("Maximum number is :" + " " + maximum);
		System.out.println();
	}

	public static void main(String[] args) {
		Float[] multiFloat = { 68.43f, 54.675f, 74.65f, 79.434f, 56.437f };
		System.out.println("The Maximum value is :" + " " + new SortingByArray<Float>(multiFloat).maximum());

	}

}
