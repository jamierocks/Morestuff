package malgm.extrastuff.client;

import net.minecraftforge.client.MinecraftForgeClient;
import malgm.common.CommonProxyMorestuff;

public class ClientProxy extends CommonProxyMorestuff {
	
	@Override
	public void registerRenderThings() {
		MinecraftForgeClient.preloadTexture("/malgm/extrastufftextures.png");
	}

}
