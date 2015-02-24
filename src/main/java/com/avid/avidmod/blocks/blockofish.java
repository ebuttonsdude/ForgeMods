package com.avid.avidmod.blocks;

import com.avid.avidmod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockofish extends Block {

    private String name = "blockofish";

    public blockofish(){

        super(Material.iron);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setBlockName(Constants.MODID + "_" + name);
        setBlockTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
    }
}

/**
 * Created by Rhett on 2/23/2015.
 */
