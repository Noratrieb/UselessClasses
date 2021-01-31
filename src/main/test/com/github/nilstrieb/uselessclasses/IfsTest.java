package com.github.nilstrieb.uselessclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.github.nilstrieb.uselessclasses.Ifs.IF;

class IfsTest {

    @Test
    void ifTest(){
        final int[] a = new int[1];

        IF(true, () -> {
            a[0] = 1;
        });

        assertEquals(1, a[0]);
    }

    @Test
    void ifElseTest(){
        final int[] a = new int[1];

        IF(false, () -> {
            a[0] = 1;
        }, () -> {
            a[0] = 2;
        });

        assertEquals(2, a[0]);
    }
}