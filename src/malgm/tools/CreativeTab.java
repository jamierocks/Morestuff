package malgm.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String label) {
        super(label);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Item.plateDiamond.shiftedIndex;
    }

}