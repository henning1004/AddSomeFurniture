package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.FlowerDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Flower extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private AddSomeFurniture plugin;
	
	public Flower(AddSomeFurniture plugin,String name, int[] textureids) {
		super(plugin, name, Material.STEP.getId(), new GenericCubeBlockDesign(plugin, plugin.other, textureids));
		this.setBlockDesign(new FlowerDesign(plugin, textureids));
		this.setHardness(1F);
		this.plugin = plugin;
	}
}









