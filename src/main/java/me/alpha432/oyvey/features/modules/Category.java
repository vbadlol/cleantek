package me.alpha.432.oyvey.feature.modules;

import me.alpha432.oyvey.utils.EncryptedString;

public enum Category {
	sword(EncryptedString.of("Sword")),
	CRYSTAL(EncryptedString.of("Crystal")),
	pot(EncryptedString.of("Potions")),
	mace(EncryptedString.of("Mace")),
	optimizer(EncryptedString.of("Optimizer")),
	RENDER(EncryptedString.of("Render")),
	CLIENT(EncryptedString.of("Client"));
	public final CharSequence name;

	Category(CharSequence name) {
		this.name = name;
	}
}
