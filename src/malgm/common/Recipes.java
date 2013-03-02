package malgm.common;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
	
	public static void recipes() {
		//Recipes
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MarbleBrick, 4), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.Marble
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.Volcanicbrick, 4), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.Volcanicrock
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MarbleShard, 1), true, new Object[] {
			"##", Character.valueOf('#'), mod_morestuff.Marble
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.VolcanicShard, 1), true, new Object[] {
			"##", Character.valueOf('#'), mod_morestuff.Volcanicrock 
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MixedMetal, 1), true, new Object[] {
			"#@", Character.valueOf('#'), mod_morestuff.WhiteMetal, Character.valueOf('@'), mod_morestuff.DarkMetal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MixedMetal, 1), true, new Object[] {
			"@#", Character.valueOf('#'), mod_morestuff.WhiteMetal, Character.valueOf('@'), mod_morestuff.DarkMetal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MixedShard, 1), true, new Object[] {
			"#@", Character.valueOf('#'), mod_morestuff.MarbleShard, Character.valueOf('@'), mod_morestuff.VolcanicShard
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.MixedShard, 1), true, new Object[] {
			"@#", Character.valueOf('#'), mod_morestuff.MarbleShard, Character.valueOf('@'), mod_morestuff.VolcanicShard
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.DiamondQuarter, 1), true, new Object[] {
			"###", "#G#", "###", Character.valueOf('#'), mod_morestuff.MixedMetal, Character.valueOf('G'), Item.ingotGold
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.DiamondHalf, 1), true, new Object[] {
			"##", Character.valueOf('#'), mod_morestuff.DiamondQuarter
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.DiamondHalf, 1), true, new Object[] {
			"#", "#", Character.valueOf('#'), mod_morestuff.DiamondQuarter
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.diamond, 1), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.DiamondQuarter
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.diamond, 1), true, new Object[] {
			"##", Character.valueOf('#'), mod_morestuff.DiamondHalf
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.diamond, 1), true, new Object[] {
			"#", "#", Character.valueOf('#'), mod_morestuff.DiamondHalf
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.WhiteMetalBlock, 1), true, new Object[] {
			"###", "###", "###", Character.valueOf('#'), mod_morestuff.WhiteMetal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.DarkMetalBlock, 1), true, new Object[] {
			"###", "###", "###", Character.valueOf('#'), mod_morestuff.DarkMetal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.DarkMetal, 9), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.DarkMetalBlock
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.WhiteMetal, 9), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.WhiteMetalBlock
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.BCrystalB, 1), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.BCrystal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.RCrystalB, 1), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.RCrystal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PCrystalB, 1), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.PCrystal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PuCrystalB, 1), true, new Object[] {
			"##", "##", Character.valueOf('#'), mod_morestuff.PuCrystal
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.BCrystal, 4), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.BCrystalB
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.RCrystal, 4), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.RCrystalB
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PCrystal, 4), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.PCrystalB
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PuCrystal, 4), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.PuCrystalB
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.BCTorch, 2), true, new Object[] {
			"#", "S", Character.valueOf('#'), mod_morestuff.BCrystal, Character.valueOf('S'), Item.stick
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.RCTorch, 2), true, new Object[] {
			"#", "S", Character.valueOf('#'), mod_morestuff.RCrystal, Character.valueOf('S'), Item.stick
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PCTorch, 2), true, new Object[] {
			"#", "S", Character.valueOf('#'), mod_morestuff.PCrystal, Character.valueOf('S'), Item.stick
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.PuCTorch, 2), true, new Object[] {
			"#", "S", Character.valueOf('#'), mod_morestuff.PuCrystal, Character.valueOf('S'), Item.stick
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.Saphireb, 1), true, new Object[] {
			"###", "###", "###", Character.valueOf('#'), mod_morestuff.Saphire
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.Rubyb, 1), true, new Object[] {
			"###", "###", "###", Character.valueOf('#'), mod_morestuff.Ruby
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.Saphire, 9), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.Saphireb
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(mod_morestuff.Ruby, 9), true, new Object[] {
			"#", Character.valueOf('#'), mod_morestuff.Rubyb
		}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.ingotGold, 1), true, new Object[] {
			"###", "#G#", "###", Character.valueOf('#'), mod_morestuff.MixedMetal, Character.valueOf('G'), Item.ingotIron
		}));
	}

}
