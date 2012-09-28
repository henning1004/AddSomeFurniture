package me.henning1004.addsomefurniture.blocks;

import me.henning1004.addsomefurniture.AddSomeFurniture;
import me.henning1004.addsomefurniture.design.PsychoTableDesign;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoTable extends GenericCubeCustomBlock 
{
	public PsychoTable(AddSomeFurniture plugin, String name, int[] textureids)
	{
		super(plugin, name, Material.FENCE.getId(), new GenericCubeBlockDesign(plugin, plugin.table,textureids));
		this.setBlockDesign(new PsychoTableDesign(plugin, textureids));
		this.setHardness(3F);
	}
}









