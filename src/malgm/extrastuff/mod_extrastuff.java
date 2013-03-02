package malgm.extrastuff;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;
import malgm.all.Versions;
import malgm.common.ConfigurationManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "malgm_extrastuff", name = "Extrastuff", version = Versions.VersionES)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mod_extrastuff {
	
	public static Block iAura;
	public static Block malgm;
	
	@Instance("Extrastuff")
    public static mod_extrastuff instance;
	
	@SidedProxy(clientSide = "malgm.extrastuff.CommonProxy", serverSide = "malgm.extrastuff.client.ClientProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsES = new CreativeTab("CH");
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderThings();
		
		iAura = new BlockiAura(1085, 0).setHardness(1.5F).setResistance(10.0F).setBlockName("etiaura");
		malgm = new Blockmalgm(1086, 1).setHardness(1.5F).setResistance(10.0F).setBlockName("etmalgm");
		
		//Creative tab
		LanguageRegistry.instance().addStringLocalization("itemGroup.CH", "en_US", "Community heads");
		
		ModLoader.registerBlock(iAura);
		ModLoader.addName(iAura, "MyAuraKillz");
		
		ModLoader.registerBlock(malgm);
		ModLoader.addName(malgm, "malgm");
		
		
	}

}
