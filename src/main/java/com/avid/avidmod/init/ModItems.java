package com.avid.avidmod.init;

import com.avid.avidmod.items.AvidItem;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemPickaxe;

public final class ModItems {

    public static ItemPickaxe itemAvid;
    public static ToolMaterial magic = EnumHelper.addToolMaterial("magic", 3, 1000, 11.5F, 3.5F, 10);

    public static void init() {

        itemAvid = new AvidItem(magic, "itemAvid");
    }
}
