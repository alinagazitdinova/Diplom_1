package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Набор параметров {index}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Плюшка", 100},
                {"Булка", 30},
                {"", 0},
                {null, -10},
                {"Плююююююююююююююююююююююююююююююююююююююююююююшка", 30},
                {"45897", 20},
                {":?*())__)((**", 20},
                {"Плюшка", (float)0.7689500498789050987489},

        };
    }

    @Test
    public void testGetName() {
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun(name, price);
        assertEquals(price, bun.getPrice(), 0);
    }
}