package com.avid.avidmod.tileentity;

import com.avid.avidmod.avidmod;
import com.avid.avidmod.blocks.smasher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntitySmasher extends TileEntity {

    int tick = 0;

    public static final String publicName = "tileEntitySmasher";
    private String name = "tileEntitySmasher";

    public String getName() {

        return name;
    }
}
