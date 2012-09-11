package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.AddSomeFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class FlowerDesign extends GenericBlockDesign
{
	public FlowerDesign(AddSomeFurniture plugin, int[] textureids)
	{
		texture = plugin.other;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(22);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		
        Quad tops1 = new Quad(1, subTex1);
        tops1.addVertex(0, 0F, 1F, 1F);
        tops1.addVertex(1, 1F, 1F, 0F);
        tops1.addVertex(2, 1F, 0F, 0F);
        tops1.addVertex(3, 0F, 0F, 1F);
        
        Quad tops2 = new Quad(2, subTex1);
        tops2.addVertex(0, 1F, 1F, 0F);
        tops2.addVertex(1, 0F, 1F, 1F);
        tops2.addVertex(2, 0F, 0F, 1F);
        tops2.addVertex(3, 1F, 0F, 0F);
        
        Quad tops3 = new Quad(3, subTex1);
        tops3.addVertex(0, 0F, 1F, 0F);
        tops3.addVertex(1, 1F, 1F, 1F);
        tops3.addVertex(2, 1F, 0F, 1F);
        tops3.addVertex(3, 0F, 0F, 0F);
        
        Quad tops4 = new Quad(4, subTex1);
        tops4.addVertex(0, 1F, 1F, 1F);
        tops4.addVertex(1, 0F, 1F, 0F);
        tops4.addVertex(2, 0F, 0F, 0F);
        tops4.addVertex(3, 1F, 0F, 1F);
        
        
        setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4);
		
}
}
