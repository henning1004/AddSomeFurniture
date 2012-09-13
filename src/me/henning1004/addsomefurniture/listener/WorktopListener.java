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
import org.getspout.spoutapi.block.SpoutBlock;

public class WorktopListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	
	public WorktopListener(AddSomeFurniture plugin) 
	{
	}
	
	@EventHandler
	public void onWorktopClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.obsidianworktop || block.getCustomBlock() == Blocks.ironworktop || block.getCustomBlock() == Blocks.goldworktop || block.getCustomBlock() == Blocks.stoneworktop || block.getCustomBlock() == Blocks.craftingworktop || block.getCustomBlock() == Blocks.woodenworktop)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.worktop") || Configuration.confi.getString("NoPermissions").equals("true")){
			player.openWorkbench(null, true);
			return;
			}
			else{
				player.sendMessage(ChatColor.RED + "You are not allowed to use wortops");
				return;
			}
		
		}	
	}
}
