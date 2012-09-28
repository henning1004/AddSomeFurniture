package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.BlockDesign;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class QuestionMark extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public QuestionMark(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new BlockDesign(plugin, textureids, dir));
		this.setHardness(2F);
		this.plugin = plugin;
	}
}









