package net.butteredtoasts.cropmod.item;

import net.butteredtoasts.cropmod.CropMod;
import net.butteredtoasts.cropmod.item.custom.BreadKnifeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CropMod.MODID);

    public static final RegistryObject<Item> BUN = ITEMS.register("bun",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BUN)));
    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BURGER)));

    public static final RegistryObject<Item> BREAD_KNIFE = ITEMS.register("bread_knife",
            () -> new BreadKnifeItem(new Item.Properties().durability(128)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}