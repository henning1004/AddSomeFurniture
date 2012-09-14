package me.henning1004.addsomefurniture.listener;

import java.util.Iterator;
import java.util.List;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.furniture.Blocks;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class CraftListener implements Listener
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	public CraftListener(AddSomeFurniture plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void CraftItem(CraftItemEvent event)
	{
		if(event.isCancelled())
            return;
		Inventory inv = event.getInventory(); 
		@SuppressWarnings("rawtypes")
		List viewers = event.getViewers();
        Player player = null;
        int craftedItemID = event.getRecipe().getResult().getDurability();
        
		if(!(inv instanceof CraftingInventory) || !event.getSlotType().equals(org.bukkit.event.inventory.InventoryType.SlotType.RESULT))
            return;
        if(viewers.size() == 0)
            return; 

        for(@SuppressWarnings("rawtypes")
		Iterator iterator = event.getViewers().iterator(); iterator.hasNext();)
        {
            HumanEntity viewer = (HumanEntity)iterator.next();
            if(viewer instanceof Player)
            {
                player = (Player)viewer;
                break;
            }
        }
        
        if(player == null)
            return;
        if (craftedItemID == Blocks.woodtable.getCustomId() || craftedItemID == Blocks.irontable.getCustomId() || craftedItemID == Blocks.goldtable.getCustomId() || craftedItemID == Blocks.obsidiantable.getCustomId() || craftedItemID == Blocks.stonetable.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.table") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{
        		player.sendMessage(ChatColor.RED + "You are not allowed to craft tables");
                event.setCancelled(true);
        	}
        }

        if (craftedItemID == Blocks.woodchairN.getCustomId() || craftedItemID == Blocks.ironchairN.getCustomId() || craftedItemID == Blocks.goldchairN.getCustomId() || craftedItemID == Blocks.woodsimplechair.getCustomId() || craftedItemID == Blocks.stonesimplechair.getCustomId() || craftedItemID == Blocks.woodenbarstool.getCustomId() || craftedItemID == Blocks.stonebarstool.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.chair") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft chairs");
                event.setCancelled(true);
        	}
        }

		
        if (craftedItemID == Blocks.woodthroneN.getCustomId() || craftedItemID == Blocks.ironthroneN.getCustomId() || craftedItemID == Blocks.goldthroneN.getCustomId() || craftedItemID == Blocks.leatherthroneN.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.throne") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft thrones");
                event.setCancelled(true);
        	}
        }

        
        if (craftedItemID == Blocks.craftingworktop.getCustomId() || craftedItemID == Blocks.ironworktop.getCustomId() || craftedItemID == Blocks.goldworktop.getCustomId() || craftedItemID == Blocks.stoneworktop.getCustomId() || craftedItemID == Blocks.woodenworktop.getCustomId() || craftedItemID == Blocks.obsidianworktop.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.worktop") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft worktops");
                event.setCancelled(true);
        	}
        }

        
        if (craftedItemID == Blocks.lamp.getCustomId() || craftedItemID == Blocks.neonlampWred.getCustomId() || craftedItemID == Blocks.neonlampWgreen.getCustomId() || craftedItemID == Blocks.neonlampWblue.getCustomId() || craftedItemID == Blocks.neonlampW.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.lamp") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft lamps");
                event.setCancelled(true);
        	}
        }

        
        if (craftedItemID == Blocks.tvN.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.tv") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft the tv");
                event.setCancelled(true);
        	}
        }
        
        else
        {
        	return;
        }
        
        if (craftedItemID == Blocks.carpetblack.getCustomId() || craftedItemID == Blocks.carpetred.getCustomId() || craftedItemID == Blocks.carpetdarkgreen.getCustomId() || craftedItemID == Blocks.carpetbrown.getCustomId() || craftedItemID == Blocks.carpetblue.getCustomId() 
        		|| craftedItemID == Blocks.carpetpurple.getCustomId() || craftedItemID == Blocks.carpetcyan.getCustomId() || craftedItemID == Blocks.carpetlightgrey.getCustomId() || craftedItemID == Blocks.carpetgrey.getCustomId() || craftedItemID == Blocks.carpetpink.getCustomId() 
        		|| craftedItemID == Blocks.carpetlightgreen.getCustomId() || craftedItemID == Blocks.carpetyellow.getCustomId() || craftedItemID == Blocks.carpetlightblue.getCustomId() || craftedItemID == Blocks.carpetmagenta.getCustomId() || craftedItemID == Blocks.carpetorange.getCustomId() || craftedItemID == Blocks.carpetwhite.getCustomId())
        {
        	if (!player.hasPermission("asf.craft.carpet") || Configuration.confi.getString("NoPermissions").equals("true"))
        	{return;}
        	else
        	{	player.sendMessage(ChatColor.RED + "You are not allowed to craft carpets");
                event.setCancelled(true);
        	}
        }
        
	}
}
