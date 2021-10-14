package com.bl.genericsProblemTestCase;

public class RefactorOne {

	public static <Refactor extends Comparable<Refactor>> Refactor maximum(Refactor a, Refactor b, Refactor c) {
		Refactor maximum = a;
		if (b.compareTo(maximum) > 0)
			maximum = b;
		if (c.compareTo(maximum) > 0)
			maximum = c;
		return maximum;

	}

	public static void main(String[] args) {
		System.out.printf("Greater Value in between %d, %d, and %d is %d\n\n", 5, 8, 9, maximum(5, 8, 9));
		System.out.printf("Greater float in betwwn %g, %g, and %g is %g\n\n", 23.567f, 12.534f, 54.658f,
				maximum(23.567f, 12.534f, 54.658f));
		System.out.printf("Greater name in between %s, %s, and %s is %s\n\n", "TataMotor", "Maruti", "Tesla",
				maximum("TataMotor", "Maruti", "Tesla"));

	}

}
