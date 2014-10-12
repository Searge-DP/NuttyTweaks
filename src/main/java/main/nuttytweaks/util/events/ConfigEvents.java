package main.nuttytweaks.util.events;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import main.nuttytweaks.ConfigHandler;
import main.nuttytweaks.ModInformation;
import main.nuttytweaks.NuttyTweaks;
import main.nuttytweaks.util.TextHelper;
import tterrag.core.common.Handlers.Handler;
import tterrag.core.common.event.ConfigFileChangedEvent;

@Handler
public class ConfigEvents {

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.modID.equals(ModInformation.ID)) {
			ConfigHandler.syncConfig();
			NuttyTweaks.logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.config.refresh"));
		}
	}

	@SubscribeEvent
	public void onConfigFileChanged(ConfigFileChangedEvent event) {
		if (event.modID.equals(ModInformation.ID)) {
			ConfigHandler.loadConfig();
			ConfigHandler.syncConfig();
			NuttyTweaks.logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.config.refresh"));
			event.setSuccessful();
		}
	}
}
