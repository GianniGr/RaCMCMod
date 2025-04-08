package GianniGr.rac_mod.gui;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.Font;
import net.minecraft.client.Minecraft;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpaceCinematicScreen extends Screen {
    private final Runnable onComplete;
    private int timer = 0;

    public SpaceCinematicScreen(Runnable onComplete) {
        super(Component.literal("Traveling to Planet..."));
        this.onComplete = onComplete;
    }

    @Override
    public void tick() {
        super.tick();
        timer++;
        if (timer > 100) { // 5 seconds at 20 ticks/sec
            onComplete.run();
        }
    }

    //TODO
//    @Override
//    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
//        this.renderBackground(poseStack);
//        drawCenteredString(poseStack, this.font, "Flying through space...", this.width / 2, this.height / 2, 0xFFFFFF);
//    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}