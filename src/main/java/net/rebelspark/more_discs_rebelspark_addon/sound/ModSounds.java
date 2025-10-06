package net.rebelspark.more_discs_rebelspark_addon.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.rebelspark.more_discs_rebelspark_addon.MoreDiscsAddon;

public class ModSounds {



    public static final SoundEvent BANANA_PANCAKES = registerSoundEvent("banana_pancakes");
    public static final RegistryKey<JukeboxSong> BANANA_PANCAKES_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "banana_pancakes"));

    public static final SoundEvent BOOYAH = registerSoundEvent("booyah");
    public static final RegistryKey<JukeboxSong> BOOYAH_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "booyah"));

    public static final SoundEvent DARKER_THAN_BLOOD = registerSoundEvent("darker_than_blood");
    public static  final RegistryKey<JukeboxSong> DARKER_THAN_BLOOD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "darker_than_blood"));

    public static final SoundEvent EVERY_END = registerSoundEvent("every_end");
    public static  final RegistryKey<JukeboxSong> EVERY_END_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "every_end"));

    public static final SoundEvent HEARTBEAT = registerSoundEvent("heartbeat");
    public static  final RegistryKey<JukeboxSong> HEARTBEAT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "heartbeat"));

    public static final SoundEvent ISOLATION = registerSoundEvent("isolation");
    public static  final RegistryKey<JukeboxSong> ISOLATION_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "isolation"));

    public static final SoundEvent LOVERS_ON_THE_SUN = registerSoundEvent("lovers_on_the_sun");
    public static  final RegistryKey<JukeboxSong> LOVERS_ON_THE_SUN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "lovers_on_the_sun"));

    public static final SoundEvent LUDICROUS_SPEED = registerSoundEvent("ludicrous_speed");
    public static  final RegistryKey<JukeboxSong> LUDICROUS_SPEED_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "ludicrous_speed"));

    public static final SoundEvent MAKHOR = registerSoundEvent("makhor");
    public static final RegistryKey<JukeboxSong> MAKHOR_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "makhor"));

    public static final SoundEvent MAPS = registerSoundEvent("maps");
    public static final RegistryKey<JukeboxSong> MAPS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "maps"));

    public static final SoundEvent MELODY = registerSoundEvent("melody");
    public static final RegistryKey<JukeboxSong> MELODY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "melody"));

    public static final SoundEvent MORE_THAN_YOU_KNOW = registerSoundEvent("more_than_you_know");
    public static final RegistryKey<JukeboxSong> MORE_THAN_YOU_KNOW_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "more_than_you_know"));

    public static final SoundEvent OVER_THE_LIFE = registerSoundEvent("over_the_life");
    public static final RegistryKey<JukeboxSong> OVER_THE_LIFE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "over_the_life"));

    public static final SoundEvent THE_HUM = registerSoundEvent("the_hum");
    public static final RegistryKey<JukeboxSong> THE_HUM_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "the_hum"));

    public static final SoundEvent TREMOR = registerSoundEvent("tremor");
    public static final RegistryKey<JukeboxSong> TREMOR_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "tremor"));

    public static final SoundEvent TURBO_PENGUIN = registerSoundEvent("turbo_penguin");
    public static final RegistryKey<JukeboxSong> TURBO_PENGUIN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "turbo_penguin"));

    public static final SoundEvent YAHTZEE = registerSoundEvent("yahtzee");
    public static final RegistryKey<JukeboxSong> YAHTZEE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MoreDiscsAddon.MOD_ID, "yahtzee"));




    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MoreDiscsAddon.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        MoreDiscsAddon.LOGGER.info("Mod Sounds for " + MoreDiscsAddon.MOD_ID + " are being registered.");
    }
}
