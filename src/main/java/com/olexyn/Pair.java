package com.olexyn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Consumer;

@Getter
@Setter
@AllArgsConstructor
public class Pair<T> {

    @NonNull T a;
    @NonNull T b;


    void forEach(Consumer<? super T> action) {
        action.accept(a);
        action.accept(b);
    }

}
