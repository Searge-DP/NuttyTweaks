package main.nuttytweaks.blocks;

/*
 * General place to do all your block related recipe things'n'stuff.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BlockRecipeRegistry {

	private static void registerShapedRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.netherStarBlock), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Items.nether_star)}));
	}

	private static void registerShaplessRecipes() {

	}

	public static void registerBlockRecipes() {
		registerShapedRecipes();
		registerShaplessRecipes();
	}
}
