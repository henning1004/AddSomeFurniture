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

public class QuestionListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	
	public QuestionListener(AddSomeFurniture plugin) 
	{
	}
	
	@EventHandler
	public void onMarkClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && (block.getCustomBlock() == Blocks.qmark) && (event.getAction() == Action.RIGHT_CLICK_BLOCK) && (player.getItemInHand() != null)) {
			if(player.hasPermission("asf.action.qmark") || Configuration.confi.getString("NoPermissions").equals("true")){
				event.setCancelled(true);
				player.sendMessage(new StringBuilder().append(ChatColor.GREEN).append("NAME: ").toString() + player.getItemInHand().getType().name() + " / ID: "+ player.getItemInHand().getTypeId() + ":" + player.getItemInHand().getDurability());
			return;
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to use the question mark!");
				return;
			}
		
		}	
	}
}
