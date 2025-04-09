package GianniGr.rac_mod.entity.custom;

import GianniGr.rac_mod.gui.PlanetSelectionScreen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;


// ShipEntity class

public class ShipEntity extends Entity {
    private boolean triggeredPlanetSelection = false;

    public ShipEntity(EntityType<?> type, Level level) {
        super(type, level);
        this.noPhysics = true; // Free-flight spaceship behavior
    }

    @Override
    public void tick() {
        super.tick();

        // Basic free-flight movement
        if (this.isControlledByLocalInstance()) {
            Vec3 look = this.getLookAngle();
            this.setDeltaMovement(look.scale(0.3)); // Adjust speed here if needed
        }

        //TODO: The MenuProvider Cast is wrong but only in the code to get it to work
        // Trigger planet selection screen when Y > 200 and not already triggered
        if (!level().isClientSide && this.getY() > 200 && !triggeredPlanetSelection) {
            triggeredPlanetSelection = true;
            if (this.getControllingPassenger() instanceof ServerPlayer player) {
                NetworkHooks.openScreen(player, (MenuProvider) new PlanetSelectionScreen(), buffer -> {});
            }
        }
    }

    @Override
    protected void defineSynchedData() {}

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {}

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {}

    @Override
    public LivingEntity getControllingPassenger() {
        return (LivingEntity) this.getFirstPassenger();
    }
}
