package main.nuttytweaks.modtweaks;

import biomesoplenty.api.content.BOPCItems;
import main.nuttytweaks.ConfigHandler;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;

public class BoPTweaks {

	@RecipeRemoval(requiredModids = "BiomesOPlenty")
	public static void init() {
		if (ConfigHandler.disableBoPMudPickaxe) {
			TweakingRegistry.markItemForRecipeRemoval(BOPCItems.pickaxeMud, -1, TweakingRegistry.TweakingAction.REMOVED, "Removed due to exploit with", "Iguana's Tweaks.");
		}
	}
}
