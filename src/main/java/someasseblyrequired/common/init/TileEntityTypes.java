package someasseblyrequired.common.init;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import someasseblyrequired.SomeAssemblyRequired;
import someasseblyrequired.client.CuttingBoardRenderer;
import someasseblyrequired.client.RedstoneToasterRenderer;
import someasseblyrequired.client.SandwichAssemblyTableBlockRenderer;
import someasseblyrequired.client.SandwichBlockRenderer;
import someasseblyrequired.common.block.tileentity.CuttingBoardTileEntity;
import someasseblyrequired.common.block.tileentity.ItemHandlerTileEntity;
import someasseblyrequired.common.block.tileentity.RedstoneToasterTileEntity;
import someasseblyrequired.common.block.tileentity.SandwichAssemblyTableTileEntity;

@ObjectHolder(SomeAssemblyRequired.MODID)
public class TileEntityTypes {

    @ObjectHolder("sandwich_assembly_table")
    public static TileEntityType<SandwichAssemblyTableTileEntity> SANDWICH_ASSEMBLY_TABLE;
    @ObjectHolder("sandwich")
    public static TileEntityType<ItemHandlerTileEntity> SANDWICH;
    @ObjectHolder("cutting_board")
    public static TileEntityType<CuttingBoardTileEntity> CUTTING_BOARD;
    @ObjectHolder("redstone_toaster")
    public static TileEntityType<RedstoneToasterTileEntity> REDSTONE_TOASTER;

    public static void register(IForgeRegistry<TileEntityType<?>> registry) {
        // noinspection ConstantConditions
        registry.registerAll(
                TileEntityType.Builder.create(SandwichAssemblyTableTileEntity::new,
                        Blocks.ACACIA_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.BIRCH_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.CRIMSON_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.DARK_OAK_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.JUNGLE_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.OAK_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.SPRUCE_SANDWICH_ASSEMBLY_TABLE,
                        Blocks.WARPED_SANDWICH_ASSEMBLY_TABLE
                ).build(null).setRegistryName(SomeAssemblyRequired.MODID, "sandwich_assembly_table"),
                TileEntityType.Builder.create(CuttingBoardTileEntity::new,
                        Blocks.ACACIA_CUTTING_BOARD,
                        Blocks.BIRCH_CUTTING_BOARD,
                        Blocks.CRIMSON_CUTTING_BOARD,
                        Blocks.DARK_OAK_CUTTING_BOARD,
                        Blocks.JUNGLE_CUTTING_BOARD,
                        Blocks.OAK_CUTTING_BOARD,
                        Blocks.SPRUCE_CUTTING_BOARD,
                        Blocks.WARPED_CUTTING_BOARD
                ).build(null).setRegistryName(SomeAssemblyRequired.MODID, "cutting_board"),
                TileEntityType.Builder.create(RedstoneToasterTileEntity::new, Blocks.STICKY_REDSTONE_TOASTER, Blocks.REDSTONE_TOASTER).build(null).setRegistryName(SomeAssemblyRequired.MODID, "redstone_toaster"),
                TileEntityType.Builder.create(() -> new ItemHandlerTileEntity(SANDWICH, 0, false), Blocks.SANDWICH).build(null).setRegistryName(SomeAssemblyRequired.MODID, "sandwich")
        );
    }

    public static void addRenderers() {
        ClientRegistry.bindTileEntityRenderer(TileEntityTypes.SANDWICH_ASSEMBLY_TABLE, SandwichAssemblyTableBlockRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TileEntityTypes.CUTTING_BOARD, CuttingBoardRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TileEntityTypes.SANDWICH, SandwichBlockRenderer::new);
        ClientRegistry.bindTileEntityRenderer(TileEntityTypes.REDSTONE_TOASTER, RedstoneToasterRenderer::new);
    }
}
