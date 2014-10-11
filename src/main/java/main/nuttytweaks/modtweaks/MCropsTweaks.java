package main.nuttytweaks.modtweaks;

import com.mark719.magicalcrops.MagicalCrops;
import main.nuttytweaks.ConfigHandler;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;

public class MCropsTweaks {

	@RecipeRemoval(requiredModids = "magicalcrops")
	public static void init() {
		if (ConfigHandler.removeT4EssenceArmorRecipe) {
			TweakingRegistry.markItemForRecipeRemoval(MagicalCrops.infusedHelmetEpicFlight, 0, TweakingAction.REMOVED, "Removed at request.");
			TweakingRegistry.markItemForRecipeRemoval(MagicalCrops.infusedPlatebodyEpicFlight, 0, TweakingAction.REMOVED, "Removed at request.");
			TweakingRegistry.markItemForRecipeRemoval(MagicalCrops.infusedLeggingsEpicFlight, 0, TweakingAction.REMOVED, "Removed at request.");
			TweakingRegistry.markItemForRecipeRemoval(MagicalCrops.infusedBootsEpicFlight, 0, TweakingAction.REMOVED, "Removed at request.");
		}
	}
}
