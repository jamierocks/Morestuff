package malgm.common;

import java.io.File;

import malgm.all.Versions;
import malgm.common.blocks.*;
import malgm.common.items.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.*;
import net.minecraft.entity.player.EntityPlayer;

@Mod(modid = Reference.MOD_ID, name = Reference.Name, version = Versions.VersionMS)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_morestuff {
	
	@Instance(Reference.MOD_ID)
    public static mod_morestuff instance;
	
	//Variables for configuration file
	protected static File configPath;
	protected static int marbleID, volcanicRockID, marbleBrickID, volcanicCobbleID, volcanicBrickID, whiteMetalBlockID, darkMetalBlockID, blueCrystalBlockID, redCrystalBlockID, pinkCrystalBlockID, purpleCrystalBlockID, blueCrystalOreID, redCrystalOreID, pinkCrystalOreID, purpleCrystalOreID, bCTorchID, rCTorchID, pCTorchID, puCTorchID, saphirebID, rubybID, saphireoreID, rubyoreID;
	protected static int marbleShardID, whiteMetalID, volcanicShardID, darkMetalID, mixedMetalID, mixedShardID, diamondQuarterID, diamondHalfID, pocketCraftingID, blueCrystalID, redCrystalID, pinkCrystalID, purpleCrystalID, saphireID, rubyID;
	
	//Variables for Blocks and Items
	public static Block Marble;
	public static Block Volcanicrock;
	public static Block MarbleBrick;
	public static Block Volcaniccobble;
	public static Block Volcanicbrick;
	public static Block WhiteMetalBlock;
	public static Block DarkMetalBlock;
	public static Block BCrystalB;
	public static Block RCrystalB;
	public static Block PCrystalB;
	public static Block PuCrystalB;
	public static Block BCrystalOre;
	public static Block RCrystalOre;
	public static Block PCrystalOre;
	public static Block PuCrystalOre;
	public static Block BCTorch;
	public static Block RCTorch;
	public static Block PCTorch;
	public static Block PuCTorch;
	public static Block Saphireb;
	public static Block Rubyb;
	public static Block Saphireore;
	public static Block Rubyore;
	
	public static Item MarbleShard;
	public static Item WhiteMetal;
	public static Item VolcanicShard;
	public static Item DarkMetal;
	public static Item MixedMetal;
	public static Item MixedShard;
	public static Item DiamondQuarter;
	public static Item DiamondHalf;
	public static Item BCrystal;
	public static Item RCrystal;
	public static Item PCrystal;
	public static Item PuCrystal;
	public static Item Saphire;
	public static Item Ruby;
	
	@SidedProxy(clientSide = Reference.ProxyClient, serverSide = Reference.ProxyServer)
	public static CommonProxyMorestuff proxy;
	
	public static CreativeTabs tabsMS = new CreativeTab("MoreStuff");
	
	@PreInit
	public void preInit (FMLPreInitializationEvent event){
		// Process config stuff and get Block IDs
		configPath = event.getSuggestedConfigurationFile();
		ConfigurationManager config = new ConfigurationManager();
		config.defaultConfig(configPath);
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderThings();
		
		//Blocks
		Marble = new BlockMarble(marbleID, 0).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffmarble");
		Volcanicrock = new BlockVolcanicrock(volcanicRockID, 1).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffvolcanicrock");
		MarbleBrick = new BlockMarbleBrick(marbleBrickID, 2).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffmarblebrick");
		Volcaniccobble = new BlockVolcaniccobble(volcanicCobbleID, 3).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffvolcaniccobble");
		Volcanicbrick = new BlockVolcanicbrick(volcanicBrickID, 4).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffvolcanicbrick");
		WhiteMetalBlock = new BlockWhiteMetalBlock(whiteMetalBlockID, 5).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffwhitemetalblock");
		DarkMetalBlock = new BlockDarkMetalBlock(darkMetalBlockID, 6).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffdarkmetalblock");
		BCrystalB = new BlockBlueCrystalBlock(blueCrystalBlockID, 7).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffbluecrystalblock");
		RCrystalB = new BlockRedCrystalBlock(redCrystalBlockID, 8).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffredcrystalblock");
		PCrystalB = new BlockPinkCrystalBlock(pinkCrystalBlockID, 9).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffpinkcrystalblock");
		PuCrystalB = new BlockPurpleCrystalBlock(purpleCrystalBlockID, 10).setHardness(1.0F).setResistance(10.0F).setBlockName("morestuffpurplecrystalblock");
		BCTorch = new BlockBlueCrystalTorch(bCTorchID, 11).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffbctorch").setRequiresSelfNotify();
		RCTorch = new BlockRedCrystalTorch(rCTorchID, 12).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffrctorch").setRequiresSelfNotify();
		PCTorch = new BlockPinkCrystalTorch(pCTorchID, 13).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffpctorch").setRequiresSelfNotify();
		PuCTorch = new BlockPurpleCrystalTorch(puCTorchID, 14).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffpuctorch").setRequiresSelfNotify();
		Saphireb = new BlockSaphire(saphirebID, 15).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffsaphireb").setRequiresSelfNotify();
		Rubyb = new BlockRuby(rubybID, 48).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffrubyb").setRequiresSelfNotify();
		
		//Items
		MarbleShard = new ItemMarbleShard(marbleShardID, 16).setItemName("morestuffmarbleshard");
		WhiteMetal = new ItemWhiteMetal(whiteMetalID, 17).setItemName("morestuffwhitemetal");
		VolcanicShard = new ItemVolcanicShard(volcanicShardID, 18).setItemName("morestuffvolcanicshard");
		DarkMetal = new ItemDarkMetal(darkMetalID, 19).setItemName("morestuffdarkshard");
		MixedMetal = new ItemMixedMetal(mixedMetalID, 20).setItemName("morestuffmixedmetal");
		MixedShard = new ItemMixedShard(mixedShardID, 21).setItemName("morestuffmixedshard");
		DiamondQuarter = new ItemDiamondQuarter(diamondQuarterID, 22).setItemName("morestuffdiamondquarter");
		DiamondHalf = new ItemDiamondHalf(diamondHalfID, 23).setItemName("morestuffdiamondhalf");
		BCrystal = new ItemBlueCrystal(blueCrystalID, 24).setItemName("morestuffbluecrystal");
		RCrystal = new ItemRedCrystal(redCrystalID, 25).setItemName("morestuffredcrystal");
		PCrystal = new ItemPinkCrystal(pinkCrystalID, 26).setItemName("morestuffpinkcrystal");
		PuCrystal = new ItemPurpleCrystal(purpleCrystalID, 27).setItemName("morestuffpurplecrystal");
		Saphire = new ItemSaphire(saphireID, 28).setItemName("morestuffsaphire");
		Ruby = new ItemRuby(rubyID, 29).setItemName("morestuffruby");
		
		//Ores
		BCrystalOre = new BlockBlueCrystalOre(blueCrystalOreID, 32).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffbluecrystalore");
		RCrystalOre = new BlockRedCrystalOre(redCrystalOreID, 33).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffredcrystalore");		
		PCrystalOre = new BlockPinkCrystalOre(pinkCrystalOreID, 34).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffpinkcrystalore");
		PuCrystalOre = new BlockPurpleCrystalOre(purpleCrystalOreID, 35).setHardness(1.5F).setResistance(10.0F).setBlockName("morestuffpurplecrystalore");
		Saphireore = new BlockSaphireOre(saphireoreID, 36).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffsaphireore").setRequiresSelfNotify();
		Rubyore = new BlockRubyOre(rubyoreID, 37).setHardness(1.0F).setLightValue(1F).setBlockName("morestuffrubyore").setRequiresSelfNotify();
		
		//Creative tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.MoreStuff", "en_US", Reference.creativetab);
		
		//Registering blocks
		Imports.registerblocks();
		
		// Define world generation
		GameRegistry.registerWorldGenerator(new WorldGenerationVolcanicRock());
		GameRegistry.registerWorldGenerator(new WorldGenerationMarble());
		GameRegistry.registerWorldGenerator(new WorldGeneratorBCrystalOre());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRCrystalOre());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPCrystalOre());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPuCrystalOre());
		
		//Adding in-game names
		Imports.ingamenames();
		
		//Adding recipes
		Recipes.recipes();
		
		//Smelting Recipes
		GameRegistry.addSmelting(Volcaniccobble.blockID, new ItemStack(Volcanicrock), 0.3F);
		GameRegistry.addSmelting(MarbleShard.shiftedIndex, new ItemStack(WhiteMetal), 0.5F);
		GameRegistry.addSmelting(VolcanicShard.shiftedIndex, new ItemStack(DarkMetal), 0.5F);
		GameRegistry.addSmelting(MixedShard.shiftedIndex, new ItemStack(MixedMetal), 0.3F);
		GameRegistry.addSmelting(Saphireore.blockID, new ItemStack(Saphire), 0.5F);
		GameRegistry.addSmelting(Rubyore.blockID, new ItemStack(Ruby), 0.5F);
		GameRegistry.addSmelting(BCrystalOre.blockID, new ItemStack(BCrystal), 0.5F);
		GameRegistry.addSmelting(RCrystalOre.blockID, new ItemStack(RCrystal), 0.5F);
		GameRegistry.addSmelting(PCrystalOre.blockID, new ItemStack(PCrystal), 0.5F);
		GameRegistry.addSmelting(PuCrystalOre.blockID, new ItemStack(PuCrystal), 0.5F);
		
	}

}
