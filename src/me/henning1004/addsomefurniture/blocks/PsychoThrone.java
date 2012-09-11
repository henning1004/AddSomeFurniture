package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.PsychoThroneDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoThrone extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public PsychoThrone(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, Material.SMOOTH_STAIRS.getId(), new GenericCubeBlockDesign(plugin, plugin.throne, textureids));
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids, dir));
		this.setHardness(4F);
		this.plugin = plugin;
	}
}

