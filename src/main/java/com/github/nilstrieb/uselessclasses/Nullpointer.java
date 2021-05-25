package com.github.nilstrieb.uselessclasses;

/**
 * Just like {@link Pointer} but Nullable. And always null
 * @param <T>
 */
public class Nullpointer<T> {

    /**
     * Create a new Nullpointer with a value.
     * @param value Should be null
     */
    @SuppressWarnings("unused")
    public Nullpointer(T value) {
    }

    /**
     * Dereference the Nullpointer
     * @return nothing ever
     */
    public T deref() {
        throw new NullPointerException("yeah this is a nullpointer what a surprise");
    }
}
