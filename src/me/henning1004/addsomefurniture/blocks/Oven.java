package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.OvenDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Oven extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Oven(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, Material.FURNACE.getId(), new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new OvenDesign(plugin, textureids, dir));
		this.setHardness(5F);
		this.plugin = plugin;
	}
}









