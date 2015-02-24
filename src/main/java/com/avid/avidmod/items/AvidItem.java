package com.avid.avidmod.items;

import com.avid.avidmod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AvidItem extends Item {

    private String name = "itemAvid";

    public AvidItem() {
        setUnlocalizedName(Constants.MODID + "_" + name);
        setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabCombat);
    }
}
