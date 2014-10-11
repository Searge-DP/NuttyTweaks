package main.nuttytweaks;

/*
 * Creation and usage of the config file.
 */

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration config;

	// Sections to add to the config
	public static String tiCoTweaks = "Tinker's Construct";
	public static String exUTweaks = "ExtraUtilities";
	public static String mCropsTweaks = "Magical Crops";
	public static String gravestoneTweaks = "Gravestones";
	public static String menagerieTweaks = "Dark Menagerie";

	// Options in the config
	public static boolean nerfAngelRings;
	public static boolean addGreenHeartRecipe;
	public static boolean removeT4EssenceArmorRecipe;
	public static boolean nerfGSSpawnerRecipes;
	public static boolean addDarkMenagerieMobDrops;

	public static void init(File file) {
		config = new Configuration(file);

		loadConfig();
		syncConfig();
	}

	public static void loadConfig() {
		config.load();
	}

	public static void syncConfig() {

		nerfAngelRings = config.get(exUTweaks, "nerfAngelRings", true, "Make the Angel Rings expensive to match other mod's flight abilities.").getBoolean(nerfAngelRings);
		addGreenHeartRecipe = config.get(tiCoTweaks, "addGreenHeartRecipe", true, "Add recipes for green hearts and cannisters.").getBoolean(addGreenHeartRecipe);
		removeT4EssenceArmorRecipe = config.get(mCropsTweaks, "removeT4EssenceArmorRecipe", true, "Remove Tier 4 Essence Armor recipe.").getBoolean(removeT4EssenceArmorRecipe);
		nerfGSSpawnerRecipes = config.get(gravestoneTweaks, "nerfGSSpawnerRecipes", true, "Makes recipe require a Nether Star.").getBoolean(nerfGSSpawnerRecipes);
		addDarkMenagerieMobDrops = config.get(menagerieTweaks, "addDarkMenagerieMobDrops", true, "The mobs are interesting but some don't drop anything. This fixes that.").getBoolean(true);

		config.save();
	}
}
