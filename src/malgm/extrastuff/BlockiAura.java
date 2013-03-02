package malgm.extrastuff;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockiAura extends Block {
	
	public BlockiAura(int id, int texture) {
		super(id, texture, Material.rock);
		this.setCreativeTab(mod_extrastuff.tabsES);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mod_extrastuff.iAura.blockID;
	}
	
	public String getTextureFile()
    {
            return CommonProxy.ITEMS;
    }

}
