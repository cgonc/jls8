package com.poc.enumextension;

public class Main {

	public static void main(String[] args) {
		double x = 100.7;
		double y = 78;

		double plus = BasicOperation.PLUS.apply(x, y);
		System.out.println("plus = " + plus);
		double minus = BasicOperation.MINUS.apply(x, y);
		System.out.println("minus = " + minus);
		double times = BasicOperation.TIMES.apply(x, y);
		System.out.println("times = " + times);
		double divide = BasicOperation.DIVIDE.apply(x, y);
		System.out.println("divide = " + divide);

		double exp = ExtendedOperation.EXP.apply(x, y);
		System.out.println("exp = " + exp);
		double remainder = ExtendedOperation.REMAINDER.apply(x, y);
		System.out.println("remainder = " + remainder);
	}
}
