package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.AddSomeFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class OvenDesign extends GenericBlockDesign
{
	public OvenDesign(AddSomeFurniture plugin, int[] textureids, String dir)
	{
		texture = plugin.other;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(22);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		SubTexture subTex2 = texture.getSubTexture(textureids[1]);
		SubTexture subTex3 = texture.getSubTexture(textureids[2]);
		SubTexture subTex4 = texture.getSubTexture(textureids[3]);
		SubTexture subTex5 = texture.getSubTexture(textureids[4]);
		
		if ( dir == "S")
		{
        Quad oben = new Quad(0, subTex1);
        oben.addVertex(0, 0F, 1F, 0F);
        oben.addVertex(1, 0F, 1F, 1F);
        oben.addVertex(2, 1F, 1F, 1F);
        oben.addVertex(3, 1F, 1F, 0F);
        
        Quad unten = new Quad(1, subTex4);
		unten.addVertex(0, 0F, 0F, 1F);
		unten.addVertex(1, 0F, 0F, 0F);
		unten.addVertex(2, 1F, 0F, 0F);
		unten.addVertex(3, 1F, 0F, 1F);
		
        Quad tops1 = new Quad(2, subTex3);
        tops1.addVertex(0, 0F, 1F, 1F);
        tops1.addVertex(1, 0F, 0F, 1F);
        tops1.addVertex(2, 1F, 0F, 1F);
        tops1.addVertex(3, 1F, 1F, 1F);
        
        Quad tops2 = new Quad(3, subTex2);
        tops2.addVertex(0, 1F, 1F, 1F);
        tops2.addVertex(1, 1F, 0F, 1F);
        tops2.addVertex(2, 1F, 0F, 0F);
        tops2.addVertex(3, 1F, 1F, 0F);
        
        Quad tops3 = new Quad(4, subTex2);
        tops3.addVertex(0, 1F, 1F, 0F);
        tops3.addVertex(1, 1F, 0F, 0F);
        tops3.addVertex(2, 0F, 0F, 0F);
        tops3.addVertex(3, 0F, 1F, 0F);
        
        Quad tops4 = new Quad(5, subTex2);
        tops4.addVertex(0, 0F, 1F, 0F);
        tops4.addVertex(1, 0F, 0F, 0F);
        tops4.addVertex(2, 0F, 0F, 1F);
        tops4.addVertex(3, 0F, 1F, 1F);
        
        Quad ptop1 = new Quad(5, subTex5);
        ptop1.addVertex(0, 0.1F, 1.1F, 0.1F);
        ptop1.addVertex(1, 0.1F, 1.1F, 0.45F);
        ptop1.addVertex(2, 0.45F, 1.1F, 0.45F);
        ptop1.addVertex(3, 0.45F, 1.1F, 0.1F);
          
        
        
        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(ptop1);
		}
		
		if ( dir == "W")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(1, 0F, 1F, 0F);
	        oben.addVertex(2, 0F, 1F, 1F);
	        oben.addVertex(3, 1F, 1F, 1F);
	        oben.addVertex(0, 1F, 1F, 0F);
	        
	        Quad unten = new Quad(1, subTex4);
			unten.addVertex(0, 0F, 0F, 1F);
			unten.addVertex(1, 0F, 0F, 0F);
			unten.addVertex(2, 1F, 0F, 0F);
			unten.addVertex(3, 1F, 0F, 1F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 0F, 1F, 1F);
	        tops1.addVertex(1, 0F, 0F, 1F);
	        tops1.addVertex(2, 1F, 0F, 1F);
	        tops1.addVertex(3, 1F, 1F, 1F);
	        
	        Quad tops2 = new Quad(3, subTex3);
	        tops2.addVertex(0, 1F, 1F, 1F);
	        tops2.addVertex(1, 1F, 0F, 1F);
	        tops2.addVertex(2, 1F, 0F, 0F);
	        tops2.addVertex(3, 1F, 1F, 0F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(0, 1F, 1F, 0F);
	        tops3.addVertex(1, 1F, 0F, 0F);
	        tops3.addVertex(2, 0F, 0F, 0F);
	        tops3.addVertex(3, 0F, 1F, 0F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(0, 0F, 1F, 0F);
	        tops4.addVertex(1, 0F, 0F, 0F);
	        tops4.addVertex(2, 0F, 0F, 1F);
	        tops4.addVertex(3, 0F, 1F, 1F);
	        
	        Quad ptop1 = new Quad(5, subTex5);
	        ptop1.addVertex(0, 0.1F, 1.1F, 0.1F);
	        ptop1.addVertex(1, 0.1F, 1.1F, 0.45F);
	        ptop1.addVertex(2, 0.45F, 1.1F, 0.45F);
	        ptop1.addVertex(3, 0.45F, 1.1F, 0.1F);
	        
	        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(ptop1);
		}
		
		if ( dir == "N")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(1, 0F, 1F, 0F);
	        oben.addVertex(2, 0F, 1F, 1F);
	        oben.addVertex(3, 1F, 1F, 1F);
	        oben.addVertex(0, 1F, 1F, 0F);
	        
	        Quad unten = new Quad(1, subTex4);
			unten.addVertex(0, 0F, 0F, 1F);
			unten.addVertex(1, 0F, 0F, 0F);
			unten.addVertex(2, 1F, 0F, 0F);
			unten.addVertex(3, 1F, 0F, 1F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 0F, 1F, 1F);
	        tops1.addVertex(1, 0F, 0F, 1F);
	        tops1.addVertex(2, 1F, 0F, 1F);
	        tops1.addVertex(3, 1F, 1F, 1F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(0, 1F, 1F, 1F);
	        tops2.addVertex(1, 1F, 0F, 1F);
	        tops2.addVertex(2, 1F, 0F, 0F);
	        tops2.addVertex(3, 1F, 1F, 0F);
	        
	        Quad tops3 = new Quad(4, subTex3);
	        tops3.addVertex(0, 1F, 1F, 0F);
	        tops3.addVertex(1, 1F, 0F, 0F);
	        tops3.addVertex(2, 0F, 0F, 0F);
	        tops3.addVertex(3, 0F, 1F, 0F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(0, 0F, 1F, 0F);
	        tops4.addVertex(1, 0F, 0F, 0F);
	        tops4.addVertex(2, 0F, 0F, 1F);
	        tops4.addVertex(3, 0F, 1F, 1F);
	        
	        Quad ptop1 = new Quad(5, subTex5);
	        ptop1.addVertex(0, 0.1F, 1.1F, 0.1F);
	        ptop1.addVertex(1, 0.1F, 1.1F, 0.45F);
	        ptop1.addVertex(2, 0.45F, 1.1F, 0.45F);
	        ptop1.addVertex(3, 0.45F, 1.1F, 0.1F);
	        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(ptop1);
		}
		
		if ( dir == "E")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(1, 0F, 1F, 0F);
	        oben.addVertex(2, 0F, 1F, 1F);
	        oben.addVertex(3, 1F, 1F, 1F);
	        oben.addVertex(0, 1F, 1F, 0F);
	        
	        Quad unten = new Quad(1, subTex4);
			unten.addVertex(0, 0F, 0F, 1F);
			unten.addVertex(1, 0F, 0F, 0F);
			unten.addVertex(2, 1F, 0F, 0F);
			unten.addVertex(3, 1F, 0F, 1F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 0F, 1F, 1F);
	        tops1.addVertex(1, 0F, 0F, 1F);
	        tops1.addVertex(2, 1F, 0F, 1F);
	        tops1.addVertex(3, 1F, 1F, 1F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(0, 1F, 1F, 1F);
	        tops2.addVertex(1, 1F, 0F, 1F);
	        tops2.addVertex(2, 1F, 0F, 0F);
	        tops2.addVertex(3, 1F, 1F, 0F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(0, 1F, 1F, 0F);
	        tops3.addVertex(1, 1F, 0F, 0F);
	        tops3.addVertex(2, 0F, 0F, 0F);
	        tops3.addVertex(3, 0F, 1F, 0F);
	        
	        Quad tops4 = new Quad(5, subTex3);
	        tops4.addVertex(0, 0F, 1F, 0F);
	        tops4.addVertex(1, 0F, 0F, 0F);
	        tops4.addVertex(2, 0F, 0F, 1F);
	        tops4.addVertex(3, 0F, 1F, 1F);
	        
	        Quad ptop1 = new Quad(5, subTex5);
	        ptop1.addVertex(0, 0.1F, 1.1F, 0.1F);
	        ptop1.addVertex(1, 0.1F, 1.1F, 0.45F);
	        ptop1.addVertex(2, 0.45F, 1.1F, 0.45F);
	        ptop1.addVertex(3, 0.45F, 1.1F, 0.1F);
	        
	        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(ptop1);
		}
}
}
