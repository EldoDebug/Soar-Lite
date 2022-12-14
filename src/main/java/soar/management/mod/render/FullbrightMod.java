package soar.management.mod.render;

import soar.management.mod.Mod;
import soar.management.mod.ModCategory;

public class FullbrightMod extends Mod {

	public FullbrightMod() {
		super("Fullbright", ModCategory.RENDER);
	}

	@Override
	public void onEnable() {
		super.onEnable();
        mc.renderGlobal.loadRenderers();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
        mc.renderGlobal.loadRenderers();
	}
}
