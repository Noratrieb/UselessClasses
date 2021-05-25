package com.github.nilstrieb.uselessclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointerTest {
    @Test
    void test() {
        String s = "ja";
        String s2 = "nein";
        String s3 = "vielleicht";

        Pointer<String> p = new Pointer<>(s);
        Pointer<String> p2 = new Pointer<>(s2);
        Pointer<String> p3 = new Pointer<>(s3);

        assertEquals("nein", p2.deref());

        Pointer<Pointer<String>> pp3 = p3.pointToThis();
        assertEquals("vielleicht", pp3.deref().deref());

        pp3.set(p);
        assertEquals("ja", pp3.deref().deref());

        Pointer<String> ja = new Pointer<>(s);
        Pointer<Pointer<String>> op = ja.pointToThis();
        Pointer<Pointer<String>> np = ja.pointToThis();

        op.deref().set("lol");
        assertEquals("lol", np.deref().deref());
    }

    @Test
    void nullPointer() {
        Nullpointer<Integer> n = new Nullpointer<>(null);
        assertThrows(NullPointerException.class, n::deref);
    }

}