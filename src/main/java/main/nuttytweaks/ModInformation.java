package main.nuttytweaks;

/*
 * Basic information your mod depends on.
 */

import tterrag.core.TTCore;

public class ModInformation {

	public static final String NAME = "Nutty Tweaks";
	public static final String ID = "nuttytweaks";
	public static final String CHANNEL = "NuttyTweaks";
	public static final String DEPEND = "required-after:" + TTCore.MODID + ";" + "required-after:" + "recipetweakingcore" + ";" + "required-after:NotEnoughItems;";
	public static final String VERSION = "0.0.0";
	public static final String CLIENTPROXY = "main.nuttytweaks.proxies.ClientProxy";
	public static final String COMMONPROXY = "main.nuttytweaks.proxies.CommonProxy";
	public static final String GUIFACTORY = "main.nuttytweaks.client.gui.ConfigGuiFactory";
}
