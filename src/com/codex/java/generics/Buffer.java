package com.codex.java.generics;

import java.util.Objects;

public class Buffer<Type> {
	private Type value;

	public Buffer(Type value) {
		this.value = value;
//		Objects.requireNonNull(value);
	}

	public Type getValue() {
		return this.value;
	}
	
	public static void main(String[] args) {
		Buffer<String> buffer = new Buffer<String>(null);
		System.out.println(buffer.getValue());
		Buffer<Integer> buffer2 = new Buffer<Integer>(10);
		System.out.println(buffer2.getValue());
	}
}
