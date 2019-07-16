package io.github.tehstoneman.betterstorage.common.world;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import io.github.tehstoneman.betterstorage.ModInfo;
import io.github.tehstoneman.betterstorage.common.inventory.CrateStackHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.storage.WorldSavedData;

/** Holds all CratePileData objects for one world / dimension. */
public class CrateStackCollection extends WorldSavedData
{
	private static final String						filename	= ModInfo.MOD_ID + "_cratepile";

	private final Map< UUID, CrateStackHandler >	pileDataMap	= new HashMap<>();

	public CrateStackCollection()
	{
		this( filename );
	}

	public CrateStackCollection( String filename )
	{
		super( filename );
	}

	/** Gets or creates a CratePileCollection for the world. */
	/*
	 * public static CrateStackCollection getCollection( World world )
	 * {
	 * CrateStackCollection collection = world.func_212411_a( world.getDimension().getType(), CrateStackCollection::new, filename );
	 * // CrateStackCollection collection = (CrateStackCollection)world.loadData( CrateStackCollection.class, filename );
	 * if( collection == null )
	 * {
	 * collection = new CrateStackCollection();
	 * world.func_212409_a( world.getDimension().getType(), filename, collection );
	 * // world.setData( filename, collection );
	 * }
	 * return collection;
	 * }
	 */

	/** Get the stack handler for the associated ID */
	/*
	 * public CrateStackHandler getCratePile( UUID pileID )
	 * {
	 * if( pileID != null && pileDataMap.containsKey( pileID ) )
	 * return pileDataMap.get( pileID );
	 * return createCratePile();
	 * }
	 */

	/**
	 * Get or create a crate handler for the given UUID
	 * Used for syncing client with server
	 */
	// @SideOnly( Side.CLIENT )
	/*
	 * public CrateStackHandler getOrCreateCratePile( UUID pileID )
	 * {
	 * if( !pileDataMap.containsKey( pileID ) )
	 * {
	 * final CrateStackHandler cratePile = new CrateStackHandler( TileEntityCrate.slotsPerCrate );
	 * pileDataMap.put( pileID, cratePile );
	 * cratePile.setPileID( pileID );
	 * }
	 * return pileDataMap.get( pileID );
	 * }
	 */

	/** Creates and adds a new crate to this collection. */
	/*
	 * public CrateStackHandler createCratePile()
	 * {
	 * UUID pileID = UUID.randomUUID();
	 * while( pileDataMap.containsKey( pileID ) )
	 * pileID = UUID.randomUUID();
	 * return addCrateToPile( pileID );
	 * }
	 */

	/** Adds a new crate pile to this collection. */
	/*
	 * public CrateStackHandler addCrateToPile( UUID pileID )
	 * {
	 * final CrateStackHandler cratePile = new CrateStackHandler( TileEntityCrate.slotsPerCrate );
	 * pileDataMap.put( pileID, cratePile );
	 * cratePile.setPileID( pileID );
	 * markDirty();
	 * return cratePile;
	 * }
	 */

	/** Removes the crate pile from the collection, deletes the pile's file. */
	public void removeCratePile( UUID pileID )
	{
		pileDataMap.remove( pileID );
		markDirty();
	}

	/*
	 * @Override
	 * public void readFromNBT( NBTTagCompound compound )
	 * {
	 * if( !compound.hasNoTags() )
	 * for( final String key : compound.getKeySet() )
	 * {
	 * final CrateStackHandler crateStackHandler = new CrateStackHandler( 0 );
	 * crateStackHandler.deserializeNBT( compound.getCompoundTag( key ) );
	 * pileDataMap.put( UUID.fromString( key ), crateStackHandler );
	 * }
	 * }
	 */

	/*
	 * @Override
	 * public NBTTagCompound writeToNBT( NBTTagCompound compound )
	 * {
	 * if( !pileDataMap.isEmpty() )
	 * for( final Map.Entry< UUID, CrateStackHandler > entry : pileDataMap.entrySet() )
	 * compound.setTag( entry.getKey().toString(), entry.getValue().serializeNBT() );
	 * return compound;
	 * }
	 */

	/*
	 * @Override
	 * public void read( NBTTagCompound compound )
	 * {
	 * if( !compound.isEmpty() )
	 * for( final String key : compound.keySet() )
	 * {
	 * final CrateStackHandler crateStackHandler = new CrateStackHandler( 0 );
	 * crateStackHandler.deserializeNBT( compound.getCompound( key ) );
	 * pileDataMap.put( UUID.fromString( key ), crateStackHandler );
	 * }
	 * }
	 */

	/*
	 * @Override
	 * public NBTTagCompound write( NBTTagCompound compound )
	 * {
	 * if( !pileDataMap.isEmpty() )
	 * for( final Map.Entry< UUID, CrateStackHandler > entry : pileDataMap.entrySet() )
	 * compound.setTag( entry.getKey().toString(), entry.getValue().serializeNBT() );
	 * return compound;
	 * }
	 */

	@Override
	public void read( CompoundNBT nbt )
	{
		// TODO Auto-generated method stub

	}

	@Override
	public CompoundNBT write( CompoundNBT compound )
	{
		// TODO Auto-generated method stub
		return null;
	}
}
