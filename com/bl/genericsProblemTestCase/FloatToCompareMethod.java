package com.bl.genericsProblemTestCase;

public class FloatToCompareMethod {

	public static float maximumFloat(Float a, Float b, Float c) {
		float maximum = a;

		if (b.compareTo(maximum) > 0) {
			maximum = b;
		}
		if (c.compareTo(maximum) > 0) {
			maximum = c;
		}
		return maximum;
	}

	public static void main(String[] args) {
		float maximumNumber = FloatToCompareMethod.maximumFloat(2.45f, 70.324f, 15.436f);
		System.out.println("The Greater Value is: " + maximumNumber);
	}

}