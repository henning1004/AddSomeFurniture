package me.henning1004.addsomefurniture.listener;

import java.util.List;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.utils.Methods;
//import net.minecraft.server.Block;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;

public class SeatListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public Material item;
	
	public SeatListener(AddSomeFurniture plugin) 
	{
	}
	
	@EventHandler
	public void onSeatClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		item = Material.STONE_BUTTON;
		
		if(event.hasBlock() && Methods.isChair(block) && event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getPlayer().isSneaking()) {
			if(player.hasPermission("asf.action.seat.chair")){
			if(player.getVehicle() != null)
			{
				player.getVehicle().remove();
				return;
			}
			else
			{
				if(block.getRelative(BlockFace.DOWN).getTypeId() == 0 //|| Block.byId[block.getRelative(BlockFace.DOWN).getTypeId()].a() != true
						)
					return; 
				Item drop = Methods.dropSeat(block);				
				List<Item> drops = Methods.checkChair(drop);
				if (drops != null) {
					drop.remove();
					return;
				}
				drop.setItemStack(new ItemStack(item));
				drop.setPassenger(player);
				return;
			}
		}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to sit down on chairs");
				return;
			}
		}
	}
	
	@EventHandler
	public void onThroneClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		item = Material.STONE_BUTTON;
		
		if(event.hasBlock() && Methods.isThrone(block) && event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getPlayer().isSneaking()) {
			if(player.hasPermission("asf.action.seat.throne")){
			if(player.getVehicle() != null)
			{
				player.getVehicle().remove();
				return;
			}
			else
			{
				if(block.getRelative(BlockFace.DOWN).getTypeId() == 0 //|| Block.byId[block.getRelative(BlockFace.DOWN).getTypeId()].a() != true
						)
					return; 
				Item drop = Methods.dropSeat(block);				
				List<Item> drops = Methods.checkChair(drop);
				if (drops != null) {
					drop.remove();
					return;
				}
				drop.setItemStack(new ItemStack(item));
				drop.setPassenger(player);
				return;
			}
		}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to sit down on thrones");
				return;
			}
		}
	}
		@EventHandler
		public void onPlayerQuit(PlayerQuitEvent event) {
			Entity vehicle = event.getPlayer().getVehicle();
			
			// Let players stand up on disconnect.
			if(vehicle != null && vehicle instanceof Item)
				vehicle.remove();
			return;
	}
	
		@EventHandler
		public void onPlayerTeleport(PlayerTeleportEvent event) {
			Entity vehicle = event.getPlayer().getVehicle();
			
			// Let players stand up on teleport.
			if(event.getCause() != TeleportCause.UNKNOWN) {
				if(vehicle != null && vehicle instanceof Item)
					vehicle.remove();
				return;
			}
		}
		
		@EventHandler
		public void onSeatHit(PlayerInteractEvent event) {
			Entity vehicle = event.getPlayer().getVehicle();
			block = (SpoutBlock) event.getClickedBlock();
			player = event.getPlayer();

			
			// Let players stand up on block hit.
			if(event.hasBlock() && (Methods.isChair(block) || Methods.isThrone(block)) && event.getAction() == Action.LEFT_CLICK_BLOCK) {
				if(vehicle != null && vehicle instanceof Item)
				vehicle.remove();

				
				return;
			}
		}
}
