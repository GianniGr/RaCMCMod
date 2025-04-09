package GianniGr.rac_mod.block.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class PrimedExplosiveCrate extends PrimedTnt {
    public PrimedExplosiveCrate(Level pLevel, double pX, double pY, double pZ, @Nullable LivingEntity pOwner) {
        super(pLevel, pX, pY, pZ, pOwner);
    }
}
