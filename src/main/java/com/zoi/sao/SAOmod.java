package com.zoi.sao;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;





@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.0.1")
public class SAOmod {

    public static Item steel_ingot;
    public static Item black_ingot;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        steel_ingot = new Item()
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("steel ingot")
                .setTextureName("SAOmod:steel ingot");
        GameRegistry.registerItem(steel_ingot, "steel ingot");

        black_ingot = new Item()
                .setCreativeTab(CreativeTabs.tabMisc)
                .setUnlocalizedName("black ingot")
                .setTextureName("SAOmod:black ingot");
        GameRegistry.registerItem(black_ingot, "black ingot");
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SAOmod.steel_ingot), 0.8F);
        GameRegistry.addSmelting(SAOmod.steel_ingot, new ItemStack(SAOmod.black_ingot), 0.8F);

    }
}
