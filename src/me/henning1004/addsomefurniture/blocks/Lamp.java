package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.LampDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Lamp extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Lamp(AddSomeFurniture plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new LampDesign(plugin, textureids));
		this.setHardness(4F);
		this.plugin = plugin;
	}
}









