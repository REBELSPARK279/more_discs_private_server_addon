package net.rebelspark.more_discs_rebelspark_addon.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.Models;
import net.rebelspark.more_discs_rebelspark_addon.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


      }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.BANANA_PANCAKES_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOOYAH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARKER_THAN_BLOOD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVERY_END_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEARTBEAT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ISOLATION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOVERS_ON_THE_SUN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUDICROUS_SPEED_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAKHOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAPS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELODY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORE_THAN_YOU_KNOW_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_HUM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TREMOR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TURBO_PENGUIN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.YAHTZEE_MUSIC_DISC, Models.GENERATED);

    }
}