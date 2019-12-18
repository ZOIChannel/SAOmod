package com.zoi.sao;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.1.0")
public class SAOmod {

    public static Item steel_ingot;
    public static Item steel_handle;
    public static Block steel_block;
    public static Item black_ingot;
    public static Item black_handle;
    public static Block black_block;
    public static Item crystallite_ingot;
    public static Item crystallite_handle;
    public static Item red_ingot;
    public static Item red_handle;
    public static Item argentium_ingot;
    public static Item argentium_handle;
    public static Item exterded_ingot;
    public static Item flam_ingot;
    public static Item adamantite;
    public static Item oriharukon;

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
    public static Achievement get_crystallite_ingot;
    public static Achievement get_red_ingot;
    public static Achievement get_argentium_ingot;
    public static Achievement get_exterded_ingot;
    public static Achievement get_flam_ingot;
    public static Achievement get_adamantite;
    public static Achievement get_oriharukon;

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

        /*-----アイテム-----*/

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
        red_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_red_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("red ingot")
                .setTextureName("SAOmod:red_ingot");
        GameRegistry.registerItem(red_ingot, "red ingot");
        red_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("red handle")
                .setTextureName("SAOmod:red_handle");
        GameRegistry.registerItem(red_handle, "red handle");

        //argentium
        argentium_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_argentium_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("argentium ingot")
                .setTextureName("SAOmod:argentium_ingot");
        GameRegistry.registerItem(argentium_ingot, "argentium ingot");

        argentium_handle = new Item()
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("argentium handle")
                .setTextureName("SAOmod:argentium_handle");
        GameRegistry.registerItem(argentium_handle, "argentium handle");

        //exterded
        exterded_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_exterded_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("exterded ingot")
                .setTextureName("SAOmod:exterded_ingot");
        GameRegistry.registerItem(exterded_ingot, "exterded ingot");


