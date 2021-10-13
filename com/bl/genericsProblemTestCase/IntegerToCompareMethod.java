package com.bl.genericsProblemTestCase;

import java.util.Scanner;

public class IntegerToCompareMethod<T extends Comparable<T>> {
	T x, y, z;
	
	 public IntegerToCompareMethod(T x, T y, T z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
	 }
	
	 public T maximum() {
		 return IntegerToCompareMethod.maximum(x, y, z);
	 }
	 
	 public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		 T max = x;
		 if(y.compareTo(max) > 0) {
			 max = y;
		 }
		 if(z.compareTo(max) > 0) {
			 max = z;
		 }
		 printMax(x, y, z, max);
		 return max;
	 }
	 
	public static int input() {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int integer = scanner.nextInt();
		return integer;
	}

	private static <T> void printMax(T x, T y, T z, T maximum) {
		// TODO Auto-generated method stub
		System.out.printf("Maximum value of %s, %s, and %s is %s\n",x ,y , z, maximum);
	}
	public static void main(String[] args) {
		int x = input();
		int y = input();
		int z = input();
		IntegerToCompareMethod.maximum(x, y, z);
	}
}
