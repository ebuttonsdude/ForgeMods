package com.avid.avidmod.init;

import com.avid.avidmod.blocks.blockofish;
import com.avid.avidmod.blocks.smasher;
import net.minecraft.block.Block;

/**
 * Created by Rhett on 2/23/2015.
 */
public final class ModBlocks {
    public static Block avidblock;
    public static Block blockofish;
    public static Block smasher;

    public static void init(){

        avidblock = new com.avid.avidmod.blocks.avidblock();
        blockofish = new com.avid.avidmod.blocks.blockofish();
        smasher = new com.avid.avidmod.blocks.smasher();
    }
}
