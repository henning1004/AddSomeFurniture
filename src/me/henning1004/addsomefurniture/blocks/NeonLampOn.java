package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.NeonLampDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class NeonLampOn extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public NeonLampOn(AddSomeFurniture plugin,String name, int[] textureids, String dir) {
		super(plugin, name, Material.GLASS.getId(), new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new NeonLampDesign(plugin, textureids, dir));
		this.setHardness(4F);
		this.setLightLevel(15);
		this.plugin = plugin;
	}
}









