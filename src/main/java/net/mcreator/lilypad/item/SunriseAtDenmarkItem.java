
package net.mcreator.lilypad.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.lilypad.itemgroup.LilypadExtensionItemGroup;
import net.mcreator.lilypad.LilypadModElements;

@LilypadModElements.ModElement.Tag
public class SunriseAtDenmarkItem extends LilypadModElements.ModElement {
	@ObjectHolder("lilypad:music_disc_sunrise_at_denmark")
	public static final Item block = null;

	public SunriseAtDenmarkItem(LilypadModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, LilypadModElements.sounds.get(new ResourceLocation("lilypad:sunrise_at_denmark")),
					new Item.Properties().group(LilypadExtensionItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music_disc_sunrise_at_denmark");
		}
	}
}
