package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtinTest {
    @Test
    public void testGetName() {
        Artin artin = new Artin();
        assertEquals("Artin", artin.getName());
    }
}
