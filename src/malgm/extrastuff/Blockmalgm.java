package malgm.extrastuff;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blockmalgm extends Block {
	
	public Blockmalgm(int id, int texture) {
		super(id, texture, Material.rock);
		this.setCreativeTab(mod_extrastuff.tabsES);
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mod_extrastuff.malgm.blockID;
	}
	
	public String getTextureFile()
    {
            return CommonProxy.ITEMS;
    }

}
