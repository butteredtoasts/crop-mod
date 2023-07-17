package net.butteredtoasts.cropmod.item;

import net.butteredtoasts.cropmod.CropMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CropMod.MODID);

    public static final RegistryObject<CreativeModeTab> CROP_TAB = CREATIVE_TABS.register("crop_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BURGER.get()))
                    .title(Component.translatable("creativetab.crop_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.BUN.get());
                        output.accept(ModItems.BURGER.get());
                        output.accept(ModItems.BREAD_KNIFE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}