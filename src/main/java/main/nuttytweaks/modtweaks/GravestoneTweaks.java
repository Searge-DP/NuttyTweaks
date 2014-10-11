package main.nuttytweaks.modtweaks;

import cpw.mods.fml.common.registry.GameRegistry;
import gravestone.core.GSBlock;
import main.nuttytweaks.ConfigHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tterrag.rtc.RecipeAddition;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;

public class GravestoneTweaks {

	@RecipeRemoval(requiredModids = "GraveStone")
	public static void init() {
		if (ConfigHandler.nerfGSSpawnerRecipes) {
			TweakingRegistry.markItemForRecipeRemoval(GSBlock.spawner, 0, TweakingAction.CHANGED, "Balanced a bit more.");
			TweakingRegistry.markItemForRecipeRemoval(GSBlock.spawner, 1, TweakingAction.CHANGED, "Balanced a bit more.");
			TweakingRegistry.markItemForRecipeRemoval(GSBlock.spawner, 2, TweakingAction.CHANGED, "Balanced a bit more.");
		}
	}

	@RecipeAddition(requiredModids = "GraveStone")
	public static void addRecipes() {

		if (ConfigHandler.nerfGSSpawnerRecipes) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GSBlock.spawner, 1, 0),
					"ECE",
					"CSC",
					"CEC",

					'C', new ItemStack(GSBlock.skullCandle, 1, 1),
					'E', new ItemStack(Items.ender_eye),
					'S', new ItemStack(Items.nether_star)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GSBlock.spawner, 1, 1),
					"ECE",
					"CSC",
					"CEC",

					'C', new ItemStack(GSBlock.skullCandle, 1, 0),
					'E', new ItemStack(Items.ender_eye),
					'S', new ItemStack(Items.nether_star)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GSBlock.spawner, 1, 2),
					"ECE",
					"CSC",
					"CEC",

					'C', new ItemStack(GSBlock.skullCandle, 1, 2),
					'E', new ItemStack(Items.ender_eye),
					'S', new ItemStack(Items.nether_star)
			));
		}

	}
}
