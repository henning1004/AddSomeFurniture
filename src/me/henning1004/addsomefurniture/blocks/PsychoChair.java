package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.PsychoChairDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoChair extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public PsychoChair(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, Material.WOOD_STAIRS.getId(), new GenericCubeBlockDesign(plugin, plugin.chair,textureids));
		this.setBlockDesign(new PsychoChairDesign(plugin, textureids, dir));
		this.setHardness(3F);
		this.plugin = plugin;
	}
}

