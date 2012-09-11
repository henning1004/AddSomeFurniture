package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.WorktopDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Worktop extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Worktop(AddSomeFurniture plugin,String name, int[] textureids) {
		super(plugin, name, Material.STEP.getId(), new GenericCubeBlockDesign(plugin, plugin.worktop, textureids));
		this.setBlockDesign(new WorktopDesign(plugin, textureids));
		this.setHardness(6F);
		this.plugin = plugin;
	}
}









