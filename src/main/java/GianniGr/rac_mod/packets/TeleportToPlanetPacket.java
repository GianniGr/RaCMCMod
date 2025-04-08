package GianniGr.rac_mod.packets;

import java.util.function.Supplier;

import GianniGr.rac_mod.SimpleTeleporter;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;
import net.minecraft.core.Registry;


import java.util.function.Supplier;

public class TeleportToPlanetPacket {
    private final String planetId;

    public TeleportToPlanetPacket(String id) {
        this.planetId = id;
    }

    //TODO
    public static void handle(TeleportToPlanetPacket msg, Supplier<NetworkEvent.Context> ctx) {
//        ctx.get().enqueueWork(() -> {
//            ServerPlayer player = ctx.get().getSender();
//            if (player != null) {
//                ServerLevel targetWorld = player.server.getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("R&CMod", msg.planetId)));
//                if (targetWorld != null) {
//                    player.changeDimension(targetWorld, new SimpleTeleporter(targetWorld.getSharedSpawnPos()));
//                }
//            }
//        });
//        ctx.get().setPacketHandled(true);
    }
}