package GianniGr.rac_mod.block.entity;

import GianniGr.rac_mod.Rac_mod;
import GianniGr.rac_mod.block.ModBlocks;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Rac_mod.MOD_ID);

    public static final RegistryObject<BlockEntityType<GemPolishingStationBlockEntity>> GEM_POLISHING_BE =
            BLOCK_ENTITIES.register("gem_polishing_be", () ->
                    BlockEntityType.Builder.of(GemPolishingStationBlockEntity::new,
                            ModBlocks.GEM_POLISHING_STATION.get()).build(null));

    //TODO MOVE LOCATION TO ENTITIES register
//    public static final RegistryObject<EntityType<PrimedExplosiveCrateEntity>> PRIMED_EXPLOSIVE_CRATE =
//            ENTITIES.register("primed_explosive_crate", () ->
//                    EntityType.Builder.<PrimedExplosiveCrateEntity>of(PrimedExplosiveCrateEntity::new, MobCategory.MISC)
//                            .sized(0.98F, 0.98F) // Size of the entity (TNT-sized)
//                            .clientTrackingRange(10) // Distance it can be tracked by the client
//                            .updateInterval(10)      // Update interval
//                            .build("primed_explosive_crate"));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
