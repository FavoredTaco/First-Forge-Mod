package net.colet.first_forge_mod.item;

import net.colet.first_forge_mod.FirstForgeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstForgeMod.MOD_ID);

    public static final RegistryObject<Item> OMISSITE = ITEMS.register("omissite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OMISSITE_DUST = ITEMS.register("omissite_dust",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
