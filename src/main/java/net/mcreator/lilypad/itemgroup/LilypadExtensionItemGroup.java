
package net.mcreator.lilypad.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.lilypad.block.LilyBlock;
import net.mcreator.lilypad.LilypadModElements;

@LilypadModElements.ModElement.Tag
public class LilypadExtensionItemGroup extends LilypadModElements.ModElement {
	public LilypadExtensionItemGroup(LilypadModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablilypad_extension") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LilyBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
