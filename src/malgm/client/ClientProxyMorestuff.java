package malgm.client;

import net.minecraftforge.client.MinecraftForgeClient;
import malgm.common.CommonProxyMorestuff;

public class ClientProxyMorestuff extends CommonProxyMorestuff {
	
	@Override
	public void registerRenderThings() {
		MinecraftForgeClient.preloadTexture("/malgm/morestufftextures.png");
	}

}
