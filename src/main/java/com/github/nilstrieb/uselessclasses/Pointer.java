package com.github.nilstrieb.uselessclasses;

/**
 * We did it, pointers in Java!
 * Is basically a wrapper around a single reference. Can be used to have deep pointers, like several levels deep
 * This amazing pointer can also NOT be null, for nulls use an {@link Option} wrapper
 * Is also always safe since there is a Garbage Collector
 *
 * @param <T>
 */
public class Pointer<T> {
    private T value;

    /**
     * Create a new pointer to some object
     *
     * @param value non-null
     */
    public Pointer(T value) {
        if (value == null) {
            throw new NullPointerException("Literally a null pointer which is not allowed in my nice null safe world");
        }
        this.value = value;
    }

    /**
     * Get the value this pointer is pointer to
     *
     * @return The value
     */
    public T deref() {
        return value;
    }

    /**
     * Set the pointer value
     *
     * @param newValue non-null
     */
    public void set(T newValue) {
        if (value == null) {
            throw new NullPointerException("Literally a null pointer which is not allowed in my nice null safe world");
        }
        this.value = newValue;
    }

    /**
     * Gets a new pointer which points to this pointer for simple nesting
     *
     * @return A new pointer
     */
    public Pointer<Pointer<T>> pointToThis() {
        return new Pointer<>(this);
    }
}
