package tests;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient;

    @Test
    public void setBunsTest() {
        Bun bun = new Bun("булочка", 100);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Кептчуп", 100);
        Burger burger = new Burger();
    }

    @Test
    public void addIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        assertEquals(1, burger.ingredients.size());
        System.out.println(burger.ingredients);
    }

    @Test
    public void removeIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        burger.removeIngredient(1);
        assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void moveIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        String ingredientsBefore = burger.ingredients.toString();
        burger.moveIngredient(0, 1);
        String ingredientsAfter = burger.ingredients.toString();
        assertNotEquals(ingredientsAfter, ingredientsBefore);
    }

    @Test
    public void getPriceTest() {
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(200F);
        burger.setBuns(bun);
        float expected = 400F;
        MatcherAssert.assertThat("Wrong calculation", burger.getPrice(),
                equalTo(expected));
    }

    @Test
    public void getReceipt() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        Bun bun = new Bun("Булка", 100);
        burger.setBuns(bun);
        String receipt = burger.getReceipt();
        System.out.println(receipt);
        MatcherAssert.assertThat(burger.getReceipt(), notNullValue());
    }
}