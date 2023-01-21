package tests;

import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class BurgerTest {
    private Bun bun;
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
       // burgerIngredientOne = burger.addIngredient(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        // burger.moveIngredient(1, 1);
        System.out.println(burger.ingredients.indexOf("sour cream", "cutlet"));

    }

    @Test
    public void getPriceTest() {
    }

    @Test
    public void getReceipt() {
    }
}