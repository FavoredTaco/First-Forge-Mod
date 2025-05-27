package net.colet.first_forge_mod.item;

import net.colet.first_forge_mod.FirstForgeMod;
import net.colet.first_forge_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstForgeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TAB = CREATIVE_MODE_TABS.register("first_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OMISSITE.get()))
                    .title(Component.translatable("creativetab.first_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.OMISSITE_BLOCK.get());
                        pOutput.accept(ModBlocks.OMISSITE_DUST_BLOCK.get());
                        pOutput.accept(ModItems.OMISSITE.get());
                        pOutput.accept(ModItems.OMISSITE_DUST.get());
                        pOutput.accept(ModBlocks.OMISSITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_OMISSITE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
