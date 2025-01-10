package com.ayydxn.betterfletching;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class BetterFletchingMod implements ModInitializer
{
    public static final Logger LOGGER = (Logger) LogManager.getLogger("Better Fletching");
    public static final String MOD_ID = "better-fletching";

    @Override
    public void onInitialize()
    {
        LOGGER.info("Initializing Better Fletching... (Version: {})", FabricLoader.getInstance().getModContainer(MOD_ID)
                .orElseThrow().getMetadata().getVersion().getFriendlyString());
    }
}
