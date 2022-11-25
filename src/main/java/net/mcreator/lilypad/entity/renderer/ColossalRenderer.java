
package net.mcreator.lilypad.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.lilypad.entity.ColossalEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ColossalRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ColossalEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcolossal(), 2f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("lilypad:textures/entities/collosal_a.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.4.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcolossal extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer leftArm;
		private final ModelRenderer leftArm_r1;
		private final ModelRenderer rightArm;
		private final ModelRenderer rightArm_r1;
		private final ModelRenderer leftLeg;
		private final ModelRenderer rightLeg;

		public Modelcolossal() {
			textureWidth = 256;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.1071F, -92.9435F, -2.249F);
			head.setTextureOffset(0, 0).addBox(-15.8929F, -11.0565F, -13.751F, 32.0F, 32.0F, 32.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(64, 64).addBox(-16.0F, -72.0F, -8.0F, 32.0F, 48.0F, 16.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(-24.5F, -68.5F, 3.0F);
			leftArm_r1 = new ModelRenderer(this);
			leftArm_r1.setRotationPoint(0.5F, 4.5F, -3.0F);
			leftArm.addChild(leftArm_r1);
			setRotationAngle(leftArm_r1, -1.4835F, 0.0F, 0.0F);
			leftArm_r1.setTextureOffset(160, 64).addBox(-6.0F, -8.0F, -8.0F, 16.0F, 48.0F, 16.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(25.5F, -68.0F, 3.0F);
			rightArm_r1 = new ModelRenderer(this);
			rightArm_r1.setRotationPoint(-1.5F, 4.0F, -3.0F);
			rightArm.addChild(rightArm_r1);
			setRotationAngle(rightArm_r1, -1.4835F, 0.0F, 0.0F);
			rightArm_r1.setTextureOffset(160, 64).addBox(-10.0F, -8.0F, -8.0F, 16.0F, 48.0F, 16.0F, 0.0F, false);
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(-17.1F, -20.0F, 2.0F);
			leftLeg.setTextureOffset(0, 64).addBox(1.1F, -4.0F, -10.0F, 16.0F, 48.0F, 16.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(19.4F, -19.5F, 2.0F);
			rightLeg.setTextureOffset(0, 64).addBox(-19.4F, -4.5F, -10.0F, 16.0F, 48.0F, 16.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
