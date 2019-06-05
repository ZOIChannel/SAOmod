package com.zoi.sao;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;





@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.0.2")
public class SAOmod {

    public static Item steel_ingot;
    public static Item black_ingot;
    public static Item crystallite_ingot;
    public static Item steel_handle;
    public static Item black_handle;
    public static Item crystallite_handle;
    public static Item red_handle;

    public static ToolMaterial ELUCIDATOR;
    public static Item elucidator;
    public static ToolMaterial DARKREPULSER;
    public static Item darkrepulser;
    public static ToolMaterial LAMBENTLIGHT;
    public static Item lambentlight;




    public static CreativeTabs SAOtab = new SAOtab("SAOtab");




    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        steel_ingot = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("steel ingot")
                .setTextureName("SAOmod:steel_ingot");
        GameRegistry.registerItem(steel_ingot, "steel ingot");

        black_ingot = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("black ingot")
                .setTextureName("SAOmod:black_ingot");
        GameRegistry.registerItem(black_ingot, "black ingot");

        crystallite_ingot = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("crystallite ingot")
                .setTextureName("SAOmod:crystallite_ingot");
        GameRegistry.registerItem(crystallite_ingot, "crystallite ingot");

        steel_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("steel handle")
                .setTextureName("SAOmod:steel_handle");
        GameRegistry.registerItem(steel_handle, "steel handle");

        black_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("black handle")
                .setTextureName("SAOmod:black_handle");
        GameRegistry.registerItem(black_handle, "black handle");

        crystallite_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("crystallite handle")
                .setTextureName("SAOmod:crystallite_handle");
        GameRegistry.registerItem(crystallite_handle, "crystallite handle");

        red_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("red handle")
                .setTextureName("SAOmod:red_handle");
        GameRegistry.registerItem(red_handle, "red handle");






        ELUCIDATOR = EnumHelper.addToolMaterial("ELUCIDATOR", 3, 1000, 7.5F, 2.5F, 10)
                .setRepairItem(new ItemStack(Blocks.obsidian));
        elucidator = new ItemSword(ELUCIDATOR)
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("elucidator")
                .setTextureName("SAOmod:elucidator");
        GameRegistry.registerItem(elucidator, "elucidator");

        DARKREPULSER = EnumHelper.addToolMaterial("DARKREPULSER", 3, 1000, 7.5F, 2.5F, 10)
                .setRepairItem(new ItemStack(SAOmod.crystallite_ingot));
        darkrepulser = new ItemSword(DARKREPULSER)
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("darkrepulser")
                .setTextureName("SAOmod:darkrepulser");
        GameRegistry.registerItem(darkrepulser, "darkrepulser");

        LAMBENTLIGHT = EnumHelper.addToolMaterial("LAMBENTLIGHT", 3, 1000, 7.5F, 2.5F, 10)
                .setRepairItem(new ItemStack(Items.diamond));
        lambentlight = new ItemSword(LAMBENTLIGHT)
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("lambentlight")
                .setTextureName("SAOmod:lambentlight");
        GameRegistry.registerItem(lambentlight, "lambentlight");






    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SAOmod.steel_ingot), 0.8F);
        GameRegistry.addSmelting(SAOmod.steel_ingot, new ItemStack(SAOmod.black_ingot), 0.8F);

        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_ingot), "YXY", "XZX", "YXY", 'X', Items.gold_ingot, 'Y', Items.iron_ingot, 'Z', Items.diamond);
        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_handle), "  X", " X ", "X  ", 'X', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_handle), "  X", " X ", "X  ", 'X', SAOmod.black_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_handle), "  X", " X ", "X  ", 'X', SAOmod.crystallite_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.red_handle), "  X", " X ", "Y  ", 'X', Blocks.cactus, 'Y', SAOmod.steel_ingot);

    }
}
