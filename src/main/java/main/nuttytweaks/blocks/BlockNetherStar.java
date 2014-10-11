package main.nuttytweaks.blocks;

/*
 * General block that doesn't do anything.
 */

import net.minecraft.block.material.Material;

public class BlockNetherStar extends BlockBase {

	public BlockNetherStar() {
		super("block.netherstar", Material.rock, "netherStar_block", soundTypeMetal, 4F);
	}
}
