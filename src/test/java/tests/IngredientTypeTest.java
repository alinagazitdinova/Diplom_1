package tests;

import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void values() {
        assert IngredientType.FILLING != null;
    }

    @Test
    public void valueOf() {
        assert IngredientType.SAUCE != null;
    }
}