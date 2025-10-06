package net.rebelspark.more_discs_rebelspark_addon.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rebelspark.more_discs_rebelspark_addon.MoreDiscsAddon;

public class ModItemGroups {
    public static final ItemGroup MOD_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreDiscsAddon.MOD_ID, "mod_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BOOYAH_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.more_discs_rebelspark_addon.mod_discs"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.BANANA_PANCAKES_MUSIC_DISC);
                        entries.add(ModItems.BOOYAH_MUSIC_DISC);
                        entries.add(ModItems.DARKER_THAN_BLOOD_MUSIC_DISC);
                        entries.add(ModItems.EVERY_END_MUSIC_DISC);
                        entries.add(ModItems.ISOLATION_MUSIC_DISC);
                        entries.add(ModItems.HEARTBEAT_MUSIC_DISC);
                        entries.add(ModItems.LOVERS_ON_THE_SUN_MUSIC_DISC);
                        entries.add(ModItems.LUDICROUS_SPEED_MUSIC_DISC);
                        entries.add(ModItems.MAKHOR_MUSIC_DISC);
                        entries.add(ModItems.MAPS_MUSIC_DISC);
                        entries.add(ModItems.MELODY_MUSIC_DISC);
                        entries.add(ModItems.MORE_THAN_YOU_KNOW_MUSIC_DISC);
                        entries.add(ModItems.THE_HUM_MUSIC_DISC);
                        entries.add(ModItems.TREMOR_MUSIC_DISC);
                        entries.add(ModItems.TURBO_PENGUIN_MUSIC_DISC);
                        entries.add(ModItems.YAHTZEE_MUSIC_DISC);

                    }).build());


    public static void registerItemGroups() {
        MoreDiscsAddon.LOGGER.info("Creative mode tabs for " + MoreDiscsAddon.MOD_ID + " are being registered!");
    }
}