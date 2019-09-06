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
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.1.0")
public class SAOmod {
        public static Item steel_ingot;
        public static Item steel_handle;
        public static Block steel_block;
        public static Item black_ingot;
        public static Item black_handle;
        public static Block black_block;
        public static Item adamantite;
        public static Item oriharukon;
        public static Item crystallite_ingot;
        public static Item crystallite_handle;
        public static Item exterded_ingot;
        public static Item flam_ingot;
        public static Item argentium_ingot;
        public static Item red_steel_ingot;
        public static Item red_handle;

        public static ToolMaterial ELUCIDATOR;
        public static Item elucidator;
        public static ToolMaterial DARKREPULSER;
        public static Item darkrepulser;
        public static ToolMaterial LAMBENTLIGHT;
        public static Item lambentlight;
        public static ToolMaterial LIBERATOR;
        public static Item liberator;
        public static ToolMaterial EXCALIBAR;
        public static Item excalibar;
        public static ToolMaterial GRAM;
        public static Item gram;
        public static ToolMaterial ANNEALBLADE;
        public static Item annealblade;
        public static ToolMaterial WINDFLEURET;
        public static Item windfleuret;
        public static ToolMaterial GUILTYTHORN;
        public static Item guiltythorn;

        public static Achievement get_steel_ingot;
        public static Achievement get_black_ingot;
        public static Achievement get_adamantite;
        public static Achievement get_oriharukon;
        public static Achievement get_crystallite_ingot;
        public static Achievement get_exterded_ingot;
        public static Achievement get_flam_ingot;
        public static Achievement get_argentium_ingot;
        public static Achievement get_red_steel_ingot;
        public static Achievement get_elucidator;
        public static Achievement get_darkrepulser;
        public static Achievement get_lambentlight;
        public static Achievement get_liberator;
        public static Achievement get_excalibar;
        public static Achievement get_gram;
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
        //adamantite
        //oriharukon
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
        //exterded
        //flam
        //argentium
        //red_steel

        /*武器*/
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

        //鉱石辞書への追加
        OreDictionary.registerOre("steel_ingot", steel_ingot);
        OreDictionary.registerOre("steel_handle", steel_handle);
        OreDictionary.registerOre("steel_block", steel_block);
        OreDictionary.registerOre("black_ingot", black_ingot);
        OreDictionary.registerOre("black_handle", black_handle);
        OreDictionary.registerOre("black_block", black_block);
        OreDictionary.registerOre("adamantite", adamantite);
        OreDictionary.registerOre("oriharukon", oriharukon);
        OreDictionary.registerOre("crystallite_ingot", crystallite_ingot);
        OreDictionary.registerOre("crystallite_handle", crystallite_handle);
        OreDictionary.registerOre("exterded_ingot", exterded_ingot);
        OreDictionary.registerOre("flam_ingot", flam_ingot);
        OreDictionary.registerOre("argentium_ingot", argentium_ingot);
        OreDictionary.registerOre("red_steel_ingot", red_steel_ingot);
        OreDictionary.registerOre("red_handle", red_handle);

