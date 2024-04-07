package net.revalorise.honeybar;

import net.fabricmc.api.ModInitializer;

import net.revalorise.honeybar.block.ModBlocks;
import net.revalorise.honeybar.item.ModItemGroups;
import net.revalorise.honeybar.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Honeybar implements ModInitializer {
	public static  final String MOD_ID = "honeybar";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModItemGroups.registerItemGroup();
		ModBlocks.registerModBlocks();

	}
}