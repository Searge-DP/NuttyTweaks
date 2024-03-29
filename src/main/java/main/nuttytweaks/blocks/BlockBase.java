package main.nuttytweaks.blocks;

/*
 * Base block class for getting standard things done with quickly.
 * Extend this for pretty much every block you make.
 */

import main.nuttytweaks.NuttyTweaks;
import main.nuttytweaks.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

	// If you aren't setting multiple textures for your block. IE: Non-Metadata blocks.
	public BlockBase(String unlocName, Material material, String textureName, SoundType soundType, float hardness) {
		super(material);

		setBlockName(ModInformation.ID + "." + unlocName);
		setBlockTextureName(ModInformation.ID + ":" + textureName);
		setCreativeTab(NuttyTweaks.tabNuttyTweaks);
		setStepSound(soundType);
		setHardness(hardness);
	}

	// If you are setting multiple textures for your block. IE: Metadata blocks.
	public BlockBase(String unlocName, Material material, SoundType soundType, float hardness) {
		super(material);

		setBlockName(ModInformation.ID + "." + unlocName);
		setCreativeTab(NuttyTweaks.tabNuttyTweaks);
		setStepSound(soundType);
		setHardness(hardness);
	}
}
