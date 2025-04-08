package GianniGr.rac_mod;

import java.util.function.Function;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.util.ITeleporter;


public class SimpleTeleporter implements ITeleporter {
    private final BlockPos targetPos;

    public SimpleTeleporter(BlockPos pos) {
        this.targetPos = pos;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
        entity = repositionEntity.apply(false);
        entity.teleportTo(targetPos.getX(), targetPos.getY(), targetPos.getZ());
        return entity;
    }
}