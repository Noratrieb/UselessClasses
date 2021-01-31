package com.github.nilstrieb.uselessclasses;

/**
 * When you need a way to store negative numbers
 */
public class SignedInteger {

    int n;
    boolean isNegative;

    /**
     * Create a new SignedInteger form an int (why you should do this? Why not.)
     * @param n The i n t
     */
    public SignedInteger(int n){
        isNegative = n < 0;
        this.n = Math.abs(n);
    }

    /**
     * Get the value as an int
     * @return The value
     */
    int getValue(){
        return isNegative ? -n : n;
    }

    /**
     * Set the value. Saves memory. Because the programs this is used in are so huge
     * @param n The new value
     */
    void setValue(int n){
        isNegative = n < 0;
        this.n = Math.abs(n);
    }

    /**
     * Add a new value. Can also be used to subtract something if the Parameter is negative.
     * @param n The number to be added. Can be negative to subtract.
     */
    void addValue(int n){
        this.n += isNegative ? -n : n;
        if(this.n < 0){
            isNegative = !isNegative;
            this.n = Math.abs(this.n);
        }
    }
}


