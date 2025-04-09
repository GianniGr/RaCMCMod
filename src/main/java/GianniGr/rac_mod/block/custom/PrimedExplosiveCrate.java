package GianniGr.rac_mod.block.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;

public class PrimedExplosiveCrate extends PrimedTnt {
    public PrimedExplosiveCrate(EntityType<? extends PrimedTnt> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
}
