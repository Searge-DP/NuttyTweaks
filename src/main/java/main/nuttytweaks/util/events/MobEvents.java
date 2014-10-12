package main.nuttytweaks.util.events;

import com.rwtema.menagerie.entities.Ents.EntityAnt;
import com.rwtema.menagerie.entities.Ents.EntityGhost;
import com.rwtema.menagerie.entities.Ents.EntityInfestedVillager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import main.nuttytweaks.ConfigHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import tterrag.core.common.Handlers.Handler;
import tterrag.rtc.RecipeAddition;

import java.util.Random;

@Handler
public class MobEvents {

	@RecipeAddition(requiredModids="menagerie")
	@SubscribeEvent
	public void doMenagerieDrops(LivingDropsEvent event) {
		Random rand = new Random();

		if (ConfigHandler.addDarkMenagerieMobDrops) {
			if (event.entityLiving instanceof EntityInfestedVillager && event.source.getEntity() instanceof EntityPlayer && rand.nextInt(100) <= 10)
				event.entityLiving.entityDropItem(new ItemStack(Items.emerald), 1);

			if (event.entityLiving instanceof EntityAnt) {
				event.entityLiving.entityDropItem(new ItemStack(Items.string, rand.nextInt(3), 0), 1);
				if (rand.nextInt(100) <= 10 && event.source.getEntity() instanceof EntityPlayer)
					event.entityLiving.entityDropItem(new ItemStack(Items.blaze_powder), 1);
			}

			if (event.entityLiving instanceof EntityGhost && event.source.getEntity() instanceof EntityPlayer) {
				if (rand.nextInt(100) <= 10)
					event.entityLiving.entityDropItem(new ItemStack(Items.diamond), 1);
				if (rand.nextInt(1000) <= 1)
					event.entityLiving.entityDropItem(new ItemStack(Items.diamond_sword, 1, rand.nextInt(Items.diamond_sword.getMaxDamage())), 1);
			}
		}
	}
}
