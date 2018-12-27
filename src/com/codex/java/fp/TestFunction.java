package com.codex.java.fp;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface TestFunction<T, U, R> {

	R apply(T t, U u);

	default <V> TestFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
		Objects.requireNonNull(after);
		return (T t, U u) -> after.apply(apply(t, u));
	}
}