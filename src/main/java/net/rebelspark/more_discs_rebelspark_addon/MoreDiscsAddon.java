package net.rebelspark.more_discs_rebelspark_addon;

import net.fabricmc.api.ModInitializer;

import net.rebelspark.more_discs_rebelspark_addon.item.ModItemGroups;
import net.rebelspark.more_discs_rebelspark_addon.item.ModItems;
import net.rebelspark.more_discs_rebelspark_addon.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreDiscsAddon implements ModInitializer {
	public static final String MOD_ID = "more_discs_rebelspark_addon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();

	}
}