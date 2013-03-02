package malgm.common;

import java.io.File;

import malgm.extrastuff.mod_extrastuff;
import net.minecraftforge.common.Configuration;

public class ConfigurationManager {

	public void defaultConfig(File configPath){

		Configuration cfg = new Configuration(configPath);

		cfg.load();
		
		//Blocks
		mod_morestuff.marbleID = cfg.getBlock("Marble", 250).getInt();
		mod_morestuff.volcanicRockID = cfg.getBlock("Volcanicrock", 251).getInt();
		mod_morestuff.marbleBrickID = cfg.getBlock("Marblebrick", 252).getInt();
		mod_morestuff.volcanicCobbleID = cfg.getBlock("Volcaniccobble", 253).getInt();
		mod_morestuff.volcanicBrickID = cfg.getBlock("Volcanicbrick", 254).getInt();
		mod_morestuff.whiteMetalBlockID = cfg.getBlock("Whitemetalblock", 255).getInt();
		mod_morestuff.darkMetalBlockID = cfg.getBlock("Darkmetalblock", 256).getInt();
		mod_morestuff.blueCrystalBlockID = cfg.getBlock("BCrystalB", 257).getInt();
		mod_morestuff.redCrystalBlockID = cfg.getBlock("RCrystalB", 258).getInt();
		mod_morestuff.pinkCrystalBlockID = cfg.getBlock("PCrystalB", 259).getInt();
		mod_morestuff.purpleCrystalBlockID = cfg.getBlock("PuCrystalB", 260).getInt();
		mod_morestuff.blueCrystalOreID = cfg.getBlock("BCrystalOre", 261).getInt();
		mod_morestuff.redCrystalOreID = cfg.getBlock("RCrystalOre", 262).getInt();
		mod_morestuff.pinkCrystalOreID = cfg.getBlock("PCrystalOre", 263).getInt();
		mod_morestuff.purpleCrystalOreID = cfg.getBlock("PuCrystalOre", 264).getInt();
		mod_morestuff.bCTorchID = cfg.getBlock("BCTorch", 265).getInt();
		mod_morestuff.rCTorchID = cfg.getBlock("RCTorch", 266).getInt();
		mod_morestuff.pCTorchID = cfg.getBlock("PCTorch", 267).getInt();
		mod_morestuff.puCTorchID = cfg.getBlock("PuCTorch", 268).getInt();
		mod_morestuff.saphirebID = cfg.getBlock("Saphire block", 269).getInt();
		mod_morestuff.rubybID = cfg.getBlock("Ruby block", 270).getInt();
		mod_morestuff.saphireoreID = cfg.getBlock("Saphire ore", 271).getInt();
		mod_morestuff.rubyoreID = cfg.getBlock("Ruby ore", 272).getInt();
		
		//Items
		mod_morestuff.marbleShardID = cfg.getItem("MarbleShard", 4560).getInt();
		mod_morestuff.whiteMetalID = cfg.getItem("WhiteMetal", 4561).getInt();
		mod_morestuff.volcanicShardID = cfg.getItem("VolcanicShard", 4562).getInt();
		mod_morestuff.darkMetalID = cfg.getItem("DarkMetal", 4563).getInt();
		mod_morestuff.mixedMetalID = cfg.getItem("MixedMetal", 4564).getInt();
		mod_morestuff.mixedShardID = cfg.getItem("MixedShard", 4565).getInt();
		mod_morestuff.diamondQuarterID = cfg.getItem("DiamondQuarter", 4566).getInt();
		mod_morestuff.diamondHalfID = cfg.getItem("DiamondHalf", 4567).getInt();
		// mod_morestuff.pocketCraftingID = cfg.getItem("PocketCrafting", 4568).getInt();
		mod_morestuff.blueCrystalID = cfg.getItem("BCrytsal", 4569).getInt();
		mod_morestuff.redCrystalID = cfg.getItem("RCrytsal", 4570).getInt();
		mod_morestuff.pinkCrystalID = cfg.getItem("PCrytsal", 4571).getInt();
		mod_morestuff.purpleCrystalID = cfg.getItem("PuCrytsal", 4572).getInt();
		mod_morestuff.saphireID = cfg.getItem("Saphire", 4573).getInt();
		mod_morestuff.rubyID = cfg.getItem("Ruby", 4574).getInt();

		cfg.save();


	}
}