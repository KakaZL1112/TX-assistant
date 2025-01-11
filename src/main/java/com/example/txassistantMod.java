package com.example;

import com.example.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class txassistantMod implements ModInitializer {
	public static final String MOD_ID = "txassistant";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.initialize();
	}
}