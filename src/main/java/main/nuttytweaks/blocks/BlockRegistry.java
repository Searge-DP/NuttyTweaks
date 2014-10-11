package main.nuttytweaks.blocks;

//General place to register all your blocks.

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry {

	//blocks
	public static Block netherStarBlock;

	public static void registerBlocks() {
		//I use multiple sections here to sort things. It's just my system, you don't have to. Just delete "registerBlockSet2" and "registerAllBlocks" then make this public. Make sure to change the call in the main class.

		netherStarBlock = new BlockNetherStar();
		GameRegistry.registerBlock(netherStarBlock, "BlockNetherStar");
	}
}
