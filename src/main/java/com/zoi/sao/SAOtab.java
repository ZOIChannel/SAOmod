package com.zoi.sao;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class SAOtab extends CreativeTabs {

    public SAOtab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return SAOmod.darkrepulser;
    }

}
