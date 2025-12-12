package net.raul.mccourse.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.raul.mccourse.Blocks.ModBlocks;
import net.raul.mccourse.MCCourseMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUGILITE.get())).title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SUGILITE.get());
                        output.accept(ModItems.RAW_SUGILITE.get());

                        output.accept(ModBlocks.SUGILITE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_SUGILITE_ORE.get());
                        output.accept(ModBlocks.SUGILITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_SUGILITE_ORE.get());
                        output.accept(ModBlocks.NETHER_SUGILITE_ORE.get());
                        output.accept(ModBlocks.RAW_SUGILITE_BLOCK.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
