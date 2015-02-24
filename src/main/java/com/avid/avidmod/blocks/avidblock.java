package com.avid.avidmod.blocks;

import com.avid.avidmod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class avidblock extends Block {

    private String name = "avidblock";

    private IIcon[] icons = new IIcon[6];

    public avidblock(){

        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(Constants.MODID + "_" + name);
        setBlockTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        for (int i = 0; i < icons.length; i++) {
            icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return icons[side];
    }
}

/**
 * Created by Rhett on 2/23/2015.
 */
