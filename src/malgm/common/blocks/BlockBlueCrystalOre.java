package malgm.common.blocks;

import java.util.Random;

import malgm.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlueCrystalOre extends Block {
	
	public BlockBlueCrystalOre(int id, int texture) {
		super(id, texture, Material.iron);
		this.setCreativeTab(mod_morestuff.tabsMS);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mod_morestuff.BCrystal.shiftedIndex;
	}
	
	public String getTextureFile()
    {
            return CommonProxyMorestuff.ITEMS;
    }

}
