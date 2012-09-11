package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.AddSomeFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class NeonLampDesign extends GenericBlockDesign
{
	public NeonLampDesign(AddSomeFurniture plugin, int[] textureids, String dir)
	{
		texture = plugin.other;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(22);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		SubTexture subTex2 = texture.getSubTexture(textureids[1]);
		
		if ( dir == "S")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(0, 0.3F, 1F, 0F);
	        oben.addVertex(1, 0.3F, 1F, 1F);
	        oben.addVertex(2, 0.7F, 1F, 1F);
	        oben.addVertex(3, 0.7F, 1F, 0F);
	        
	        Quad unten = new Quad(1, subTex2);
			unten.addVertex(0, 0.3F, 0.8F, 1F);
			unten.addVertex(1, 0.3F, 0.8F, 0F);
			unten.addVertex(2, 0.7F, 0.8F, 0F);
			unten.addVertex(3, 0.7F, 0.8F, 1F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 0.3F, 1F, 0F);
	        tops1.addVertex(1, 0.7F, 1F, 0F);
	        tops1.addVertex(2, 0.7F, 0.8F, 0F);
	        tops1.addVertex(3, 0.3F, 0.8F, 0F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(0, 0.7F, 1F, 1F);
	        tops2.addVertex(1, 0.3F, 1F, 1F);
	        tops2.addVertex(2, 0.3F, 0.8F, 1F);
	        tops2.addVertex(3, 0.7F, 0.8F, 1F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(0, 0.3F, 1F, 1F);
	        tops3.addVertex(1, 0.3F, 1F, 0F);
	        tops3.addVertex(2, 0.3F, 0.8F, 0F);
	        tops3.addVertex(3, 0.3F, 0.8F, 1F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(0, 0.7F, 1F, 0F);
	        tops4.addVertex(1, 0.7F, 1F, 1F);
	        tops4.addVertex(2, 0.7F, 0.8F, 1F);
	        tops4.addVertex(3, 0.7F, 0.8F, 0F);

        
        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4);
		}
		
		if ( dir == "W")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(3, 0F, 1F, 0.3F);
	        oben.addVertex(2, 1F, 1F, 0.3F);
	        oben.addVertex(1, 1F, 1F, 0.7F);
	        oben.addVertex(0, 0F, 1F, 0.7F);
	        
	        Quad unten = new Quad(1, subTex2);
			unten.addVertex(3, 1F, 0.8F, 0.3F);
			unten.addVertex(2, 0F, 0.8F, 0.3F);
			unten.addVertex(1, 0F, 0.8F, 0.7F);
			unten.addVertex(0, 1F, 0.8F, 0.7F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(3, 0F, 1F, 0.3F);
	        tops1.addVertex(2, 0F, 1F, 0.7F);
	        tops1.addVertex(1, 0F, 0.8F, 0.7F);
	        tops1.addVertex(0, 0F, 0.8F, 0.3F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(3, 1F, 1F, 0.7F);
	        tops2.addVertex(2, 1F, 1F, 0.3F);
	        tops2.addVertex(1, 1F, 0.8F, 0.3F);
	        tops2.addVertex(0, 1F, 0.8F, 0.7F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(3, 1F, 1F, 0.3F);
	        tops3.addVertex(2, 0F, 1F, 0.3F);
	        tops3.addVertex(1, 0F, 0.8F, 0.3F);
	        tops3.addVertex(0, 1F, 0.8F, 0.3F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(3, 0F, 1F, 0.7F);
	        tops4.addVertex(2, 1F, 1F, 0.7F);
	        tops4.addVertex(1, 1F, 0.8F, 0.7F);
	        tops4.addVertex(0, 0F, 0.8F, 0.7F);

     
        
        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4);
		}
}
}
