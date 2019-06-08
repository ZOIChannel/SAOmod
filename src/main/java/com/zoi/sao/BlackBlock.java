package com.zoi.sao;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackBlock extends Block{
    public BlackBlock(Material material) {
        super(material);
        this.setCreativeTab(SAOmod.SAOtab);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundTypeMetal);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(0.0F);

    }
}
