package com.github.nilstrieb.uselessclasses;

/**
 * This class adds a brand new syntax for if-statements!
 * You just need to statically import the methods
 */
public class Ifs {
    public static void IF(boolean condition, Statements onTrue) {
        IF(condition, onTrue, () -> {});
    }

    public static void IF(boolean condition, Statements onTrue, Statements onFalse) {
        if(condition){
            onTrue.execute();
        } else {
            onFalse.execute();
        }
    }

    interface Statements {
        void execute();
    }
}
