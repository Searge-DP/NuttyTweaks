package main.nuttytweaks.util;

import com.rwtema.menagerie.entities.Ents.EntityAnt;
import com.rwtema.menagerie.entities.Ents.EntityGhost;
import com.rwtema.menagerie.entities.Ents.EntityInfestedVillager;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import main.nuttytweaks.ConfigHandler;
import main.nuttytweaks.ModInformation;
import main.nuttytweaks.NuttyTweaks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import tterrag.core.common.event.ConfigFileChangedEvent;
import tterrag.rtc.RecipeAddition;

import java.util.Random;

public class EventHandler {

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.modID.equals(ModInformation.ID)) {
			ConfigHandler.syncConfig();
			NuttyTweaks.logger.info(TextHelper.localize("info." + ModInformation.ID + ".console.config.refresh"));
		}
	}

	@SubscribeEvent
	public void onConfigFileChanged(ConfigFileChangedEvent event) {
		if (event.modID.equals(ModInformation.ID)) {
			ConfigHandler.loadConfig();
			ConfigHandler.syncConfig();
			NuttyTweaks.logger.info(TextHelper.localize("info.nuttytweaks.console.config.refresh"));
			event.setSuccessful();
		}
	}

	@RecipeAddition(requiredModids="menagerie")
	@SubscribeEvent
	public void doMenagerieDrops(LivingDropsEvent event) {
		Random rand = new Random();

		if (event.entityLiving instanceof EntityInfestedVillager && event.source.getEntity() instanceof EntityPlayer && rand.nextInt(100) <= 10 && ConfigHandler.addDarkMenagerieMobDrops)
			event.entityLiving.entityDropItem(new ItemStack(Items.emerald), 1);

		if (event.entityLiving instanceof EntityAnt && ConfigHandler.addDarkMenagerieMobDrops) {
			event.entityLiving.entityDropItem(new ItemStack(Items.string, rand.nextInt(3), 0), 1);
			if (rand.nextInt(100) <= 10 && event.source.getEntity() instanceof EntityPlayer)
				event.entityLiving.entityDropItem(new ItemStack(Items.blaze_powder), 1);
		}

		if (event.entityLiving instanceof EntityGhost && event.source.getEntity() instanceof EntityPlayer && ConfigHandler.addDarkMenagerieMobDrops) {
			if (rand.nextInt(100) <= 10)
				event.entityLiving.entityDropItem(new ItemStack(Items.diamond), 1);
			if (rand.nextInt(1000) <= 1)
				event.entityLiving.entityDropItem(new ItemStack(Items.diamond_sword, 1, rand.nextInt(Items.diamond_sword.getMaxDamage())), 1);
		}
	}
}
