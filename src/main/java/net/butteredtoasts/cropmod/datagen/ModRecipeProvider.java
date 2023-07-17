package net.butteredtoasts.cropmod.datagen;

import net.butteredtoasts.cropmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BREAD_KNIFE.get())
                .pattern(" I")
                .pattern("S ")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                       .of(Items.IRON_INGOT).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BURGER.get())
                .pattern("BSB")
                .define('B', ModItems.BUN.get())
                .define('S', Items.COOKED_BEEF)
                .unlockedBy("has_bun", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BUN.get()).build()))
                .save(pWriter);
    }
}