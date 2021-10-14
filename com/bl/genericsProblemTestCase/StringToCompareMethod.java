package com.bl.genericsProblemTestCase;

public class StringToCompareMethod {

	public static String maximumString(String a, String b, String c) {
		String maximum = a;

		if (b.compareTo(maximum) > 0) {
			maximum = b;
		}
		if (c.compareTo(maximum) > 0) {
			maximum = c;
		}
		return maximum;
	}

	public static void main(String[] args) {
		String maximumName = StringToCompareMethod.maximumString("Apple", "Peach", "Banana");
		System.out.println("The Greater Value is: " + maximumName);
	}

}