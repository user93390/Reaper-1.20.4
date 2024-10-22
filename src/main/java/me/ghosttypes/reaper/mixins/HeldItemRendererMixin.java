package me.ghosttypes.reaper.mixins;

import net.minecraft.client.render.item.HeldItemRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {

    @Inject(method = "updateHeldItems", at = @At(value = "HEAD"), cancellable = true)
    private void onUpdateHeldItem(CallbackInfo ci) {
        HeldItemRenderer heldItemRenderer = (HeldItemRenderer) (Object) this;
    }
}
