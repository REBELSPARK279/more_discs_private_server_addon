package net.rebelspark.more_discs_rebelspark_addon.item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rebelspark.more_discs_rebelspark_addon.MoreDiscsAddon;
import net.rebelspark.more_discs_rebelspark_addon.sound.ModSounds;

import java.util.function.Consumer;

public class ModItems {

    public static final Item BANANA_PANCAKES_MUSIC_DISC = registerItem("banana_pancakes_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "banana_pancakes_music_disc"))).jukeboxPlayable(ModSounds.BANANA_PANCAKES_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item BE_GOOD_MUSIC_DISC = registerItem("be_good_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "be_good_music_disc"))).jukeboxPlayable(ModSounds.BE_GOOD_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item BOOYAH_MUSIC_DISC = registerItem("booyah_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "booyah_music_disc"))).jukeboxPlayable(ModSounds.BOOYAH_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item DARKER_THAN_BLOOD_MUSIC_DISC = registerItem("darker_than_blood_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "darker_than_blood_music_disc"))).jukeboxPlayable(ModSounds.DARKER_THAN_BLOOD_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item EVERY_END_MUSIC_DISC = registerItem("every_end_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "every_end_music_disc"))).jukeboxPlayable(ModSounds.EVERY_END_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item HEARTBEAT_MUSIC_DISC = registerItem("heartbeat_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "heartbeat_music_disc"))).jukeboxPlayable(ModSounds.HEARTBEAT_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item ISOLATION_MUSIC_DISC = registerItem("isolation_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "isolation_music_disc"))).jukeboxPlayable(ModSounds.ISOLATION_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item LOVERS_ON_THE_SUN_MUSIC_DISC = registerItem("lovers_on_the_sun_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "lovers_on_the_sun_music_disc"))).jukeboxPlayable(ModSounds.LOVERS_ON_THE_SUN_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item LUDICROUS_SPEED_MUSIC_DISC = registerItem("ludicrous_speed_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "ludicrous_speed_music_disc"))).jukeboxPlayable(ModSounds.LUDICROUS_SPEED_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item MAKHOR_MUSIC_DISC = registerItem("makhor_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "makhor_music_disc"))).jukeboxPlayable(ModSounds.MAKHOR_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item MAPS_MUSIC_DISC = registerItem("maps_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "maps_music_disc"))).jukeboxPlayable(ModSounds.MAPS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item MELODY_MUSIC_DISC = registerItem("melody_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "melody_music_disc"))).jukeboxPlayable(ModSounds.MELODY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item MORE_THAN_YOU_KNOW_MUSIC_DISC = registerItem("more_than_you_know_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "more_than_you_know_music_disc"))).jukeboxPlayable(ModSounds.MORE_THAN_YOU_KNOW_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item NOISE_MUSIC_DISC = registerItem("noise_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "noise_music_disc"))).jukeboxPlayable(ModSounds.NOISE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item OBSESSED_MUSIC_DISC = registerItem("obsessed_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "obsessed_music_disc"))).jukeboxPlayable(ModSounds.OBSESSED_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item OVER_THE_LIFE_MUSIC_DISC = registerItem("over_the_life_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "over_the_life_music_disc"))).jukeboxPlayable(ModSounds.OVER_THE_LIFE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item THE_HUM_MUSIC_DISC = registerItem("the_hum_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "the_hum_music_disc"))).jukeboxPlayable(ModSounds.THE_HUM_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item TREMOR_MUSIC_DISC = registerItem("tremor_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "tremor_music_disc"))).jukeboxPlayable(ModSounds.TREMOR_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item TURBO_PENGUIN_MUSIC_DISC = registerItem("turbo_penguin_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "turbo_penguin_music_disc"))).jukeboxPlayable(ModSounds.TURBO_PENGUIN_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item TURBO_STRAWBERRY_MUSIC_DISC = registerItem("turbo_strawberry_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "turbo_strawberry_music_disc"))).jukeboxPlayable(ModSounds.TURBO_STRAWBERRY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});

    public static final Item YAHTZEE_MUSIC_DISC = registerItem("yahtzee_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID,
                    "yahtzee_music_disc"))).jukeboxPlayable(ModSounds.YAHTZEE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark_addon.all"));}});





















    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreDiscsAddon.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreDiscsAddon.LOGGER.info("Mod items for " + MoreDiscsAddon.MOD_ID + " are being registered!");


    }
}