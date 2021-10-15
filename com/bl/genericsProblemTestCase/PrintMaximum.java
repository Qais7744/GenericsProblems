package com.bl.genericsProblemTestCase;

public class PrintMaximum<A extends Comparable<A>> {
	A []value;

	public PrintMaximum(A []value) {
		this.value = value;
	}

	public A maximum() {
		return PrintMaximum.maximum(value);
	}

	public static <A extends Comparable<A>> A maximum(A []value) {
		for (int i = 0; i < value.length; i++) {
			for (int p = i; p < value.length; p++) {
				if (value[i].compareTo(value[p]) < 0) {
					value[i] = value[p];
				}
			}
		}
		PrintMaximum.printMax(value[0]);
		return value[0];
	}

	private static <A> void printMax(A maximum) {
		System.out.println("Maximum number is :" + " " + maximum);
		System.out.println();
	}

	public static void main(String[] args) {
		Float[] multiFloat = { 56.436f, 56.6786f, 100.6589f, 23.4366f, 67.7897f, 23.5757f };
		System.out.println("The Maximum value is :" + " " + new PrintMaximum<Float>(multiFloat).maximum());

	}

}
