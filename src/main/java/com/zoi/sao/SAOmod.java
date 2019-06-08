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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;





@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.0.2")
public class SAOmod {

    public static Item steel_ingot;
    public static Item steel_handle;
    public static Block steel_block;
    public static Item black_ingot;
    public static Item black_handle;
    public static Block black_block;
    public static Item crystallite_ingot;
    public static Item crystallite_handle;
    public static Item red_handle;


    public static ToolMaterial ELUCIDATOR;
    public static Item elucidator;
    public static ToolMaterial DARKREPULSER;
    public static Item darkrepulser;
    public static ToolMaterial LAMBENTLIGHT;
    public static Item lambentlight;
    public static ToolMaterial LIBERATOR;
    public static Item liberator;
    public static ToolMaterial ANNEALBLADE;
    public static Item annealblade;
    public static ToolMaterial WINDFLEURET;
    public static Item windfleuret;
    public static ToolMaterial GUILTYTHORN;
    public static Item guiltythorn;

    public static Achievement get_steel_ingot;
    public static Achievement get_black_ingot;
    public static Achievement get_crystallite_ingot;
    public static Achievement get_elucidator;
    public static Achievement get_darkrepulser;
    public static Achievement get_lambentlight;
    public static Achievement get_liberator;
    public static Achievement get_annealblade;
    public static Achievement get_windfleuret;
    public static Achievement get_guiltythorn;




    public static CreativeTabs SAOtab = new SAOtab("SAOtab");




    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        /*アイテム*/
        //steel

        steel_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_steel_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("steel ingot")
                .setTextureName("SAOmod:steel_ingot");
        GameRegistry.registerItem(steel_ingot, "steel ingot");

        steel_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("steel handle")
                .setTextureName("SAOmod:steel_handle");
        GameRegistry.registerItem(steel_handle, "steel handle");

        steel_block = new SteelBlock(Material.rock)
                .setBlockName("steel block")
                .setBlockTextureName("SAOmod:steel_block");
        GameRegistry.registerBlock(steel_block, "steel block");

        //black

        black_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_black_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("black ingot")
                .setTextureName("SAOmod:black_ingot");
        GameRegistry.registerItem(black_ingot, "black ingot");

        black_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("black handle")
                .setTextureName("SAOmod:black_handle");
        GameRegistry.registerItem(black_handle, "black handle");

        black_block = new BlackBlock(Material.rock)
                .setBlockName("black block")
                .setBlockTextureName("SAOmod:black_block");
        GameRegistry.registerBlock(black_block, "black block");

        //crystallite

        crystallite_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_crystallite_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("crystallite ingot")
                .setTextureName("SAOmod:crystallite_ingot");
        GameRegistry.registerItem(crystallite_ingot, "crystallite ingot");

        crystallite_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("crystallite handle")
                .setTextureName("SAOmod:crystallite_handle");
        GameRegistry.registerItem(crystallite_handle, "crystallite handle");

        //red

        red_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("red handle")
                .setTextureName("SAOmod:red_handle");
        GameRegistry.registerItem(red_handle, "red handle");




        /*武器*/
        //SAO