        //実績の追加
        SAOmod.get_steel_ingot = new Achievement("get_steel_ingot", "get_steel_ingot", -1, 0, new ItemStack(SAOmod.steel_ingot, 0, 4), SAOmod.get_steel_ingot).setSpecial().registerStat();
        SAOmod.get_black_ingot = new Achievement("get_black_ingot", "get_black_ingot", 0, 0, new ItemStack(SAOmod.black_ingot, 0, 4), SAOmod.get_black_ingot).setSpecial().registerStat();
        //SAOmod.get_adamantite = new Achievement("get_adamantite", "get_adamantite", -1, -1, new ItemStack(SAOmod.adamantite, 0, 4), SAOmod.get_adamantite).setSpecial().registerStat();
        //SAOmod.get_oriharukon = new Achievement("get_oriharukon", "get_oriharukon", 0, -1, new ItemStack(SAOmod.oriharukon, 0, 4), SAOmod.get_oriharukon).setSpecial().registerStat();
        SAOmod.get_crystallite_ingot = new Achievement("get_crystallite_ingot", "get_crystallite_ingot", 1, 0, new ItemStack(SAOmod.crystallite_ingot, 0, 4), SAOmod.get_crystallite_ingot).setSpecial().registerStat();
        //SAOmod.get_exterded_ingot = new Achievement("get_exterded_ingot", "get_exterded_ingot", 1, -1, new ItemStack(SAOmod.exterded_ingot, 0, 4), SAOmod.get_exterded_ingot).setSpecial().registerStat();
        //SAOmod.get_flam_ingot = new Achievement("get_flam_ingot", "get_flam_ingot", 2, -1, new ItemStack(SAOmod.flam_ingot, 0, 4), SAOmod.get_flam_ingot).setSpecial().registerStat();
        //SAOmod.get_argentium_ingot = new Achievement("get_argentium_ingot", "get_argentium_ingot", 2, -1, new ItemStack(SAOmod.argentium_ingot, 0, 4), SAOmod.get_argentium_ingot).setSpecial().registerStat();
        //SAOmod.get_red_steel_ingot = new Achievement("get_red_steel_ingot", "get_red_steel_ingot", 2, -1, new ItemStack(SAOmod.red_steel_ingot, 0, 4), SAOmod.get_red_steel_ingot).setSpecial().registerStat();
        //SAOmod.get_elucidator = new Achievement("get_elucidator", "get_elucidator", 2, -1, new ItemStack(SAOmod.elucidator, 0, 4), SAOmod.get_elucidator).setSpecial().registerStat();
        //SAOmod.get_darkrepulser = new Achievement("get_darkrepulser", "get_darkrepulser", 1, -1, new ItemStack(SAOmod.darkrepulser, 0, 4), SAOmod.get_darkrepulser).setSpecial().registerStat();
        //SAOmod.get_lambentlight = new Achievement("get_lambentlight", "get_lambentlight", 2, -1, new ItemStack(SAOmod.lambentlight, 0, 4), SAOmod.get_lambentlight).setSpecial().registerStat();
        //SAOmod.get_liberator = new Achievement("get_liberator", "get_liberator", 2, -1, new ItemStack(SAOmod.liberator, 0, 4), SAOmod.get_liberator).setSpecial().registerStat();
        //SAOmod.get_excalibar = new Achievement("get_excalibar", "get_excalibar", 2, -1, new ItemStack(SAOmod.excalibar, 0, 4), SAOmod.get_excalibar).setSpecial().registerStat();
        //SAOmod.get_gram = new Achievement("get_gram", "get_gram", 2, -1, new ItemStack(SAOmod.gram, 0, 4), SAOmod.get_gram).setSpecial().registerStat();
        //SAOmod.get_annealblade = new Achievement("get_annealblade", "get_annealblade", 1, -1, new ItemStack(SAOmod.annealblade, 0, 4), SAOmod.get_annealblade).setSpecial().registerStat();
        //SAOmod.get_windfleuret = new Achievement("get_windfleuret", "get_windfleuret", 2, -1, new ItemStack(SAOmod.windfleuret, 0, 4), SAOmod.get_windfleuret).setSpecial().registerStat();
        //SAOmod.get_guiltythorn = new Achievement("get_guiltythorn", "get_guiltythorn", 2, -1, new ItemStack(SAOmod.guiltythorn, 0, 4), SAOmod.get_guiltythorn).setSpecial().registerStat();
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
        GameRegistry.addRecipe(new ItemStack(SAOmod.windfleuret), " X ", " Y ", " Z ", 'X', Items.diamond, 'Y', SAOmod.steel_ingot, 'Z', SAOmod.crystallite_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.guiltythorn), "XYX", "XYX", " Z ", 'X', Blocks.cactus, 'Y', SAOmod.steel_ingot, 'Z', SAOmod.red_handle);
    }
}
