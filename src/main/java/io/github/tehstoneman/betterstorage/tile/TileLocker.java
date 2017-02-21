package io.github.tehstoneman.betterstorage.tile;

import io.github.tehstoneman.betterstorage.common.block.BlockContainerBetterStorage;
import io.github.tehstoneman.betterstorage.tile.entity.TileEntityLocker;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileLocker extends BlockContainerBetterStorage
{
	public TileLocker()
	{
		super( Material.WOOD );

		setHardness( 2.5f );
		// setStepSound(soundTypeWood);
		// setBlockBounds(1 / 16.0F, 1 / 16.0F, 1 / 16.0F, 15 / 16.0F, 15 / 16.0F, 15 / 16.0F);

		setHarvestLevel( "axe", 0 );
	}

	/*
	 * @Override
	 * 
	 * @SideOnly(Side.CLIENT)
	 * public void registerBlockIcons(IIconRegister iconRegister) {
	 * blockIcon = iconRegister.registerIcon("planks_oak");
	 * }
	 */

	@Override
	public boolean isOpaqueCube( IBlockState state )
	{
		return false;
	}

	@Override
	public boolean isFullCube( IBlockState state )
	{
		return false;
	}

	@Override
	@SideOnly( Side.CLIENT )
	public EnumBlockRenderType getRenderType( IBlockState state )
	{
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;// return ClientProxy.lockerRenderId;
	}

	/*
	 * @Override
	 * public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
	 * TileEntityLocker locker = WorldUtils.get(world, x, y, z, TileEntityLocker.class);
	 * return ((locker == null) || (locker.getOrientation() != side));
	 * }
	 */

	/*
	 * @Override
	 * public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
	 * float minX = 0, minY = 0, minZ = 0;
	 * float maxX = 1, maxY = 1, maxZ = 1;
	 * switch (WorldUtils.get(world, x, y, z, TileEntityLocker.class).getOrientation()) {
	 * case EAST: maxX -= 1.0F / 16; break;
	 * case WEST: minX += 1.0F / 16; break;
	 * case SOUTH: maxZ -= 1.0F / 16; break;
	 * case NORTH: minZ += 1.0F / 16; break;
	 * default: break;
	 * }
	 * setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);
	 * }
	 */

	@Override
	public TileEntity createNewTileEntity( World world, int metadata )
	{
		return new TileEntityLocker();
	}

	@Override
	public boolean hasComparatorInputOverride( IBlockState state )
	{
		return true;
	}
}