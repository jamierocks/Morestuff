package malgm.common.items;

import malgm.common.CommonProxyMorestuff;
import malgm.common.mod_morestuff;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPurpleCrystal extends Item {

	public ItemPurpleCrystal(int id, int texture) {
		super(id);
		this.iconIndex = texture;
		this.setCreativeTab(mod_morestuff.tabsMS);
	}
	
	public String getTextureFile() {
		return CommonProxyMorestuff.ITEMS;
	}

}
