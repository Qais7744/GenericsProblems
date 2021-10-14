package com.bl.genericsProblemTestCase;

public class RefactorTwo<A extends Comparable<A>> {
	A a, b, c;

	public RefactorTwo(A a, A b, A c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public A maximum() {
		return RefactorTwo.maximum(a, b, c);
	}

	public static <Refactor extends Comparable<Refactor>> Refactor maximum(Refactor a, Refactor b, Refactor c) {
		Refactor maximum = a;
		if (b.compareTo(maximum) > 0)
			maximum = b;
		if (c.compareTo(maximum) > 0)
			maximum = c;
		return maximum;

	}

	public static void main(String[] args) {
		int aint = 5;
		int bint = 7;
		int cint = 9;
		new RefactorTwo(aint, bint, cint).maximum();
		System.out.println("Print Maximum Number is :" + " " + new RefactorTwo(aint, bint, cint).maximum());

	}

}
