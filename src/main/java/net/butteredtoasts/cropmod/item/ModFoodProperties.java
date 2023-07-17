package net.butteredtoasts.cropmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BUN = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();
    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(5)
            .saturationMod(2.0f).build();
}