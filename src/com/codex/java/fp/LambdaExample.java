package com.codex.java.fp;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class LambdaExample {

	public static void main(String[] args) {
		IntToDoubleFunction doubleFunction = time -> time;
		System.out.println(doubleFunction.applyAsDouble(10));
		Function<String , Integer> wordCount = s -> s.split(" ").length;
		System.out.println(wordCount.apply("vinoth is a legend"));
		BiFunction<String, Integer, Boolean> exceedsMaxLength = (s, maxLength) -> {
			int actualLength = s.length();
			return actualLength>maxLength;
		};
		TestFunction<String, Integer, Boolean> testFunction = (s, maxLength) -> {
			int actualLength = s.length();
			return actualLength>maxLength;
		};
		testfunctionCallpass(testFunction);
		System.out.println(exceedsMaxLength.apply("vinoth", 15));
	}

	private static void testfunctionCallpass(TestFunction<String, Integer, Boolean> exceedsMaxLength) {
		exceedsMaxLength.apply("vinoth", 6);
	}

}
