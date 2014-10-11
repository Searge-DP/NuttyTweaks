package main.nuttytweaks.modtweaks;

import com.rwtema.extrautils.ExtraUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import main.nuttytweaks.ConfigHandler;
import main.nuttytweaks.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tterrag.rtc.RecipeAddition;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import tterrag.rtc.TweakingRegistry.TweakingAction;

public class ExUTweaks {

	@RecipeRemoval(requiredModids = "ExtraUtilities")
	public static void init() {
		if(ConfigHandler.nerfAngelRings) {
			TweakingRegistry.markItemForRecipeRemoval(ExtraUtils.angelRing, 0, TweakingAction.CHANGED, "Recipe balanced around other", "mod's creative flight abilities");
			TweakingRegistry.markItemForRecipeRemoval(ExtraUtils.angelRing, 1, TweakingAction.CHANGED, "Recipe balanced around other", "mod's creative flight abilities");
			TweakingRegistry.markItemForRecipeRemoval(ExtraUtils.angelRing, 2, TweakingAction.CHANGED, "Recipe balanced around other", "mod's creative flight abilities");
			TweakingRegistry.markItemForRecipeRemoval(ExtraUtils.angelRing, 3, TweakingAction.CHANGED, "Recipe balanced around other", "mod's creative flight abilities");
			TweakingRegistry.markItemForRecipeRemoval(ExtraUtils.angelRing, 4, TweakingAction.CHANGED, "Recipe balanced around other", "mod's creative flight abilities");
		}
	}

	@SuppressWarnings("unchecked")
	@RecipeAddition(requiredModids="ExtraUtilities")
	public static void addRecipes() {

		if(ConfigHandler.nerfAngelRings && !OreDictionary.getOres("blockNetherStar").isEmpty()) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 0),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Blocks.glass),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', "blockNetherStar",
					'S', new ItemStack(ExtraUtils.soul)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 1),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.feather),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', "blockNetherStar",
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 2),
					"DAP",
					"ANA",
					"SAS",

					'D', new ItemStack(Items.dye, 1, 5),
					'P', new ItemStack(Items.dye, 1, 9),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', "blockNetherStar",
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 3),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.leather),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', "blockNetherStar",
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 4),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.gold_nugget),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', "blockNetherStar",
					'S', new ItemStack(ExtraUtils.soul)
			));
		} else if (ConfigHandler.nerfAngelRings && OreDictionary.getOres("blockNetherStar").isEmpty()){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 0),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Blocks.glass),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', new ItemStack(BlockRegistry.netherStarBlock),
					'S', new ItemStack(ExtraUtils.soul)));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 1),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.feather),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', new ItemStack(BlockRegistry.netherStarBlock),
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 2),
					"DAP",
					"ANA",
					"SAS",

					'D', new ItemStack(Items.dye, 1, 5),
					'P', new ItemStack(Items.dye, 1, 9),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', new ItemStack(BlockRegistry.netherStarBlock),
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 3),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.leather),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', new ItemStack(BlockRegistry.netherStarBlock),
					'S', new ItemStack(ExtraUtils.soul)
			));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ExtraUtils.angelRing, 1, 4),
					"MAM",
					"ANA",
					"SAS",

					'M', new ItemStack(Items.gold_nugget),
					'A', new ItemStack(Items.golden_apple, 1, 1),
					'N', new ItemStack(BlockRegistry.netherStarBlock),
					'S', new ItemStack(ExtraUtils.soul)
			));
		}
	}
}
