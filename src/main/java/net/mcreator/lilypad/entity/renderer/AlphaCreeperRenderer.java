
package net.mcreator.lilypad.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.CreeperModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.lilypad.entity.AlphaCreeperEntity;

@OnlyIn(Dist.CLIENT)
public class AlphaCreeperRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AlphaCreeperEntity.entity,
					renderManager -> new MobRenderer(renderManager, new CreeperModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("lilypad:textures/entities/creeper.png");
						}
					});
		}
	}
}
