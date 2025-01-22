package com.olexyn.min.obj;

import java.util.function.Consumer;

import org.checkerframework.checker.nullness.qual.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pair<T> {

	@NonNull
	T a;
	@NonNull
	T b;

	void forEach(Consumer<? super T> action) {
		action.accept(a);
		action.accept(b);
	}

}
