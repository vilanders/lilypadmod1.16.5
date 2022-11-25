package net.mcreator.lilypad.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.lilypad.LilypadMod;

import java.util.Map;

public class HubEnterProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LilypadMod.LOGGER.warn("Failed to load dependency world for procedure HubEnter!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LilypadMod.LOGGER.warn("Failed to load dependency x for procedure HubEnter!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LilypadMod.LOGGER.warn("Failed to load dependency y for procedure HubEnter!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LilypadMod.LOGGER.warn("Failed to load dependency z for procedure HubEnter!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LilypadMod.LOGGER.warn("Failed to load dependency entity for procedure HubEnter!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null && world.func_241828_r()
				.getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))).equals(new ResourceLocation("lilypad:hub"))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.disableDamage = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}
