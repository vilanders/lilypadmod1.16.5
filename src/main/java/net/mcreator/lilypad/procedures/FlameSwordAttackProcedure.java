package net.mcreator.lilypad.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.lilypad.LilypadMod;

import java.util.Map;

public class FlameSwordAttackProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LilypadMod.LOGGER.warn("Failed to load dependency entity for procedure FlameSwordAttack!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 4);
	}
}
