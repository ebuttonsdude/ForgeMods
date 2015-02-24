package com.avid.avidmod.proxy;

import com.avid.avidmod.tileentity.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void registerTileEntities() {

        GameRegistry.registerTileEntity(TileEntitySmasher.class, TileEntitySmasher.publicName);
    }
}
