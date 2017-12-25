package net.machinemuse.numina.gui;

import net.machinemuse.numina.client.gui.GuiGameOverPlus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Author: MachineMuse (Claire Semple)
 * Created: 7:59 PM, 10/15/13
 *
 * Ported to Java by lehjr on 10/10/16.
 */
public class NuminaGuiHandler implements IGuiHandler {
    private static NuminaGuiHandler INSTANCE;
    public static NuminaGuiHandler getInstance() {
        if (INSTANCE == null) {
            synchronized (NuminaGuiHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NuminaGuiHandler();
                }
            }
        }
        return INSTANCE;
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID== 0)
            return new GuiGameOverPlus();
        return null;
    }
}
