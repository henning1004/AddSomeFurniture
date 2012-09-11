package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.BarstoolDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;


public class Barstool extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Barstool(AddSomeFurniture plugin,String name, int[] textureids) 
	{
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new BarstoolDesign(plugin, textureids));
		this.setHardness(1.5F);
		this.plugin = plugin;
	}
	
}

