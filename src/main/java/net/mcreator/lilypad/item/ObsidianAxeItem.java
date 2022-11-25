
package net.mcreator.lilypad.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.lilypad.itemgroup.LilypadExtensionItemGroup;
import net.mcreator.lilypad.LilypadModElements;

@LilypadModElements.ModElement.Tag
public class ObsidianAxeItem extends LilypadModElements.ModElement {
	@ObjectHolder("lilypad:obsidian_axe")
	public static final Item block = null;

	public ObsidianAxeItem(LilypadModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1831;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 7.5f;
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
		}, 1, -3f, new Item.Properties().group(LilypadExtensionItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("obsidian_axe"));
	}
}
