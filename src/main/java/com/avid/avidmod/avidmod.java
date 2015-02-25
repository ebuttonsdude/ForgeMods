package com.avid.avidmod;

/**
 * Created by Rhett on 2/23/2015.
 */
import com.avid.avidmod.init.ModBlocks;
import com.avid.avidmod.init.ModItems;
import com.avid.avidmod.lib.Constants;
import com.avid.avidmod.proxy.CommonProxy;
import com.avid.avidmod.worldgen.WorldGeneratorAvid;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)


public class avidmod {

    @SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance(Constants.MODID)
    public static avidmod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
      /** The preInit is for adding blocks, items, worldgen and much more*/
        ModBlocks.init();
        ModItems.init();
        proxy.registerTileEntities();
        GameRegistry.registerWorldGenerator(new WorldGeneratorAvid(), 1);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        /** Init is for adding TileEntities, events, renderer’s*/
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        /** Finally the postInit is for addons for other mods.*/
    }
}
