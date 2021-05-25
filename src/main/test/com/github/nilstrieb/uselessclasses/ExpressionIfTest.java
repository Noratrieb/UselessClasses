package com.github.nilstrieb.uselessclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.nilstrieb.uselessclasses.ExpressionIf.*;

class ExpressionIfTest {

    @Test
    void normal() {
        String result = IF(1 == 1, () -> "Hallo", () -> "Nein");
        assertEquals("Hallo", result);
    }

}