package com.foxberry.anglersbounty.item;

import com.foxberry.anglersbounty.AnglersBounty;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnglersBounty.MOD_ID);

    public static final DeferredItem<Item> PLACEHOLDER = ITEMS.register("placeholder",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BOTS = ITEMS.register("seabobber",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BB = ITEMS.register("bobber_base",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}