        ELUCIDATOR = EnumHelper.addToolMaterial("ELUCIDATOR", 3, 1800, 7.5F, 32.0F, 10)
                .setRepairItem(new ItemStack(Blocks.obsidian));
        elucidator = new ItemSword(ELUCIDATOR)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_elucidator);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("elucidator")
                .setTextureName("SAOmod:elucidator");
        GameRegistry.registerItem(elucidator, "elucidator");

        DARKREPULSER = EnumHelper.addToolMaterial("DARKREPULSER", 3, 1900, 7.5F, 28.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.crystallite_ingot));
        darkrepulser = new ItemSword(DARKREPULSER)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_darkrepulser);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("darkrepulser")
                .setTextureName("SAOmod:darkrepulser");
        GameRegistry.registerItem(darkrepulser, "darkrepulser");

        LAMBENTLIGHT = EnumHelper.addToolMaterial("LAMBENTLIGHT", 3, 1700, 7.5F, 24.0F, 10)
                .setRepairItem(new ItemStack(Items.diamond));
        lambentlight = new ItemSword(LAMBENTLIGHT)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_lambentlight);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("lambentlight")
                .setTextureName("SAOmod:lambentlight");
        GameRegistry.registerItem(lambentlight, "lambentlight");

        LIBERATOR = EnumHelper.addToolMaterial("LIBERATOR", 3, 2000, 7.5F, 36.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.steel_block));
        liberator = new ItemSword(LIBERATOR)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_liberator);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("liberator")
                .setTextureName("SAOmod:liberator");
        GameRegistry.registerItem(liberator, "liberator");

        ANNEALBLADE = EnumHelper.addToolMaterial("ANNEALBLADE", 3, 1400, 7.5F, 22.0F, 10)
                .setRepairItem(new ItemStack(Items.iron_ingot));
        annealblade = new ItemSword(ANNEALBLADE)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_annealblade);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("annealblade")
                .setTextureName("SAOmod:annealblade");
        GameRegistry.registerItem(annealblade, "annealblade");

        WINDFLEURET = EnumHelper.addToolMaterial("WINDFLEURET", 3, 1300, 7.5F, 20.0F, 10)
                .setRepairItem(new ItemStack(Items.iron_ingot));
        windfleuret = new ItemSword(WINDFLEURET)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_windfleuret);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("windfleuret")
                .setTextureName("SAOmod:windfleuret");
        GameRegistry.registerItem(windfleuret, "windfleuret");
        //レシピの真ん中ナニー？

        GUILTYTHORN = EnumHelper.addToolMaterial("GUILTYTHORN", 3, 1500, 7.5F, 25.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.steel_ingot));
        guiltythorn = new ItemSword(GUILTYTHORN)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_guiltythorn);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("guiltythorn")
                .setTextureName("SAOmod:guiltythorn");
        GameRegistry.registerItem(guiltythorn, "guiltythorn");



        SAOmod.get_steel_ingot = new Achievement("get_steel_ingot", "get_steel_ingot", -1, 0, new ItemStack(SAOmod.steel_ingot, 0, 4), SAOmod.get_steel_ingot).setSpecial().registerStat();


    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SAOmod.steel_ingot), 0.8F);
        GameRegistry.addSmelting(SAOmod.steel_ingot, new ItemStack(SAOmod.black_ingot), 0.8F);

        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_handle), "  X", " X ", "X  ", 'X', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_block), "XXX", "XXX", "XXX", 'X', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_handle), "  X", " X ", "X  ", 'X', SAOmod.black_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_block), "XXX", "XXX", "XXX", 'X', SAOmod.black_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_ingot), "YXY", "XZX", "YXY", 'X', Items.gold_ingot, 'Y', Items.iron_ingot, 'Z', Items.diamond);
        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_handle), "  X", " X ", "X  ", 'X', SAOmod.crystallite_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.red_handle), "  X", " X ", "Y  ", 'X', Blocks.cactus, 'Y', SAOmod.steel_ingot);

        GameRegistry.addRecipe(new ItemStack(SAOmod.elucidator), "  X", " X ", "Y  ", 'X', Blocks.obsidian, 'Y', SAOmod.black_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.darkrepulser), "  X", " X ", "Y  ", 'X', SAOmod.crystallite_ingot, 'Y', SAOmod.crystallite_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.lambentlight), " X ", " X ", " Y ", 'X', Items.diamond, 'Y', SAOmod.crystallite_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.liberator), "  X", " X ", "Y  ", 'X', SAOmod.steel_block, 'Y', SAOmod.steel_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.annealblade), "  X", " X ", "Y  ", 'X', Items.iron_ingot, 'Y', SAOmod.steel_handle);
        //GameRegistry.addRecipe(new ItemStack(SAOmod.windfleuret), "  X", " X ", "Y  ", 'X', , 'Y', );
        //--???????--?????????--???--???--????????--???????--?????????????????--????????--?????????--??????--?????--?
        GameRegistry.addRecipe(new ItemStack(SAOmod.guiltythorn), "XYX", "XYX", " Z ", 'X', Blocks.cactus, 'Y', SAOmod.steel_ingot, 'Z', SAOmod.red_handle);

    }
}
