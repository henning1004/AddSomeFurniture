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
				block.setCustomBlock(Blocks.lampon);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.lamp);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampS || block.getCustomBlock() == Blocks.neonlampSon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampS)
			{
				block.setCustomBlock(Blocks.neonlampSon);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampS);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampW || block.getCustomBlock() == Blocks.neonlampWon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampW)
			{
				block.setCustomBlock(Blocks.neonlampWon);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampW);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSred || block.getCustomBlock() == Blocks.neonlampSonred)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSred)
			{
				block.setCustomBlock(Blocks.neonlampSonred);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampSred);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWred || block.getCustomBlock() == Blocks.neonlampWonred)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWred)
			{
				block.setCustomBlock(Blocks.neonlampWonred);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampWred);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSblue || block.getCustomBlock() == Blocks.neonlampSonblue)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSblue)
			{
				block.setCustomBlock(Blocks.neonlampSonblue);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampSblue);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWblue || block.getCustomBlock() == Blocks.neonlampWonblue)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWblue)
			{
				block.setCustomBlock(Blocks.neonlampWonblue);
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampWblue);
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampSgreen || block.getCustomBlock() == Blocks.neonlampSongreen )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampSgreen )
			{
				block.setCustomBlock(Blocks.neonlampSongreen );
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampSgreen );
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.neonlampWgreen  || block.getCustomBlock() == Blocks.neonlampWongreen )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == Blocks.neonlampWgreen )
			{
				block.setCustomBlock(Blocks.neonlampWongreen );
				return;
			}
			else
			{
				block.setCustomBlock(Blocks.neonlampWgreen );
				return;
			}
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps");
				return;
			}
		}
		
	}
}
