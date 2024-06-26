package WayofTime.alchemicalWizardry.common.items.potion;

import net.minecraft.client.renderer.texture.IIconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GreaterPowerCatalyst extends PowerCatalyst {

    public GreaterPowerCatalyst() {
        super(3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("AlchemicalWizardry:GreaterPowerCatalyst");
    }
}
