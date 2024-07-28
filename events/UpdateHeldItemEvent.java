package me.ghosttypes.reaper.events;

import net.minecraft.client.render.item.HeldItemRenderer;


public class UpdateHeldItemEvent {
    public static final UpdateHeldItemEvent INSTANCE = new UpdateHeldItemEvent();

    public HeldItemRenderer renderer;

    public static UpdateHeldItemEvent get(HeldItemRenderer renderer) {
        INSTANCE.renderer = renderer;
        return INSTANCE;
    }
}
