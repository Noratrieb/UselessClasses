package com.github.nilstrieb.uselessclasses;

import java.util.function.Supplier;

/**
A bit like {@link Ifs} except a tiny bit useful
 */
public class ExpressionIf {

    public static <T> T IF(boolean condition, Supplier<T> then, Supplier<T> other) {
        if (condition) {
            return then.get();
        } else {
            return other.get();
        }
    }
}