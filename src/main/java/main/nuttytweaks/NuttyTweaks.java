package main.nuttytweaks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import main.nuttytweaks.blocks.BlockRecipeRegistry;
import main.nuttytweaks.blocks.BlockRegistry;
import main.nuttytweaks.client.gui.CreativeTabNuttyTweaks;
import main.nuttytweaks.proxies.CommonProxy;
import main.nuttytweaks.util.OreDictHandler;
import main.nuttytweaks.util.TextHelper;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tterrag.core.common.Handlers;
import tterrag.rtc.RecipeTweakingCore;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION, dependencies = ModInformation.DEPEND, guiFactory = ModInformation.GUIFACTORY)
public class NuttyTweaks {

	@SidedProxy(clientSide = ModInformation.CLIENTPROXY, serverSide = ModInformation.COMMONPROXY)
	public static CommonProxy proxy;

	public static CreativeTabs tabNuttyTweaks = new CreativeTabNuttyTweaks(ModInformation.ID + ".creativeTab");
	public static Logger logger = LogManager.getLogger(ModInformation.NAME);

	@Mod.Instance
	public static NuttyTweaks instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.INSTANCE.initialize(event.getSuggestedConfigurationFile());

		BlockRegistry.registerBlocks();
		BlockRecipeRegistry.registerBlockRecipes();
		OreDictHandler.registerOreDict();

		logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.tweaks.dotweaks"));
		Handlers.addPackage("main.nuttytweaks.util.events");
		RecipeTweakingCore.registerPackageName("main.nuttytweaks.modtweaks");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
