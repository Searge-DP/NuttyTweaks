package main.nuttytweaks;

import tterrag.core.common.config.AbstractConfigHandler;

public class ConfigHandler extends AbstractConfigHandler {

	public static final ConfigHandler INSTANCE = new ConfigHandler();

	private ConfigHandler() {
		super(ModInformation.ID);
	}

	// Categories
	public static final String tiCoTweaks = "tinker's construct";
	public static final String exUTweaks = "extrautilities";
	public static final String mCropsTweaks = "magical crops";
	public static final String gravestoneTweaks = "gravestones";
	public static final String menagerieTweaks = "dark menagerie";
	public static final String bopTweaks = "biomes o' plenty";

	// Options
	public static boolean nerfAngelRings= true;
	public static boolean addGreenHeartRecipe = true;
	public static boolean removeT4EssenceArmorRecipe = true;
	public static boolean nerfGSSpawnerRecipes = true;
	public static boolean addDarkMenagerieMobDrops = true;
	public static boolean disableBoPMudPickaxe = true;

	@Override
	protected void init() {
		addSection(tiCoTweaks, tiCoTweaks, "Tweaks to Tinker's Construct");
		addSection(exUTweaks, exUTweaks, "Tweaks to Extra Utilities");
		addSection(mCropsTweaks, mCropsTweaks, "Tweaks to Magical Crops");
		addSection(gravestoneTweaks, gravestoneTweaks, "Tweaks to Gravestones");
		addSection(menagerieTweaks, menagerieTweaks, "Tweaks to Dark Menagerie");
		addSection(bopTweaks, bopTweaks, "Tweaks to Biomes O' Plenty");
	}

	@Override
	protected void reloadNonIngameConfigs() {

		activateSection(exUTweaks);
		nerfAngelRings = getValue("nerfAngelRings", "Make the Angel Rings expensive to match other mod's flight abilities.", nerfAngelRings, RestartReqs.REQUIRES_MC_RESTART);

		activateSection(tiCoTweaks);
		addGreenHeartRecipe = getValue("addGreenHeartRecipe", "Add recipes for green hearts and cannisters.", addGreenHeartRecipe, RestartReqs.REQUIRES_MC_RESTART);

		activateSection(mCropsTweaks);
		removeT4EssenceArmorRecipe = getValue("removeT4EssenceArmorRecipe", "Remove Tier 4 Essence Armor recipe.", removeT4EssenceArmorRecipe, RestartReqs.REQUIRES_MC_RESTART);

		activateSection(gravestoneTweaks);
		nerfGSSpawnerRecipes = getValue("nerfGSSpawnerRecipes", "Makes recipe require a Nether Star.", nerfGSSpawnerRecipes, RestartReqs.REQUIRES_MC_RESTART);

		activateSection(menagerieTweaks);
		addDarkMenagerieMobDrops = getValue("addDarkMenagerieMobDrops", "The mobs are interesting but some don't drop anything. This fixes that.", addDarkMenagerieMobDrops, RestartReqs.REQUIRES_MC_RESTART);

		activateSection(bopTweaks);
		disableBoPMudPickaxe = getValue("disableBoPMudPickaxe", "Disables the Mud Pickaxe from Biomes O' Plenty which has an exploit when combined with Iguana's Tweaks.", disableBoPMudPickaxe, RestartReqs.REQUIRES_MC_RESTART);
	}

	@Override
	protected void reloadIngameConfigs() {
		// Do stuff
	}
}