        //flam
        flam_ingot = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_flam_ingot);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("flam ingot")
                .setTextureName("SAOmod:flam_ingot");
        GameRegistry.registerItem(flam_ingot, "flam ingot");

        //adamantite
        adamantite = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_adamantite);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("adamantite")
                .setTextureName("SAOmod:adamantite");
        GameRegistry.registerItem(adamantite, "adamantite");

        //oriharukon
        oriharukon = new Item()
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_oriharukon);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("oriharukon")
                .setTextureName("SAOmod:oriharukon");
        GameRegistry.registerItem(oriharukon, "oriharukon");




        /*-----武器-----*/




        ELUCIDATOR = EnumHelper.addToolMaterial("ELUCIDATOR", 3, 2500, 7.5F, 23.0F, 20)
                .setRepairItem(new ItemStack(SAOmod.adamantite));
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

        DARKREPULSER = EnumHelper.addToolMaterial("DARKREPULSER", 3, 2500, 7.5F, 24.0F, 20)
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

        LAMBENTLIGHT = EnumHelper.addToolMaterial("LAMBENTLIGHT", 3, 2400, 7.5F, 21.0F, 20)
                .setRepairItem(new ItemStack(SAOmod.crystallite_ingot));
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

        LIBERATOR = EnumHelper.addToolMaterial("LIBERATOR", 3, 3000, 7.5F, 32.0F, 30)
                .setRepairItem(new ItemStack(SAOmod.oriharukon));
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

        EXCALIBAR = EnumHelper.addToolMaterial("EXCALIBAR", 3, 2700, 7.5F, 31.0F, 30)
                .setRepairItem(new ItemStack(SAOmod.exterded_ingot));
        excalibar = new ItemSword(EXCALIBAR)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_excalibar);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("excalibar")
                .setTextureName("SAOmod:excalibar");
        GameRegistry.registerItem(excalibar, "excalibar");

        GRAM = EnumHelper.addToolMaterial("GRAM", 3, 3600, 7.5F, 30.5F, 20)
                .setRepairItem(new ItemStack(SAOmod.flam_ingot));
        gram = new ItemSword(GRAM)
        {
            public void onCreated(ItemStack stack, World world, EntityPlayer player) {
                player.triggerAchievement(SAOmod.get_gram);
                super.onCreated(stack, world, player);
            }
        }
                .setCreativeTab(SAOmod.SAOtab)
                .setUnlocalizedName("gram")
                .setTextureName("SAOmod:gram");
        GameRegistry.registerItem(gram, "gram");

        ANNEALBLADE = EnumHelper.addToolMaterial("ANNEALBLADE", 3, 1200, 7.5F, 4.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.steel_block));
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

        WINDFLEURET = EnumHelper.addToolMaterial("WINDFLEURET", 3, 1000, 7.5F, 16.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.argentium_ingot));
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

        GUILTYTHORN = EnumHelper.addToolMaterial("GUILTYTHORN", 3, 1200, 7.5F, 4.0F, 10)
                .setRepairItem(new ItemStack(SAOmod.red_ingot));
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
        OreDictionary.registerOre("argentium_handle", argentium_handle);
        OreDictionary.registerOre("red_ingot", red_ingot);
        OreDictionary.registerOre("red_handle", red_handle);

        //実績の追加
        AchievementPage.registerAchievementPage(new AchievementPage("SAOmod", new Achievement[]{SAOmod.get_steel_ingot, SAOmod.get_black_ingot, SAOmod.get_adamantite, SAOmod.get_oriharukon, SAOmod.get_crystallite_ingot, SAOmod.get_exterded_ingot, SAOmod.get_flam_ingot,
                SAOmod.get_argentium_ingot, SAOmod.get_red_ingot, SAOmod.get_elucidator, SAOmod.get_darkrepulser, SAOmod.get_lambentlight, SAOmod.get_liberator, SAOmod.get_excalibar, SAOmod.get_gram, SAOmod.get_annealblade, SAOmod.get_windfleuret, SAOmod.get_guiltythorn}));

        SAOmod.get_steel_ingot = new Achievement("get_steel_ingot", "get_steel_ingot", -1, 0, new ItemStack(SAOmod.steel_ingot, 0, 4), SAOmod.get_steel_ingot).setSpecial().registerStat();
        SAOmod.get_black_ingot = new Achievement("get_black_ingot", "get_black_ingot", 0, 0, new ItemStack(SAOmod.black_ingot, 0, 4), SAOmod.get_black_ingot).setSpecial().registerStat();
        SAOmod.get_adamantite = new Achievement("get_adamantite", "get_adamantite", -1, -1, new ItemStack(SAOmod.adamantite, 0, 4), SAOmod.get_adamantite).setSpecial().registerStat();
        SAOmod.get_oriharukon = new Achievement("get_oriharukon", "get_oriharukon", 0, -1, new ItemStack(SAOmod.oriharukon, 0, 4), SAOmod.get_oriharukon).setSpecial().registerStat();
        SAOmod.get_crystallite_ingot = new Achievement("get_crystallite_ingot", "get_crystallite_ingot", 1, 0, new ItemStack(SAOmod.crystallite_ingot, 0, 4), SAOmod.get_crystallite_ingot).setSpecial().registerStat();
        SAOmod.get_exterded_ingot = new Achievement("get_exterded_ingot", "get_exterded_ingot", 1, -1, new ItemStack(SAOmod.exterded_ingot, 0, 4), SAOmod.get_exterded_ingot).setSpecial().registerStat();
        SAOmod.get_flam_ingot = new Achievement("get_flam_ingot", "get_flam_ingot", 2, -1, new ItemStack(SAOmod.flam_ingot, 0, 4), SAOmod.get_flam_ingot).setSpecial().registerStat();
        SAOmod.get_argentium_ingot = new Achievement("get_argentium_ingot", "get_argentium_ingot", 2, -1, new ItemStack(SAOmod.argentium_ingot, 0, 4), SAOmod.get_argentium_ingot).setSpecial().registerStat();
        SAOmod.get_red_ingot = new Achievement("get_red_ingot", "get_red_ingot", 2, -1, new ItemStack(SAOmod.red_ingot, 0, 4), SAOmod.get_red_ingot).setSpecial().registerStat();
        SAOmod.get_elucidator = new Achievement("get_elucidator", "get_elucidator", 2, -1, new ItemStack(SAOmod.elucidator, 0, 4), SAOmod.get_elucidator).setSpecial().registerStat();
        SAOmod.get_darkrepulser = new Achievement("get_darkrepulser", "get_darkrepulser", 1, -1, new ItemStack(SAOmod.darkrepulser, 0, 4), SAOmod.get_darkrepulser).setSpecial().registerStat();
        SAOmod.get_lambentlight = new Achievement("get_lambentlight", "get_lambentlight", 2, -1, new ItemStack(SAOmod.lambentlight, 0, 4), SAOmod.get_lambentlight).setSpecial().registerStat();
        SAOmod.get_liberator = new Achievement("get_liberator", "get_liberator", 2, -1, new ItemStack(SAOmod.liberator, 0, 4), SAOmod.get_liberator).setSpecial().registerStat();
        SAOmod.get_excalibar = new Achievement("get_excalibar", "get_excalibar", 2, -1, new ItemStack(SAOmod.excalibar, 0, 4), SAOmod.get_excalibar).setSpecial().registerStat();
        SAOmod.get_gram = new Achievement("get_gram", "get_gram", 2, -1, new ItemStack(SAOmod.gram, 0, 4), SAOmod.get_gram).setSpecial().registerStat();
        SAOmod.get_annealblade = new Achievement("get_annealblade", "get_annealblade", 1, -1, new ItemStack(SAOmod.annealblade, 0, 4), SAOmod.get_annealblade).setSpecial().registerStat();
        SAOmod.get_windfleuret = new Achievement("get_windfleuret", "get_windfleuret", 2, -1, new ItemStack(SAOmod.windfleuret, 0, 4), SAOmod.get_windfleuret).setSpecial().registerStat();
        SAOmod.get_guiltythorn = new Achievement("get_guiltythorn", "get_guiltythorn", 2, -1, new ItemStack(SAOmod.guiltythorn, 0, 4), SAOmod.get_guiltythorn).setSpecial().registerStat();

        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SAOmod.steel_ingot), 0.8F);
        GameRegistry.addSmelting(SAOmod.steel_ingot, new ItemStack(SAOmod.black_ingot), 0.8F);

        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_handle), "  X", " X ", "X  ", 'X', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_block), "XXX", "XXX", "XXX", 'X', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_handle), "  X", " X ", "X  ", 'X', SAOmod.black_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_block), "XXX", "XXX", "XXX", 'X', SAOmod.black_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_ingot), "XXX", "XYX", "XXX", 'X', SAOmod.argentium_ingot, 'Y', Items.nether_star);
        GameRegistry.addRecipe(new ItemStack(SAOmod.crystallite_handle), "  X", " X ", "X  ", 'X', SAOmod.crystallite_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.red_ingot), "XXX", "XYX", "XXX", 'X', Items.redstone, 'Y', SAOmod.steel_block);
        GameRegistry.addRecipe(new ItemStack(SAOmod.red_handle), "X", "X", 'X', SAOmod.red_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.argentium_ingot), "XYX", "YZY", "XYX", 'X', Items.gold_ingot, 'Y', Items.iron_ingot, 'Z', Items.diamond);
        GameRegistry.addRecipe(new ItemStack(SAOmod.argentium_handle), "  X", " X ", "X  ", 'X', SAOmod.argentium_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.exterded_ingot), "XXX", "XYX", "XXX", 'X', Blocks.gold_block, 'Y', Items.nether_star);
        GameRegistry.addRecipe(new ItemStack(SAOmod.flam_ingot), "XXX", "XYX", "XXX", 'X', SAOmod.red_ingot, 'Y', Items.nether_star);
        GameRegistry.addRecipe(new ItemStack(SAOmod.adamantite), "XXX", "XYX", "XXX", 'X', SAOmod.black_block, 'Y', Items.nether_star);
        GameRegistry.addRecipe(new ItemStack(SAOmod.oriharukon), "XXX", "XYX", "XXX", 'X', SAOmod.steel_ingot, 'Y', Items.nether_star);

        GameRegistry.addRecipe(new ItemStack(SAOmod.elucidator), "  X", " X ", "Y  ", 'X', SAOmod.adamantite, 'Y', SAOmod.black_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.darkrepulser), "  X", " X ", "Y  ", 'X', SAOmod.crystallite_ingot, 'Y', SAOmod.argentium_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.lambentlight), " X ", " X ", " Y ", 'X', SAOmod.crystallite_ingot, 'Y', SAOmod.argentium_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.liberator), "  X", "YX ", "ZY ", 'X', SAOmod.oriharukon, 'Y', Items.nether_star, 'Z', SAOmod.steel_ingot);
        GameRegistry.addRecipe(new ItemStack(SAOmod.excalibar), "  X", "YX ", "ZY ", 'X', SAOmod.exterded_ingot, 'Y', Items.nether_star, 'Z', SAOmod.steel_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.gram), "  X", "YX ", "ZY ", 'X', SAOmod.flam_ingot, 'Y', Items.nether_star, 'Z', SAOmod.steel_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.annealblade), "  X", " X ", "Y  ", 'X', SAOmod.steel_block, 'Y', SAOmod.steel_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.windfleuret), " X ", " X ", " Y ", 'X', SAOmod.argentium_ingot, 'Y', SAOmod.argentium_handle);
        GameRegistry.addRecipe(new ItemStack(SAOmod.guiltythorn), " YX", "YXY", "ZY ", 'X', SAOmod.red_ingot, 'Y', Blocks.cactus, 'Z', SAOmod.steel_handle);
    }
    @SubscribeEvent
    public void getHeldItem(HeldItemEvent event) {
        if (event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().getItem() == SAOmod.lambentlight)
            event.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 2));
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 2));
    }

}

    //__TODO__
    //・Lanbenlight 移動速度上昇4 採掘速度上昇4
    //・WindFleure 移動速度上昇2 採掘速度上昇2
    //・guiltythorn 毒2 20s