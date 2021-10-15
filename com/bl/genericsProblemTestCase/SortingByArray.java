package com.bl.genericsProblemTestCase;

public class SortingByArray<A extends Comparable<A>> {
	A[] value;

	public SortingByArray(A[] value) {
		this.value = value;
	}

	public A maximum() {
		return SortingByArray.maximum(value);
	}

	public static <A extends Comparable<A>> A maximum(A[] value) {
		for (int i = 0; i < value.length; i++) {
			for (int p = i; p < value.length; p++) {
				if (value[i].compareTo(value[p]) < 0) {
					A x = value[i];
					value[i] = value[p];
					value[p] = x;
				}
			}
		}
		return value[0];
	}

	public static void main(String[] args) {
		String[] multiString = { "Cadillac", "Corvette", "Camry", "Toyota", "Honda", "Maruti", "TataMotors" };
		System.out.println("The Maximum value is :" + " " + new SortingByArray<String>(multiString).maximum());

	}

}
