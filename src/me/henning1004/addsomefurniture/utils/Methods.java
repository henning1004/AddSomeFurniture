package me.henning1004.addsomefurniture.utils;

import java.util.ArrayList;
import java.util.List;

import me.henning1004.addsomefurniture.furniture.Blocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.getspout.spoutapi.block.SpoutBlock;

public class Methods 
{
	
	public static Material item = Material.STONE_BUTTON;
	
	public Methods()
	{
		
	}

	public static boolean isChair(SpoutBlock block)
	{
		if (isSimpleChair(block) || isBarStool(block) || isWoodChair(block) || isIronChair(block) || isGoldChair(block))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isThrone(SpoutBlock block)
	{
		if (isWoodThrone(block) || isIronThrone(block) || isGoldThrone(block) || isLeatherThrone(block))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isSimpleChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.woodsimplechair || block.getCustomBlock() == Blocks.stonesimplechair) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isBarStool(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.woodenbarstool || block.getCustomBlock() == Blocks.stonebarstool) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isWoodChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.woodchairN || block.getCustomBlock() == Blocks.woodchairE || block.getCustomBlock() == Blocks.woodchairS || block.getCustomBlock() == Blocks.woodchairW ) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isIronChair(SpoutBlock block)
	{
		if ( block.getCustomBlock() == Blocks.ironchairN || block.getCustomBlock() == Blocks.ironchairE || block.getCustomBlock() == Blocks.ironchairS || block.getCustomBlock() == Blocks.ironchairW)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isGoldChair(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.goldchairN || block.getCustomBlock() == Blocks.goldchairE || block.getCustomBlock() == Blocks.goldchairS || block.getCustomBlock() == Blocks.goldchairW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isWoodThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.woodthroneN || block.getCustomBlock() == Blocks.woodthroneE || block.getCustomBlock() == Blocks.woodthroneS || block.getCustomBlock() == Blocks.woodthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isIronThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.ironthroneN || block.getCustomBlock() == Blocks.ironthroneE || block.getCustomBlock() == Blocks.ironthroneS || block.getCustomBlock() == Blocks.ironthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isGoldThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.goldthroneN || block.getCustomBlock() == Blocks.goldthroneE || block.getCustomBlock() == Blocks.goldthroneS || block.getCustomBlock() == Blocks.goldthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isLeatherThrone(SpoutBlock block)
	{
		if (block.getCustomBlock() == Blocks.leatherthroneN || block.getCustomBlock() == Blocks.leatherthroneE || block.getCustomBlock() == Blocks.leatherthroneS || block.getCustomBlock() == Blocks.leatherthroneW)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Item dropSeat(Block chair) {
		Location location = chair.getLocation().add(0.5, - 0.5, 0.5);
		Item drop = location.getWorld().dropItemNaturally(location, new ItemStack(item));
		drop.setPickupDelay(Integer.MAX_VALUE);
		drop.teleport(location);
		drop.setVelocity(new Vector(0, 0, 0));
		return drop;
	}
	
	public static List<Item> checkChair(Item drop) {
		List<Item> drops = new ArrayList<Item>();
		for(Entity e : drop.getNearbyEntities(0.2, 0.2, 0.2)) {
			if(e != null && e instanceof Item && e.getPassenger() != null)
				drops.add(drop);
		}
		
		if(drops.isEmpty() == false)
			return drops;
		
		return null;
	
	}
	
}
