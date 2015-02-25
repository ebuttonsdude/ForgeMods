package com.avid.avidmod.items;

import com.avid.avidmod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class AvidItem extends ItemPickaxe {

    public AvidItem(ToolMaterial material, String name) {

        super(material);
        setUnlocalizedName(Constants.MODID + "_" + name);
        setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabCombat);
    }
}
