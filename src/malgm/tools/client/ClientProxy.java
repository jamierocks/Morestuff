package malgm.tools.client;

import malgm.tools.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderThings() {
		MinecraftForgeClient.preloadTexture("/malgm/moretoolstextures.png");
	}

}
