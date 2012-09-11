package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.NeonLampDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class NeonLamp extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public NeonLamp(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new NeonLampDesign(plugin, textureids, dir));
		this.setHardness(4F);
		this.plugin = plugin;
	}
}









