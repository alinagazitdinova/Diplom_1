package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {
    private Bun bun;

    ArrayList<Object> ingredients = new ArrayList<>();
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
       burger.addIngredient(new Ingredient(IngredientType.FILLING, "tushenka", 100));
       System.out.println(burger.ingredients);
       burger.moveIngredient(0, 1);
       System.out.println(burger.ingredients);

    }

    @Test
    public void getPriceTest() {
    }

    @Test
    public void getReceipt() {
    }
}