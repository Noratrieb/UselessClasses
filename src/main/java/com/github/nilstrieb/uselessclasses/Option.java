package com.github.nilstrieb.uselessclasses;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Like {@link java.util.Optional} but a bit different and worse
 * Terminology derived from Rusts Option enum which is superior in every way to Javas {@link java.util.Optional}
 *
 * @param <T>
 */
public class Option<T> {
    private final T some;

    private Option(T value) {
        this.some = value;
    }

    /**
     * Construct a new Option from a Value, will be none if it is nulls
     *
     * @param value The value
     * @param <V>   Any Type
     * @return A new Option
     */
    public static <V> Option<V> of(V value) {
        return new Option<>(value);
    }

    public boolean isPresent() {
        return some != null;
    }

    /**
     * Construct an empty Option
     *
     * @param <V> Any Type
     * @return A new Option with none
     */
    public static <V> Option<V> none() {
        return new Option<>(null);
    }

    /**
     * Map the Value inside the Optional
     *
     * @param function The operation
     * @param <V>      The new Type
     * @return A new Optional
     */
    public <V> Option<V> map(Function<? super T, V> function) {
        if (isPresent()) {
            return Option.of(function.apply(some));
        } else {
            return Option.none();
        }
    }

    /**
     * Get the value, throws an Exception if no value is present
     *
     * @return the value
     */
    public T unwrap() {
        if (isPresent()) {
            return some;
        } else {
            throw new NoSuchElementException("Tried unwrapping none");
        }
    }

    /**
     * Get the value, throws an Exception with a message if no value is present
     *
     * @param msg The error message
     * @return the value
     */
    public T expect(String msg) {
        if (isPresent()) {
            return some;
        } else {
            throw new NoSuchElementException("Tried unwrapping none: " + msg);
        }
    }

    /**
     * If the value is present, get the value, else get the supplied argument.
     * Is lazy
     *
     * @param alternative The other value
     * @return A non-null value
     */
    public T getOrElse(Supplier<T> alternative) {
        if (isPresent()) {
            return some;
        } else {
            return alternative.get();
        }
    }

    /**
     * If the value is present, get the value, else get the supplied argument.
     * Is <b>not</b>not lazy
     *
     * @param alternative The other value
     * @return A non-null value
     */
    public T getOrElseTake(T alternative) {
        if (isPresent()) {
            return some;
        } else {
            return alternative;
        }
    }

    /**
     * Returns this if it is Some, else the other if it is Some, and this if both are None
     * @param other Another Option of the same type
     * @return An Option
     */
    public Option<T> or(Option<T> other) {
        if (isPresent()) {
            return this;
        } else if (other.isPresent()) {
            return other;
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        if (isPresent()) {
            return "Some(" + some.toString() + ")";
        } else {
            return "None";
        }
    }
}
