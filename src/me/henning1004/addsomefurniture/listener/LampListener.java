package me.henning1004.addsomefurniture.listener;


import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.furniture.Blocks;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class LampListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public SpoutBlock oldblock;
	public SpoutBlock newblock;
	
	public LampListener(AddSomeFurniture plugin) 
	{
	}
	
	@EventHandler
	public void refesh (PlayerJoinEvent event)
	{

	}
	
	@EventHandler
	public void onLampClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.lamp || block.getCustomBlock() == Blocks.lampon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.lamp)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.lampon);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.lamp);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampS || block.getCustomBlock() == Blocks.neonlampSon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampS)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSon);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampS);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampW || block.getCustomBlock() == Blocks.neonlampWon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampW)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWon);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampW);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSred || block.getCustomBlock() == Blocks.neonlampSonred)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSred)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSonred);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSred);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWred || block.getCustomBlock() == Blocks.neonlampWonred)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWred)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWonred);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWred);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSblue || block.getCustomBlock() == Blocks.neonlampSonblue)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSblue)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSonblue);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSblue);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWblue || block.getCustomBlock() == Blocks.neonlampWonblue)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWblue)
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWonblue);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWblue);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSgreen || block.getCustomBlock() == Blocks.neonlampSongreen )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSgreen )
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSongreen );
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampSgreen );
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWgreen  || block.getCustomBlock() == Blocks.neonlampWongreen )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWgreen )
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWongreen );
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(Blocks.neonlampWgreen );
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
	}
}
