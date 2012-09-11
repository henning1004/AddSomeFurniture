package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.SimpleChairDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class SimpleChair extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public SimpleChair(AddSomeFurniture plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids));
		this.setHardness(1.5F);
		this.plugin = plugin;
	}
}

