package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.AddSomeFurniture;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class FlowerBoxDesign extends GenericBlockDesign
{
	public FlowerBoxDesign(AddSomeFurniture plugin, int[] textureids, String dir)
	{
		texture = plugin.other;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(22);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		SubTexture subTex2 = texture.getSubTexture(textureids[1]);
		SubTexture subTex3 = texture.getSubTexture(textureids[2]);
		SubTexture subTex4 = texture.getSubTexture(textureids[3]);
		SubTexture subTex5 = texture.getSubTexture(textureids[4]);
		
		if ( dir == "W")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(0, 0F, 1F, 0F);
	        oben.addVertex(1, 0F, 1F, 1F);
	        oben.addVertex(2, 0.3F, 1F, 1F);
	        oben.addVertex(3, 0.3F, 1F, 0F);
	        
	        Quad unten = new Quad(1, subTex3);
			unten.addVertex(0, 0F, 0.7F, 1F);
			unten.addVertex(1, 0F, 0.7F, 0F);
			unten.addVertex(2, 0.3F, 0.7F, 0F);
			unten.addVertex(3, 0.3F, 0.7F, 1F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 0F, 1F, 0F);
	        tops1.addVertex(1, 0.3F, 1F, 0F);
	        tops1.addVertex(2, 0.3F, 0.7F, 0F);
	        tops1.addVertex(3, 0F, 0.7F, 0F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(0, 0.3F, 1F, 1F);
	        tops2.addVertex(1, 0F, 1F, 1F);
	        tops2.addVertex(2, 0F, 0.7F, 1F);
	        tops2.addVertex(3, 0.3F, 0.7F, 1F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(0, 0F, 1F, 1F);
	        tops3.addVertex(1, 0F, 1F, 0F);
	        tops3.addVertex(2, 0F, 0.7F, 0F);
	        tops3.addVertex(3, 0F, 0.7F, 1F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(0, 0.3F, 1F, 0F);
	        tops4.addVertex(1, 0.3F, 1F, 1F);
	        tops4.addVertex(2, 0.3F, 0.7F, 1F);
	        tops4.addVertex(3, 0.3F, 0.7F, 0F);
	        
	        Quad flow11 = new Quad(6, subTex4);
	        flow11.addVertex(0, -0.35F, 1.8F, 0.85F);
	        flow11.addVertex(1, 0.65F, 1.8F, -0.15F);
	        flow11.addVertex(2, 0.65F, 1F, -0.15F);
	        flow11.addVertex(3, -0.35F, 1F, 0.85F);
	        
	        Quad flow12 = new Quad(7, subTex4);
	        flow12.addVertex(1, -0.35F, 1.8F, 0.85F);
	        flow12.addVertex(0, 0.65F, 1.8F, -0.15F);
	        flow12.addVertex(3, 0.65F, 1F, -0.15F);
	        flow12.addVertex(2, -0.35F, 1F, 0.85F);
	        
	        Quad flow13 = new Quad(8, subTex4);
	        flow13.addVertex(0, -0.35F, 1.8F, -0.15F);
	        flow13.addVertex(1, 0.65F, 1.8F, 0.85F);
	        flow13.addVertex(2, 0.65F, 1F, 0.85F);
	        flow13.addVertex(3, -0.35F, 1F, -0.15F);
	        
	        Quad flow14 = new Quad(9, subTex4);
	        flow14.addVertex(1, -0.35F, 1.8F, -0.15F);
	        flow14.addVertex(0, 0.65F, 1.8F, 0.85F);
	        flow14.addVertex(3, 0.65F, 1F, 0.85F);
	        flow14.addVertex(2, -0.35F, 1F, -0.15F);
	        
	        Quad flow21 = new Quad(10, subTex5);
	        flow21.addVertex(0, -0.35F, 1.8F, 1.05F);
	        flow21.addVertex(1, 0.65F, 1.8F, 0.35F);
	        flow21.addVertex(2, 0.65F, 1F, 0.35F);
	        flow21.addVertex(3, -0.35F, 1F, 1.05F);
	        
	        Quad flow22 = new Quad(11, subTex5);
	        flow22.addVertex(1, -0.35F, 1.8F, 1.05F);
	        flow22.addVertex(0, 0.65F, 1.8F, 0.35F);
	        flow22.addVertex(3, 0.65F, 1F, 0.35F);
	        flow22.addVertex(2, -0.35F, 1F, 1.05F);
	        
	        Quad flow23 = new Quad(12, subTex5);
	        flow23.addVertex(0, -0.35F, 1.8F, 0.35F);
	        flow23.addVertex(1, 0.65F, 1.8F, 1.05F);
	        flow23.addVertex(2, 0.65F, 1F, 1.05F);
	        flow23.addVertex(3, -0.35F, 1F, 0.35F);
	        
	        Quad flow24 = new Quad(13, subTex5);
	        flow24.addVertex(1, -0.35F, 1.8F, 0.35F);
	        flow24.addVertex(0, 0.65F, 1.8F, 1.05F);
	        flow24.addVertex(3, 0.65F, 1F, 1.05F);
	        flow24.addVertex(2, -0.35F, 1F, 0.35F);

        
        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(flow11).setQuad(flow12).setQuad(flow13).setQuad(flow14).setQuad(flow21).setQuad(flow22).setQuad(flow23).setQuad(flow24);
		}
		
		if ( dir == "S")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(3, 0F, 1F, 0F);
	        oben.addVertex(2, 1F, 1F, 0F);
	        oben.addVertex(1, 1F, 1F, 0.3F);
	        oben.addVertex(0, 0F, 1F, 0.3F);
	        
	        Quad unten = new Quad(1, subTex3);
			unten.addVertex(3, 1F, 0.7F, 0F);
			unten.addVertex(2, 0F, 0.7F, 0F);
			unten.addVertex(1, 0F, 0.7F, 0.3F);
			unten.addVertex(0, 1F, 0.7F, 0.3F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(3, 0F, 1F, 0F);
	        tops1.addVertex(2, 0F, 1F, 0.3F);
	        tops1.addVertex(1, 0F, 0.7F, 0.3F);
	        tops1.addVertex(0, 0F, 0.7F, 0F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(3, 1F, 1F, 0.3F);
	        tops2.addVertex(2, 1F, 1F, 0F);
	        tops2.addVertex(1, 1F, 0.7F, 0F);
	        tops2.addVertex(0, 1F, 0.7F, 0.3F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(3, 1F, 1F, 0F);
	        tops3.addVertex(2, 0F, 1F, 0F);
	        tops3.addVertex(1, 0F, 0.7F, 0F);
	        tops3.addVertex(0, 1F, 0.7F, 0F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(3, 0F, 1F, 0.3F);
	        tops4.addVertex(2, 1F, 1F, 0.3F);
	        tops4.addVertex(1, 1F, 0.7F, 0.3F);
	        tops4.addVertex(0, 0F, 0.7F, 0.3F);
	        
	        Quad flow11 = new Quad(6, subTex4);
	        flow11.addVertex(0, 0.85F, 1.8F, -0.35F);
	        flow11.addVertex(1, -0.15F, 1.8F, 0.65F);
	        flow11.addVertex(2, -0.15F, 1F, 0.65F);
	        flow11.addVertex(3, 0.85F, 1F, -0.35F);
	        
	        Quad flow12 = new Quad(7, subTex4);
	        flow12.addVertex(1, 0.85F, 1.8F, -0.35F);
	        flow12.addVertex(0, -0.15F, 1.8F, 0.65F);
	        flow12.addVertex(3, -0.15F, 1F, 0.65F);
	        flow12.addVertex(2, 0.85F, 1F, -0.35F);
	        
	        Quad flow13 = new Quad(8, subTex4);
	        flow13.addVertex(0, -0.15F, 1.8F, -0.35F);
	        flow13.addVertex(1, 0.85F, 1.8F, 0.65F);
	        flow13.addVertex(2, 0.85F, 1F, 0.65F);
	        flow13.addVertex(3, -0.15F, 1F, -0.35F);
	        
	        Quad flow14 = new Quad(9, subTex4);
	        flow14.addVertex(1, -0.15F, 1.8F, -0.35F);
	        flow14.addVertex(0, 0.85F, 1.8F, 0.65F);
	        flow14.addVertex(3, 0.85F, 1F, 0.65F);
	        flow14.addVertex(2, -0.15F, 1F, -0.35F);
	        
	        Quad flow21 = new Quad(10, subTex5);
	        flow21.addVertex(0, 1.05F, 1.8F, -0.35F);
	        flow21.addVertex(1, 0.35F, 1.8F, 0.65F);
	        flow21.addVertex(2, 0.35F, 1F, 0.65F);
	        flow21.addVertex(3, 1.05F, 1F, -0.35F);
	        
	        Quad flow22 = new Quad(11, subTex5);
	        flow22.addVertex(1, 1.05F, 1.8F, -0.35F);
	        flow22.addVertex(0, 0.35F, 1.8F, 0.65F);
	        flow22.addVertex(3, 0.35F, 1F, 0.65F);
	        flow22.addVertex(2, 1.05F, 1F, -0.35F);
	        
	        Quad flow23 = new Quad(12, subTex5);
	        flow23.addVertex(0, 0.35F, 1.8F, -0.35F);
	        flow23.addVertex(1, 1.05F, 1.8F, 0.65F);
	        flow23.addVertex(2, 1.05F, 1F,0.65F );
	        flow23.addVertex(3, 0.35F, 1F, -0.35F);
	        
	        Quad flow24 = new Quad(13, subTex5);
	        flow24.addVertex(1, 0.35F, 1.8F, -0.35F);
	        flow24.addVertex(0, 1.05F, 1.8F, 0.65F);
	        flow24.addVertex(3, 1.05F, 1F, 0.65F);
	        flow24.addVertex(2, 0.35F, 1F, -0.35F);

     
        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(flow11).setQuad(flow12).setQuad(flow13).setQuad(flow14).setQuad(flow21).setQuad(flow22).setQuad(flow23).setQuad(flow24);
		}
		
		if ( dir == "E")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(0, 1F, 1F, 1F);
	        oben.addVertex(1, 1F, 1F, 0F);
	        oben.addVertex(2, 0.7F, 1F, 0F);
	        oben.addVertex(3, 0.7F, 1F, 1F);
	        
	        Quad unten = new Quad(1, subTex3);
			unten.addVertex(0, 1F, 0.7F, 0F);
			unten.addVertex(1, 1F, 0.7F, 1F);
			unten.addVertex(2, 0.7F, 0.7F, 1F);
			unten.addVertex(3, 0.7F, 0.7F, 0F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(0, 1F, 1F, 1F);
	        tops1.addVertex(1, 0.7F, 1F, 1F);
	        tops1.addVertex(2, 0.7F, 0.7F, 1F);
	        tops1.addVertex(3, 1F, 0.7F, 1F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(0, 0.7F, 1F, 0F);
	        tops2.addVertex(1, 1F, 1F, 0F);
	        tops2.addVertex(2, 1F, 0.7F, 0F);
	        tops2.addVertex(3, 0.7F, 0.7F, 0F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(0, 1F, 1F, 0F);
	        tops3.addVertex(1, 1F, 1F, 1F);
	        tops3.addVertex(2, 1F, 0.7F, 1F);
	        tops3.addVertex(3, 1F, 0.7F, 0F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(0, 0.7F, 1F, 1F);
	        tops4.addVertex(1, 0.7F, 1F, 0F);
	        tops4.addVertex(2, 0.7F, 0.7F, 0F);
	        tops4.addVertex(3, 0.7F, 0.7F, 1F);
	        
	        Quad flow11 = new Quad(6, subTex4);
	        flow11.addVertex(0, 0.5F, 1.8F, 0.85F);
	        flow11.addVertex(1, 1.2F, 1.8F, -0.15F);
	        flow11.addVertex(2, 1.2F, 1F, -0.15F);
	        flow11.addVertex(3, 0.5F, 1F, 0.85F);
	        
	        Quad flow12 = new Quad(7, subTex4);
	        flow12.addVertex(1, 0.5F, 1.8F, 0.85F);
	        flow12.addVertex(0, 1.2F, 1.8F, -0.15F);
	        flow12.addVertex(3, 1.2F, 1F, -0.15F);
	        flow12.addVertex(2, 0.5F, 1F, 0.85F);
	        
	        Quad flow13 = new Quad(8, subTex4);
	        flow13.addVertex(0, 0.5F, 1.8F, -0.15F);
	        flow13.addVertex(1, 1.2F, 1.8F, 0.85F);
	        flow13.addVertex(2, 1.2F, 1F, 0.85F);
	        flow13.addVertex(3, 0.5F, 1F, -0.15F);
	        
	        Quad flow14 = new Quad(9, subTex4);
	        flow14.addVertex(1, 0.5F, 1.8F, -0.15F);
	        flow14.addVertex(0, 1.2F, 1.8F, 0.85F);
	        flow14.addVertex(3, 1.2F, 1F, 0.85F);
	        flow14.addVertex(2, 0.5F, 1F, -0.15F);
	        
	        Quad flow21 = new Quad(10, subTex5);
	        flow21.addVertex(0, 0.5F, 1.8F, 1.05F);
	        flow21.addVertex(1, 1.2F, 1.8F, 0.35F);
	        flow21.addVertex(2, 1.2F, 1F, 0.35F);
	        flow21.addVertex(3, 0.5F, 1F, 1.05F);
	        
	        Quad flow22 = new Quad(11, subTex5);
	        flow22.addVertex(1, 0.5F, 1.8F, 1.05F);
	        flow22.addVertex(0, 1.2F, 1.8F, 0.35F);
	        flow22.addVertex(3, 1.2F, 1F, 0.35F);
	        flow22.addVertex(2, 0.5F, 1F, 1.05F);
	        
	        Quad flow23 = new Quad(12, subTex5);
	        flow23.addVertex(0, 0.5F, 1.8F, 0.35F);
	        flow23.addVertex(1, 1.2F, 1.8F, 1.05F);
	        flow23.addVertex(2, 1.2F, 1F, 1.05F);
	        flow23.addVertex(3, 0.5F, 1F, 0.35F);
	        
	        Quad flow24 = new Quad(13, subTex5);
	        flow24.addVertex(1, 0.5F, 1.8F, 0.35F);
	        flow24.addVertex(0, 1.2F, 1.8F, 1.05F);
	        flow24.addVertex(3, 1.2F, 1F, 1.05F);
	        flow24.addVertex(2, 0.5F, 1F, 0.35F);

        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(flow11).setQuad(flow12).setQuad(flow13).setQuad(flow14).setQuad(flow21).setQuad(flow22).setQuad(flow23).setQuad(flow24);
		}
		
		if ( dir == "N")
		{
			Quad oben = new Quad(0, subTex1);
	        oben.addVertex(3, 1F, 1F, 1F);
	        oben.addVertex(2, 0F, 1F, 1F);
	        oben.addVertex(1, 0F, 1F, 0.7F);
	        oben.addVertex(0, 1F, 1F, 0.7F);
	        
	        Quad unten = new Quad(1, subTex3);
			unten.addVertex(3, 0F, 0.7F, 1F);
			unten.addVertex(2, 1F, 0.7F, 1F);
			unten.addVertex(1, 1F, 0.7F, 0.7F);
			unten.addVertex(0, 0F, 0.7F, 0.7F);
			
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(3, 1F, 1F, 1F);
	        tops1.addVertex(2, 1F, 1F, 0.7F);
	        tops1.addVertex(1, 1F, 0.7F, 0.7F);
	        tops1.addVertex(0, 1F, 0.7F, 1F);
	        
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(3, 0F, 1F, 0.7F);
	        tops2.addVertex(2, 0F, 1F, 1F);
	        tops2.addVertex(1, 0F, 0.7F, 1F);
	        tops2.addVertex(0, 0F, 0.7F, 0.7F);
	        
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(3, 0F, 1F, 1F);
	        tops3.addVertex(2, 1F, 1F, 1F);
	        tops3.addVertex(1, 1F, 0.7F, 1F);
	        tops3.addVertex(0, 0F, 0.7F, 1F);
	        
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(3, 1F, 1F, 0.7F);
	        tops4.addVertex(2, 0F, 1F, 0.7F);
	        tops4.addVertex(1, 0F, 0.7F, 0.7F);
	        tops4.addVertex(0, 1F, 0.7F, 0.7F);
	        
	        Quad flow11 = new Quad(6, subTex4);
	        flow11.addVertex(0, 0.85F, 1.8F, 0.5F);
	        flow11.addVertex(1, -0.15F, 1.8F, 1.2F);
	        flow11.addVertex(2, -0.15F, 1F, 1.2F);
	        flow11.addVertex(3, 0.85F, 1F, 0.5F);
	        
	        Quad flow12 = new Quad(7, subTex4);
	        flow12.addVertex(1, 0.85F, 1.8F, 0.5F);
	        flow12.addVertex(0, -0.15F, 1.8F, 1.2F);
	        flow12.addVertex(3, -0.15F, 1F, 1.2F);
	        flow12.addVertex(2, 0.85F, 1F, 0.5F);
	        
	        Quad flow13 = new Quad(8, subTex4);
	        flow13.addVertex(0, -0.15F, 1.8F, 0.5F);
	        flow13.addVertex(1, 0.85F, 1.8F, 1.2F);
	        flow13.addVertex(2, 0.85F, 1F, 1.2F);
	        flow13.addVertex(3, -0.15F, 1F, 0.5F);
	        
	        Quad flow14 = new Quad(9, subTex4);
	        flow14.addVertex(1, -0.15F, 1.8F, 0.5F);
	        flow14.addVertex(0, 0.85F, 1.8F, 1.2F);
	        flow14.addVertex(3, 0.85F, 1F, 1.2F);
	        flow14.addVertex(2, -0.15F, 1F, 0.5F);
	        
	        Quad flow21 = new Quad(10, subTex5);
	        flow21.addVertex(0, 1.05F, 1.8F, 0.5F);
	        flow21.addVertex(1, 0.35F, 1.8F, 1.2F);
	        flow21.addVertex(2, 0.35F, 1F, 1.2F);
	        flow21.addVertex(3, 1.05F, 1F, 0.5F);
	        
	        Quad flow22 = new Quad(11, subTex5);
	        flow22.addVertex(1, 1.05F, 1.8F, 0.5F);
	        flow22.addVertex(0, 0.35F, 1.8F, 1.2F);
	        flow22.addVertex(3, 0.35F, 1F, 1.2F);
	        flow22.addVertex(2, 1.05F, 1F, 0.5F);
	        
	        Quad flow23 = new Quad(12, subTex5);
	        flow23.addVertex(0, 0.35F, 1.8F, 0.5F);
	        flow23.addVertex(1, 1.05F, 1.8F, 1.2F);
	        flow23.addVertex(2, 1.05F, 1F, 1.2F );
	        flow23.addVertex(3, 0.35F, 1F, 0.5F);
	        
	        Quad flow24 = new Quad(13, subTex5);
	        flow24.addVertex(1, 0.35F, 1.8F, 0.5F);
	        flow24.addVertex(0, 1.05F, 1.8F, 1.2F);
	        flow24.addVertex(3, 1.05F, 1F, 1.2F);
	        flow24.addVertex(2, 0.35F, 1F, 0.5F);

     
        
	        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(flow11).setQuad(flow12).setQuad(flow13).setQuad(flow14).setQuad(flow21).setQuad(flow22).setQuad(flow23).setQuad(flow24);
		}
}
}
