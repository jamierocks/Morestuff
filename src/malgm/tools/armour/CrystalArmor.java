package malgm.tools.armour;

import malgm.tools.mod_moretools;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class CrystalArmor extends ItemArmor implements IArmorTextureProvider
{

        public CrystalArmor(int i, EnumArmorMaterial enumarmormaterial, int j, int k){
                super(i, enumarmormaterial, j, k);
                this.setCreativeTab(mod_moretools.tabsMT);
        }
		/*
		public String getArmorTextureFile(ItemStack itemstack)
        {
                if(itemstack.itemID == mod_moretools.helmetBCrystal.shiftedIndex || itemstack.itemID == mod_moretools.plateBCrystal.shiftedIndex || itemstack.itemID == mod_moretools.bootsBCrystal.shiftedIndex)
                {
                        return "/malgm/bcrystal_1.png";
                }
                if(itemstack.itemID == mod_moretools.legsBCrystal.shiftedIndex)
                {
                        return "/malgm/bcrystal_2.png";
                }
                return "/malgm/bcrystal_1.png";
        }
        */

		@Override
		public String getArmorTextureFile(ItemStack itemstack) {
			// TODO Auto-generated method stub
			return null;
		}

}