
package net.mcreator.lilypad.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.lilypad.itemgroup.LilypadExtensionItemGroup;
import net.mcreator.lilypad.LilypadModElements;

@LilypadModElements.ModElement.Tag
public class ObsidianShovelItem extends LilypadModElements.ModElement {
	@ObjectHolder("lilypad:obsidian_shovel")
	public static final Item block = null;

	public ObsidianShovelItem(LilypadModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1831;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ObsidianIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(LilypadExtensionItemGroup.tab)) {
		}.setRegistryName("obsidian_shovel"));
	}
}
