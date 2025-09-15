package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AxelTest {

    @Test
    public void testGetName() {
        Axel axel = new Axel();
        assertEquals("Axel", axel.getName());
    }
}
