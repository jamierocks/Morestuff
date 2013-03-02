package malgm.tools;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

import malgm.all.*;
import malgm.common.mod_morestuff;
import malgm.tools.armour.CrystalArmor;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.client.*;

@Mod(modid = Reference.MOD_ID, name = Reference.Name, version = Versions.VersionMT)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_moretools {
	
	//Calling instance
	@Instance(Reference.MOD_ID)
	public static mod_moretools instance;
	
	protected static File configPath;
	protected static int helmetbcID, platebcID, legsbcID, bootsbcID;
	
	@SidedProxy(clientSide = Reference.ProxyClient, serverSide = Reference.ProxyServer)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsMT = new CreativeTab("MT");
	
	//Armour
	/*
	static EnumArmorMaterial armourBCrystal = EnumHelperClient.addArmorMaterial("BCRYSTAL", 100, new int[] {2, 7, 5, 3}, 50);
	public static final Item helmetBCrystal = (new CrystalArmor(5000, armourBCrystal, 5, 0)).setIconCoord(0, 6).setItemName("helmetTitanium");
    public static final Item plateBCrystal = (new CrystalArmor(5001, armourBCrystal, 5, 1)).setIconCoord(0, 7).setItemName("chestplateTitanium");
    public static final Item legsBCrystal = (new CrystalArmor(5002, armourBCrystal, 5, 2)).setIconCoord(0, 8).setItemName("leggingsTitanium");
    public static final Item bootsBCrystal = (new CrystalArmor(5003, armourBCrystal, 5, 3)).setIconCoord(0, 9).setItemName("bootsTitanium");
	*/
	@PreInit
	public void preInit (FMLPreInitializationEvent event){
		// Process config stuff and get Block IDs
		configPath = event.getSuggestedConfigurationFile();
		ConfigurationManager config = new ConfigurationManager();
		config.defaultConfig(configPath);
	}
	
	@Init
	public static void load(FMLInitializationEvent event) {
		
		proxy.registerRenderThings();
		
		//Creative tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.MT", "en_US", Reference.creativetab);
		/*
		//In game names
		ModLoader.addName(helmetBCrystal, "Blue Crystal helmet");
		ModLoader.addName(plateBCrystal, "Blue Crystal chestplate");
		ModLoader.addName(legsBCrystal, "Blue Crystal legs");
		ModLoader.addName(bootsBCrystal, "Blue Crystal boots");
		*/
		
	} 
	
}
