package GianniGr.rac_mod.gui;

import GianniGr.rac_mod.networking.NetworkHandler;
import GianniGr.rac_mod.packets.TeleportToPlanetPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;

public class PlanetSelectionScreen extends Screen {
    public PlanetSelectionScreen() {
        super(Component.literal("Select Your Destination"));
    }

    //TODO
//    @Override
//    protected void init() {
//        this.addRenderableWidget(new Button(this.width / 2 - 50, this.height / 2, 100, 20, Component.literal("Planet X"), btn -> {
//            Minecraft.getInstance().setScreen(null);  // Close the planet selection screen
//            playCinematicThenTeleport();  // Start cinematic and teleport after
//        }));
//    }

    private void playCinematicThenTeleport() {
        Minecraft.getInstance().setScreen(new SpaceCinematicScreen(() -> {
            // After the cinematic, teleport player
            LocalPlayer player = Minecraft.getInstance().player;
            if (player != null) {
                NetworkHandler.sendToServer(new TeleportToPlanetPacket("planet_x"));
            }
        }));
    }
}