package com.github.nilstrieb.uselessclasses;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionTest {

    @Test
    void test() {
        Option<String> some = Option.of("hallo");
        Option<String> none = Option.none();

        assertThrows(NoSuchElementException.class, none::unwrap);
        assertEquals("hallo", some.unwrap());

        assertEquals("Ttest", none.getOrElse(() -> "Ttest"));
        assertEquals("Ttest", none.getOrElseTake("Ttest"));

        assertEquals("Some(hallo)", some.toString());
        assertEquals("None", none.toString());
    }

}