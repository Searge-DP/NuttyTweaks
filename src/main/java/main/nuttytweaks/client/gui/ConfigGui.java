package main.nuttytweaks.client.gui;

import main.nuttytweaks.ConfigHandler;
import main.nuttytweaks.util.TextHelper;
import net.minecraft.client.gui.GuiScreen;
import tterrag.core.api.common.config.IConfigHandler;
import tterrag.core.client.config.BaseConfigGui;

public class ConfigGui extends BaseConfigGui {
	public ConfigGui(GuiScreen parentScreen) {
		super(parentScreen);
	}

	@Override
	protected IConfigHandler getConfigHandler() {
		return ConfigHandler.INSTANCE;
	}

	@Override
	protected String getTitle() {
		return TextHelper.localize("config.nuttytweaks.title");
	}
}