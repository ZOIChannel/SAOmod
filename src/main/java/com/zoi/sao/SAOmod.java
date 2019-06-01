package com.zoi.sao;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.0.1")
public class SAOmod {

    public static Item steel_ingot;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        steel_ingot = new Item()
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("steel ingot")
                .setTextureName("SAOmod:steel ingot");
        GameRegistry.registerItem(steel_ingot, "steel ingot");
    }
}
