package me.henning1004.addsomefurniture.listener;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.furniture.Blocks;
import me.henning1004.addsomefurniture.utils.Methods;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class BlockListener implements Listener
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	public float yaw;
	public Player player;
	public SpoutBlock block;
	
	public BlockListener(AddSomeFurniture plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onChairPlace(BlockPlaceEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock)event.getBlock();
		yaw = player.getLocation().getYaw();
		if (yaw < 0) yaw = yaw+360;
		
		if (block.getCustomBlock() == null) return;
		if (block.getCustomBlock() == Blocks.woodchairN || block.getCustomBlock() == Blocks.woodchairE || block.getCustomBlock() == Blocks.woodchairS || block.getCustomBlock() == Blocks.woodchairW) 
		{
			if (yaw >= 225 && yaw < 315) {
				block.setCustomBlock(Blocks.woodchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.woodchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.woodchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.woodchairS);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.ironchairN || block.getCustomBlock() == Blocks.ironchairE || block.getCustomBlock() == Blocks.ironchairS || block.getCustomBlock() == Blocks.ironchairW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.ironchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.ironchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.ironchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.ironchairS);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.goldchairN || block.getCustomBlock() == Blocks.goldchairE || block.getCustomBlock() == Blocks.goldchairS || block.getCustomBlock() == Blocks.goldchairW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.goldchairE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.goldchairN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.goldchairW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.goldchairS);
				return;
			}
			
		}
		
		if (block.getCustomBlock() == Blocks.woodthroneN || block.getCustomBlock() == Blocks.woodthroneE || block.getCustomBlock() == Blocks.woodthroneS || block.getCustomBlock() == Blocks.woodthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.woodthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.woodthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.woodthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.woodthroneS);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.ironthroneN || block.getCustomBlock() == Blocks.ironthroneE || block.getCustomBlock() == Blocks.ironthroneS || block.getCustomBlock() == Blocks.ironthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.ironthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.ironthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.ironthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.ironthroneS);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.goldthroneN || block.getCustomBlock() == Blocks.goldthroneE || block.getCustomBlock() == Blocks.goldthroneS || block.getCustomBlock() == Blocks.goldthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.goldthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.goldthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.goldthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {			
				block.setCustomBlock(Blocks.goldthroneS);
				return;
			}
			
		}
		
		if (block.getCustomBlock() == Blocks.tvN || block.getCustomBlock() == Blocks.tvE || block.getCustomBlock() == Blocks.tvS || block.getCustomBlock() == Blocks.tvW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.tvE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.tvN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.tvW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {			
				block.setCustomBlock(Blocks.tvS);
				return;
			}
			
		}
		
		if (block.getCustomBlock() == Blocks.neonlampS || block.getCustomBlock() == Blocks.neonlampW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampW);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampS);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampS);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.neonlampSon || block.getCustomBlock() == Blocks.neonlampWon) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWon);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSon);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWon);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSon);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.leatherthroneN || block.getCustomBlock() == Blocks.leatherthroneE || block.getCustomBlock() == Blocks.leatherthroneS || block.getCustomBlock() == Blocks.leatherthroneW) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.leatherthroneE);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.leatherthroneN);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.leatherthroneW);
				return;
			}
			if (yaw >= 135 && yaw < 225) {			
				block.setCustomBlock(Blocks.leatherthroneS);
				return;
			}
		}
		
		if (block.getCustomBlock() == Blocks.neonlampSred  || block.getCustomBlock() == Blocks.neonlampWred ) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWred );
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSred );
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWred );
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSred );
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.neonlampSonred || block.getCustomBlock() == Blocks.neonlampWonred ) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWonred );
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSonred );
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWonred );
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSonred );
				return;
			}
		}
		
		if (block.getCustomBlock() == Blocks.neonlampSblue || block.getCustomBlock() == Blocks.neonlampWblue) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWblue);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSblue);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWblue);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSblue);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.neonlampSonblue || block.getCustomBlock() == Blocks.neonlampWonblue) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWonblue);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSonblue);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWonblue);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSonblue);
				return;
			}
			
		}
		
		if (block.getCustomBlock() == Blocks.neonlampSgreen || block.getCustomBlock() == Blocks.neonlampWgreen) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWgreen);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSgreen);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWgreen);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSgreen);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.neonlampSongreen || block.getCustomBlock() == Blocks.neonlampWongreen) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.neonlampWongreen);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.neonlampSongreen);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.neonlampWongreen);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.neonlampSongreen);
				return;
			}
			
		}
		if (block.getCustomBlock() == Blocks.flowerbox1S || block.getCustomBlock() == Blocks.flowerbox1W || block.getCustomBlock() == Blocks.flowerbox1E || block.getCustomBlock() == Blocks.flowerbox1N) 
		{
			if (yaw >= 225 && yaw < 315) {				
				block.setCustomBlock(Blocks.flowerbox1E);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(Blocks.flowerbox1N);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(Blocks.flowerbox1W);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(Blocks.flowerbox1S);
				return;
			}
			
		}
	}

	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onChairBreak(BlockBreakEvent event)
	{
		block = (SpoutBlock) event.getBlock();
		if(Methods.isBarStool(block) || Methods.isSimpleChair(block) || Methods.isWoodChair(block) || Methods.isIronChair(block) || Methods.isGoldChair(block) || Methods.isWoodThrone(block) || Methods.isIronThrone(block) || Methods.isGoldThrone(block))
		{
			Item drop = Methods.dropSeat((SpoutBlock) event.getBlock());
			
			for(Entity e : drop.getNearbyEntities(0.2, 0.2, 0.2)) {
				if(e != null && e instanceof Item && e.getPassenger() != null)
					e.remove();
			}
			
			drop.remove();
			return;
		}
		else return;
			
	}
}

