package main.nuttytweaks.client.gui;

//Creates your creative tab.

import main.nuttytweaks.blocks.BlockRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabNuttyTweaks extends CreativeTabs {

	public CreativeTabNuttyTweaks(String tabLabel) {
		super(tabLabel);
	}

	//The tab icon is what you return here.
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(BlockRegistry.netherStarBlock);
	}

	@Override
	public Item getTabIconItem() {
		return new Item();
	}
}
