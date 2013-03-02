package malgm.common.blocks;

import java.util.Random;

import malgm.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWhiteMetalBlock extends Block {
	
	public BlockWhiteMetalBlock(int id, int texture) {
		super(id, texture, Material.iron);
		this.setCreativeTab(mod_morestuff.tabsMS);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mod_morestuff.WhiteMetalBlock.blockID;
	}
	
	public String getTextureFile()
    {
            return CommonProxyMorestuff.ITEMS;
    }

}
