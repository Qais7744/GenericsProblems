package com.bl.genericsProblemTestCase;

import java.util.Scanner;

public class FloatToCompareMethod<T extends Comparable<T>> {
	T x, y, z;
	
	 public FloatToCompareMethod(T x, T y, T z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
	 }
	
	 public T maximum() {
		 return FloatToCompareMethod.maximum(x, y, z);
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
	 
	public static float input() {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		float value = scanner.nextFloat();
		return value;
	}

	private static <T> void printMax(T x, T y, T z, T maximum) {
		System.out.printf("Maximum value of %s, %s, and %s is %s\n",x ,y , z, maximum);
	}
	
	public static void main(String[] args) {
		float x = input();
		float y = input();
		float z = input();
		FloatToCompareMethod.maximum(x, y, z);
	}
	
}
