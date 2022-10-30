package com.redrainooo.createafriend.init;

import com.redrainooo.createafriend.CreateAFriend;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateAFriend.MODID);

    public static final RegistryObject<Item> MECHANICAL_PLAYER_HEAD = ITEMS.register("mechanical_player_head",
            () -> new Item(new Item.Properties().stacksTo(1).tab(CreateAFriend.TAB)));
    public static final RegistryObject<Item> FLOPPY_DISK = ITEMS.register("floppy_disk",
            () -> new Item(new Item.Properties().stacksTo(1).tab(CreateAFriend.TAB)));
    public static final RegistryObject<Item> ADVANCED_CONTROLLER = ITEMS.register("advanced_controller",
            () -> new Item(new Item.Properties().stacksTo(1).tab(CreateAFriend.TAB)));
    public static final RegistryObject<Item> MECHANICAL_PLAYER_ITEM = ITEMS.register("mechanical_player_item",
            () -> new Item(new Item.Properties().stacksTo(1).tab(CreateAFriend.TAB)));

    //public static final TagKey<Item> MPUPGRADE = ItemTags.create()
}
