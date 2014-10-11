package main.nuttytweaks.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import main.nuttytweaks.ModInformation;
import main.nuttytweaks.util.TextHelper;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

import static main.nuttytweaks.ConfigHandler.*;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(parentScreen), ModInformation.ID, false, false, TextHelper.localize("gui." + ModInformation.ID + ".config.title"));
	}

	@SuppressWarnings("rawtypes")
	private static List<IConfigElement> getConfigElements(GuiScreen parent) {
		List<IConfigElement> list = new ArrayList<IConfigElement>();

		// adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we.
		list.add(new ConfigElement<ConfigCategory>(config.getCategory(exUTweaks.toLowerCase())));
		list.add(new ConfigElement<ConfigCategory>(config.getCategory(tiCoTweaks.toLowerCase())));
		list.add(new ConfigElement<ConfigCategory>(config.getCategory(gravestoneTweaks.toLowerCase())));
		list.add(new ConfigElement<ConfigCategory>(config.getCategory(menagerieTweaks.toLowerCase())));
		list.add(new ConfigElement<ConfigCategory>(config.getCategory(mCropsTweaks.toLowerCase())));

		return list;
	}
}