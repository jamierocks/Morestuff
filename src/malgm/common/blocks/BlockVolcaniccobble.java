package malgm.common.blocks;

import java.util.Random;

import malgm.common.CommonProxyMorestuff;
import malgm.common.mod_morestuff;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockVolcaniccobble extends Block {
	
	public BlockVolcaniccobble(int id, int texture) {
		super(id, texture, Material.rock);
		this.setCreativeTab(mod_morestuff.tabsMS);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mod_morestuff.Volcaniccobble.blockID;
	}
	
	public String getTextureFile()
    {
            return CommonProxyMorestuff.ITEMS;
    }

}