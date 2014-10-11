package main.nuttytweaks.util;

//General place to register all oreDict recipes.

import main.nuttytweaks.blocks.BlockRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

	//Oredict entries
	//items

	//blocks
	public static String oreNetherStar = "oreNetherStar";

	public static void registerOreDict() {
		OreDictionary.registerOre(oreNetherStar, BlockRegistry.netherStarBlock);
	}
}