package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexTest {

    @Test
    public void testGetName() {
        Alex alex = new Alex();
        assertEquals("Alex", alex.getName());
    }
}