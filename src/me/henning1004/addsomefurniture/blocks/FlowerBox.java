package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.FlowerBoxDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class FlowerBox extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public FlowerBox(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new FlowerBoxDesign(plugin, textureids, dir));
		this.setHardness(3.5F);
		this.plugin = plugin;
	}
}









