package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.CarpetDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Carpet extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Carpet(AddSomeFurniture plugin,String name, int[] textureids) {
		super(plugin, name, Material.RAILS.getId(), new GenericCubeBlockDesign(plugin, plugin.carpet, textureids));
		this.setBlockDesign(new CarpetDesign(plugin, textureids));
		this.setHardness(3F);
		this.plugin = plugin;
	}
}









