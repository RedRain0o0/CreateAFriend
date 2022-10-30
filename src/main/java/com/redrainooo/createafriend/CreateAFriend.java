package com.redrainooo.createafriend;

import com.redrainooo.createafriend.init.BlockInit;
import com.redrainooo.createafriend.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(CreateAFriend.MODID)
public class CreateAFriend {
    public final static String MODID = "createafriend";

    public CreateAFriend() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.MECHANICAL_PLAYER_HEAD.get().getDefaultInstance();
        }
    };
}