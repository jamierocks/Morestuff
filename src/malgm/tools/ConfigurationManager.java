package malgm.tools;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationManager {

	public void defaultConfig(File configPath){

		Configuration cfg = new Configuration(configPath);

		cfg.load();
		
		mod_moretools.helmetbcID = cfg.getItem("bc helmet", 5000).getInt();
		mod_moretools.platebcID = cfg.getItem("bc plate", 5001).getInt();
		mod_moretools.legsbcID = cfg.getItem("bc legs", 5002).getInt();
		mod_moretools.bootsbcID = cfg.getItem("bc boots", 5003).getInt();

		cfg.save();


	}
}