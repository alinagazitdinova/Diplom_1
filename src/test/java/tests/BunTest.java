package tests;

import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun("Плюшка", 100);
        assertEquals("Плюшка", bun.getName());
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun("Плюшка", 100);
        assertEquals(100, bun.getPrice(), 0);
    }
}