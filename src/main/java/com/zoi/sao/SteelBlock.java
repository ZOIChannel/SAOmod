package com.zoi.sao;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;





public class SteelBlock extends Block {
    public SteelBlock(Material material) {
        super(material);
        this.setCreativeTab(SAOmod.SAOtab);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeMetal);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(0.0F);
    }
}
