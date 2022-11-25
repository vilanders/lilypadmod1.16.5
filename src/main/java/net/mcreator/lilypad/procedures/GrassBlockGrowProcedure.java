package net.mcreator.lilypad.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.FlowingFluidBlock;

import net.mcreator.lilypad.block.AlphaGrassBlock;
import net.mcreator.lilypad.block.AlphaDirtBlock;
import net.mcreator.lilypad.LilypadMod;

import java.util.Map;

public class GrassBlockGrowProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LilypadMod.LOGGER.warn("Failed to load dependency world for procedure GrassBlockGrow!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LilypadMod.LOGGER.warn("Failed to load dependency x for procedure GrassBlockGrow!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LilypadMod.LOGGER.warn("Failed to load dependency y for procedure GrassBlockGrow!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LilypadMod.LOGGER.warn("Failed to load dependency z for procedure GrassBlockGrow!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (!world.getBlockState(new BlockPos(x, y + 1, z)).isSolid()
				&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() instanceof FlowingFluidBlock)) {
			world.setBlockState(new BlockPos(x, y, z), AlphaGrassBlock.block.getDefaultState(), 3);
		} else if (world.getBlockState(new BlockPos(x, y + 1, z)).isSolid()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() instanceof FlowingFluidBlock) {
			world.setBlockState(new BlockPos(x, y, z), AlphaDirtBlock.block.getDefaultState(), 3);
		}
	}
}
