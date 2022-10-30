package com.redrainooo.createafriend.init;

import com.redrainooo.createafriend.CreateAFriend;
import com.redrainooo.createafriend.CreateAFriend;
import com.redrainooo.createafriend.blocks.CustomModelBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateAFriend.MODID);

    public static final RegistryObject<Block> COMPUTER = register("computer",
            () -> new CustomModelBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f, 1f).requiresCorrectToolForDrops()),
                new Item.Properties().tab(CreateAFriend.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}