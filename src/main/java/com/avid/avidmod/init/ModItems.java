package com.avid.avidmod.init;

import com.avid.avidmod.items.AvidItem;
import net.minecraft.item.Item;

public final class ModItems {

    public static Item itemAvid;

    public static void init() {

        itemAvid = new AvidItem();
    }
}
